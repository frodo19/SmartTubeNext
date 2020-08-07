package com.liskovsoft.android.smartyoutubetv2.prefs;

import android.content.Context;
import com.liskovsoft.sharedutils.prefs.SharedPreferencesBase;

public class AppPrefs extends SharedPreferencesBase {
    private static final String TAG = AppPrefs.class.getSimpleName();
    private static AppPrefs sInstance;
    private static final String COMPLETED_ONBOARDING = "completed_onboarding";

    private AppPrefs(Context context) {
        super(context);
    }

    public static AppPrefs instance(Context context) {
        if (sInstance == null) {
            sInstance = new AppPrefs(context);
        }

        return sInstance;
    }

    public void setCompletedOnboarding(boolean completed) {
        putBoolean(COMPLETED_ONBOARDING, completed);
    }

    public boolean getCompletedOnboarding() {
        return getBoolean(COMPLETED_ONBOARDING, false);
    }
}