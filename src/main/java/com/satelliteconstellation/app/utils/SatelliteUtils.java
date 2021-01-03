package com.satelliteconstellation.app.utils;

import com.satelliteconstellation.app.entity.SatelliteInfo;

import java.util.concurrent.TimeUnit;

public class SatelliteUtils {

    public static float getSatelliteHealth(SatelliteInfo satelliteInfo) {
        float datesSpent;
        long millis = System.currentTimeMillis();
        java.sql.Date currentDate = new java.sql.Date(millis);
        datesSpent = TimeUnit.DAYS.convert(Math.abs(currentDate.getTime() - satelliteInfo.getInitializedDate().getTime()), TimeUnit.MILLISECONDS);
        float batteryHealth = ((float)datesSpent / (float)(satelliteInfo.getBatteryLife()) )* 100;

        return batteryHealth;
    }
}
