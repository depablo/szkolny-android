/*
 * Copyright (c) Kuba Szczodrzyński 2019-9-19.
 */

package pl.szczodrzynski.edziennik.api.v2

import android.os.Build

const val GET = 0
const val POST = 1

val SYSTEM_USER_AGENT = System.getProperty("http.agent") ?: "Dalvik/2.1.0 Android"

val LIBRUS_USER_AGENT = "$SYSTEM_USER_AGENT LibrusMobileApp"
const val SYNERGIA_USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) Gecko/20100101 Firefox/62.0"
const val LIBRUS_CLIENT_ID = "wmSyUMo8llDAs4y9tJVYY92oyZ6h4lAt7KCuy0Gv"
const val LIBRUS_REDIRECT_URL = "http://localhost/bar"
const val LIBRUS_AUTHORIZE_URL = "https://portal.librus.pl/oauth2/authorize?client_id=$LIBRUS_CLIENT_ID&redirect_uri=$LIBRUS_REDIRECT_URL&response_type=code"
const val LIBRUS_LOGIN_URL = "https://portal.librus.pl/rodzina/login/action"
const val LIBRUS_TOKEN_URL = "https://portal.librus.pl/oauth2/access_token"

const val LIBRUS_ACCOUNT_URL = "https://portal.librus.pl/api/v2/SynergiaAccounts/fresh/" // + login
const val LIBRUS_ACCOUNTS_URL = "https://portal.librus.pl/api/v2/SynergiaAccounts"

/** https://api.librus.pl/2.0 */
const val LIBRUS_API_URL = "https://api.librus.pl/2.0"
/** https://api.librus.pl/OAuth/Token */
const val LIBRUS_API_TOKEN_URL = "https://api.librus.pl/OAuth/Token"
/** https://api.librus.pl/OAuth/TokenJST */
const val LIBRUS_API_TOKEN_JST_URL = "https://api.librus.pl/OAuth/TokenJST"
const val LIBRUS_API_AUTHORIZATION = "Mjg6ODRmZGQzYTg3YjAzZDNlYTZmZmU3NzdiNThiMzMyYjE="
const val LIBRUS_API_SECRET_JST = "18b7c1ee08216f636a1b1a2440e68398"
const val LIBRUS_API_CLIENT_ID_JST = "49"
//const val LIBRUS_API_CLIENT_ID_JST_REFRESH = "42"

const val LIBRUS_JST_DEMO_CODE = "68656A21"
const val LIBRUS_JST_DEMO_PIN = "1290"

/** https://synergia.librus.pl/loguj/token/TOKEN/przenies */
const val LIBRUS_SYNERGIA_TOKEN_LOGIN_URL = "https://synergia.librus.pl/loguj/token/TOKEN/przenies"

const val LIBRUS_MESSAGES_URL = "https://wiadomosci.librus.pl/module/"
const val LIBRUS_SANDBOX_URL = "https://sandbox.librus.pl/index.php?action="



val MOBIDZIENNIK_USER_AGENT = SYSTEM_USER_AGENT

const val VULCAN_API_USER_AGENT = "MobileUserAgent"
const val VULCAN_API_APP_NAME = "VULCAN-Android-ModulUcznia"
const val VULCAN_API_APP_VERSION = "19.4.1.436"
val VULCAN_API_DEVICE_NAME = "Szkolny.eu ${Build.MODEL}"

const val VULCAN_API_ENDPOINT_CERTIFICATE = "mobile-api/Uczen.v3.UczenStart/Certyfikat";
const val VULCAN_API_ENDPOINT_STUDENT_LIST = "mobile-api/Uczen.v3.UczenStart/ListaUczniow";
const val VULCAN_API_ENDPOINT_DICTIONARIES = "mobile-api/Uczen.v3.Uczen/Slowniki";
const val VULCAN_API_ENDPOINT_TIMETABLE = "mobile-api/Uczen.v3.Uczen/PlanLekcjiZeZmianami";
const val VULCAN_API_ENDPOINT_GRADES = "mobile-api/Uczen.v3.Uczen/Oceny";
const val VULCAN_API_ENDPOINT_GRADES_PROPOSITIONS = "mobile-api/Uczen.v3.Uczen/OcenyPodsumowanie";
const val VULCAN_API_ENDPOINT_EVENTS = "mobile-api/Uczen.v3.Uczen/Sprawdziany";
const val VULCAN_API_ENDPOINT_HOMEWORK = "mobile-api/Uczen.v3.Uczen/ZadaniaDomowe";
const val VULCAN_API_ENDPOINT_NOTICES = "mobile-api/Uczen.v3.Uczen/UwagiUcznia";
const val VULCAN_API_ENDPOINT_ATTENDANCE = "mobile-api/Uczen.v3.Uczen/Frekwencje";
const val VULCAN_API_ENDPOINT_MESSAGES_RECEIVED = "mobile-api/Uczen.v3.Uczen/WiadomosciOdebrane";
const val VULCAN_API_ENDPOINT_MESSAGES_SENT = "mobile-api/Uczen.v3.Uczen/WiadomosciWyslane";
const val VULCAN_API_ENDPOINT_MESSAGES_CHANGE_STATUS = "mobile-api/Uczen.v3.Uczen/ZmienStatusWiadomosci";
const val VULCAN_API_ENDPOINT_PUSH = "mobile-api/Uczen.v3.Uczen/UstawPushToken";