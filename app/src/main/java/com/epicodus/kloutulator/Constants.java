package com.epicodus.kloutulator;

/**
 * Created by Guest on 5/10/16.
 */
public class Constants {
    public static final String KLOUT_API_KEY = BuildConfig.KLOUT_API_KEY;
    public static final String KLOUT_BASE_URL = "http://api.klout.com/v2/identity.json/twitter?";
    public static final String SEARCH_PARAM = "screenName";
    public static final String API_PARAM = "key";
    public static final String USER_BASE_URL = "http://api.klout.com/v2/user.json/";
    public static final String INFLUENCE_BASE_URL = "http://api.klout.com/v2/user.json/";

    public static final String PREFERENCES_USERNAME_KEY = "searchedUsername";

    public static final String FIREBASE_URL = BuildConfig.FIREBASE_ROOT_URL;

    public static final String FIREBASE_LOCATION_USERS = "users";
    public static final String FIREBASE_PROPERTY_EMAIL = "email";
    public static final String KEY_UID = "UID";
    public static final String FIREBASE_URL_USERS = FIREBASE_URL + "/" + FIREBASE_LOCATION_USERS;
}
