package com.studenthub.utils;

/**
 * Utility class for validation operations
 */
public class ValidationUtils {
    /**
     * Validate if string is empty or null
     */
    public static boolean isEmpty(String text) {
        return text == null || text.trim().isEmpty();
    }

    /**
     * Validate GPA value (0-4.0)
     */
    public static boolean isValidGPA(double gpa) {
        return gpa >= 0 && gpa <= 4.0;
    }

    /**
     * Validate attendance percentage
     */
    public static boolean isValidAttendance(int attended, int total) {
        return attended >= 0 && attended <= total && total > 0;
    }

    /**
     * Validate credit hours
     */
    public static boolean isValidCreditHours(double credits) {
        return credits > 0;
    }

    /**
     * Validate email format
     */
    public static boolean isValidEmail(String email) {
        return email != null && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    /**
     * Validate phone number
     */
    public static boolean isValidPhone(String phone) {
        return phone != null && phone.length() >= 10;
    }
}
