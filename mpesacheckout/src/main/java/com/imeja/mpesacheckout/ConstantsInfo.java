package com.imeja.mpesacheckout;

import android.util.Log;

public class ConstantsInfo {

    private static final String TAG = "ConstantsInfo";

    public final static String CONSUMER_KEY = "Rmr15C4bGMG70KG0Rf8KDvOnGmokTRAC";
    public final static String CONSUMER_SECRET = "zIvyCg0ncRDzu3nv";

    public static final String BUSINESS_SHORT_CODE = "174379";
    public static final String PASSKEY = "bfb279f9aa9bdbcf158e97dd71a467cd2e0c893059b10f78e6b72ada1ed2c919";
    public static final String PARTYB = "174379";
    public static final String CALLBACKURL = "https://imejadevelopers.com/mpesa";

    public static void d(String message) {
        Log.d(TAG, message);
    }

    public static void e(String message) {
        Log.e(TAG, message);
    }

    public static void w(String message) {
        Log.w(TAG, message);
    }

    public static void i(String message) {
        Log.i(TAG, message);
    }

    public static void v(String message) {
        Log.v(TAG, message);
    }

}
