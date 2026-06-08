package com.studenthub.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Helper class for SharedPreferences operations
 */
public class SharedPreferencesHelper {
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public SharedPreferencesHelper(Context context) {
        preferences = context.getSharedPreferences(
            Constants.PREFERENCES_NAME, 
            Context.MODE_PRIVATE
        );
        editor = preferences.edit();
    }

    /**
     * Save string value
     */
    public void putString(String key, String value) {
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * Get string value
     */
    public String getString(String key, String defaultValue) {
        return preferences.getString(key, defaultValue);
    }

    /**
     * Save boolean value
     */
    public void putBoolean(String key, boolean value) {
        editor.putBoolean(key, value);
        editor.apply();
    }

    /**
     * Get boolean value
     */
    public boolean getBoolean(String key, boolean defaultValue) {
        return preferences.getBoolean(key, defaultValue);
    }

    /**
     * Save integer value
     */
    public void putInt(String key, int value) {
        editor.putInt(key, value);
        editor.apply();
    }

    /**
     * Get integer value
     */
    public int getInt(String key, int defaultValue) {
        return preferences.getInt(key, defaultValue);
    }

    /**
     * Save long value
     */
    public void putLong(String key, long value) {
        editor.putLong(key, value);
        editor.apply();
    }

    /**
     * Get long value
     */
    public long getLong(String key, long defaultValue) {
        return preferences.getLong(key, defaultValue);
    }

    /**
     * Clear all preferences
     */
    public void clearAll() {
        editor.clear();
        editor.apply();
    }

    /**
     * Remove specific key
     */
    public void remove(String key) {
        editor.remove(key);
        editor.apply();
    }
}
