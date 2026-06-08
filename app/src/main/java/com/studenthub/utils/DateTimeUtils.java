package com.studenthub.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Utility class for date and time operations
 */
public class DateTimeUtils {
    private static final SimpleDateFormat DATE_FORMAT = 
        new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    private static final SimpleDateFormat TIME_FORMAT = 
        new SimpleDateFormat("HH:mm", Locale.getDefault());
    private static final SimpleDateFormat DATETIME_FORMAT = 
        new SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault());

    /**
     * Convert milliseconds to date string
     */
    public static String formatDate(long timeMillis) {
        return DATE_FORMAT.format(new Date(timeMillis));
    }

    /**
     * Convert milliseconds to time string
     */
    public static String formatTime(long timeMillis) {
        return TIME_FORMAT.format(new Date(timeMillis));
    }

    /**
     * Convert milliseconds to datetime string
     */
    public static String formatDateTime(long timeMillis) {
        return DATETIME_FORMAT.format(new Date(timeMillis));
    }

    /**
     * Get current time in milliseconds
     */
    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    /**
     * Check if date is today
     */
    public static boolean isToday(long timeMillis) {
        Date date = new Date(timeMillis);
        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
        return sdf.format(date).equals(sdf.format(today));
    }

    /**
     * Check if date has passed
     */
    public static boolean isPassed(long timeMillis) {
        return timeMillis < System.currentTimeMillis();
    }
}
