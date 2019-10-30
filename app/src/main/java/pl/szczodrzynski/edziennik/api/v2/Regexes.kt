/*
 * Copyright (c) Kuba Szczodrzyński 2019-10-6.
 */

package pl.szczodrzynski.edziennik.api.v2

object Regexes {
    val MOBIDZIENNIK_GRADES_SUBJECT_NAME by lazy {
        """<div.*?>\n*\s*(.+?)\s*\n*(?:<.*?)??</div>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val MOBIDZIENNIK_GRADES_COLOR by lazy {
        """background-color:([#A-Fa-f0-9]+);""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val MOBIDZIENNIK_GRADES_CATEGORY by lazy {
        """>&nbsp;(.+?):</span>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val MOBIDZIENNIK_GRADES_CLASS_AVERAGE by lazy {
        """Średnia ocen:.*<strong>([0-9]*\.?[0-9]*)</strong>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val MOBIDZIENNIK_GRADES_ADDED_DATE by lazy {
        """Wpisano:.*<strong>.+?,\s([0-9]+)\s(.+?)\s([0-9]{4}),\sgodzina\s([0-9:]+)</strong>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val MOBIDZIENNIK_GRADES_COUNT_TO_AVG by lazy {
        """Liczona do średniej:.*?<strong>nie<br/?></strong>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val MOBIDZIENNIK_GRADES_DETAILS by lazy {
        """<strong.*?>(.+?)</strong>.*?<sup>.+?</sup>.*?<small>\((.+?)\)</small>.*?<span>.*?Wartość oceny:.*?<strong>([0-9.]+)</strong>.*?Wpisał\(a\):.*?<strong>(.+?)</strong>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }

    val MOBIDZIENNIK_EVENT_TYPE by lazy {
        """\(([0-9A-ząęóżźńśłć]*?)\)$""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val MOBIDZIENNIK_LUCKY_NUMBER by lazy {
        """class="szczesliwy_numerek".*>0*([0-9]+)(?:/0*[0-9]+)*</a>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val MOBIDZIENNIK_CLASS_CALENDAR by lazy {
        """events: (.+),$""".toRegex(RegexOption.MULTILINE)
    }



    val IDZIENNIK_LOGIN_HIDDEN_FIELDS by lazy {
        """<input type="hidden".+?name="([A-z0-9_]+)?".+?value="([A-z0-9_+-/=]+)?".+?>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val IDZIENNIK_LOGIN_ERROR by lazy {
        """id="spanErrorMessage">(.*?)</""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val IDZIENNIK_LOGIN_FIRST_ACCOUNT_NAME by lazy {
        """Imię i nazwisko:.+?">(.+?)</div>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val IDZIENNIK_LOGIN_FIRST_IS_PARENT by lazy {
        """id="ctl00_CzyRodzic" value="([01])" />""".toRegex()
    }
    val IDZIENNIK_LOGIN_FIRST_SCHOOL_YEAR by lazy {
        """name="ctl00\${"$"}dxComboRokSzkolny".+?selected="selected".*?value="([0-9]+)">([0-9/]+)<""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val IDZIENNIK_LOGIN_FIRST_STUDENT_SELECT by lazy {
        """<select.*?name="ctl00\${"$"}dxComboUczniowie".*?</select>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
    val IDZIENNIK_LOGIN_FIRST_STUDENT by lazy {
        """<option.*?value="([0-9]+)"\sdata-id-ucznia="([A-z0-9]+?)".*?>(.+?)\s(.+?)\s*\((.+?),\s*(.+?)\)</option>""".toRegex(RegexOption.DOT_MATCHES_ALL)
    }
}