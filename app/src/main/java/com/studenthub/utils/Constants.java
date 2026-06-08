package com.studenthub.utils;

/**
 * Constants class for application-wide constants
 */
public class Constants {
    // Priority levels
    public static final String PRIORITY_HIGH = "HIGH";
    public static final String PRIORITY_MEDIUM = "MEDIUM";
    public static final String PRIORITY_LOW = "LOW";

    // Grades
    public static final String[] GRADES = {"A", "B", "C", "D", "F"};
    public static final double[] GRADE_POINTS = {4.0, 3.0, 2.0, 1.0, 0.0};

    // Days of week
    public static final String[] DAYS = {
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    // Attendance threshold
    public static final double ATTENDANCE_THRESHOLD = 75.0;

    // Database
    public static final String DATABASE_NAME = "student_hub.db";
    public static final int DATABASE_VERSION = 1;

    // Shared preferences
    public static final String PREFERENCES_NAME = "student_hub_prefs";
    public static final String PREF_USER_NAME = "user_name";
    public static final String PREF_USER_EMAIL = "user_email";
    public static final String PREF_DARK_MODE = "dark_mode";
    public static final String PREF_NOTIFICATIONS = "notifications";
    public static final String PREF_FIRST_TIME_USER = "first_time_user";

    // Notification channels
    public static final String NOTIFICATION_CHANNEL_ID = "student_hub_channel";
    public static final String NOTIFICATION_CHANNEL_NAME = "Student Hub Notifications";

    // Intent extras
    public static final String EXTRA_TASK_ID = "task_id";
    public static final String EXTRA_TASK_OBJECT = "task_object";
    public static final String EXTRA_MODULE_TYPE = "module_type";
}
