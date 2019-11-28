/*
 * Copyright (c) Kuba Szczodrzyński 2019-11-26.
 */

package pl.szczodrzynski.edziennik.config

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import pl.szczodrzynski.edziennik.config.db.ConfigEntry
import pl.szczodrzynski.edziennik.config.utils.ConfigMigration
import pl.szczodrzynski.edziennik.config.utils.get
import pl.szczodrzynski.edziennik.config.utils.set
import pl.szczodrzynski.edziennik.config.utils.toHashMap
import pl.szczodrzynski.edziennik.data.db.AppDb
import kotlin.coroutines.CoroutineContext

class Config(val db: AppDb) : CoroutineScope, AbstractConfig {
    companion object {
        const val DATA_VERSION = 1
    }

    private val job = Job()
    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Default

    val values: HashMap<String, String?> = hashMapOf()

    val ui by lazy { ConfigUI(this) }
    val sync by lazy { ConfigSync(this) }
    val timetable by lazy { ConfigTimetable(this) }
    val grades by lazy { ConfigGrades(this) }

    private var mDataVersion: Int? = null
    var dataVersion: Int
        get() { mDataVersion = mDataVersion ?: values.get("dataVersion", 0); return mDataVersion ?: 0 }
        set(value) { set("dataVersion", value); mDataVersion = value }

    private var rawEntries: List<ConfigEntry> = db.configDao().getAllNow()
    private val profileConfigs: HashMap<Int, ProfileConfig> = hashMapOf()
    init {
        rawEntries.toHashMap(-1, values)
        if (dataVersion < DATA_VERSION)
            ConfigMigration(this)
    }
    fun getFor(profileId: Int): ProfileConfig {
        return profileConfigs[profileId] ?: ProfileConfig(db, profileId, rawEntries)
    }

    fun setProfile(profileId: Int) {
    }

    override fun set(key: String, value: String?) {
        values[key] = value
        launch {
            db.configDao().add(ConfigEntry(-1, key, value))
        }
    }
}