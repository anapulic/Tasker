package com.example.ana.tasker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Function {
    public static String Epoch2DateString(String epochSeconds, String formatString){
        Date updateDate = new Date(Long.parseLong(epochSeconds));
        SimpleDateFormat format = new SimpleDateFormat(formatString);
        return format.format(updateDate);
    }

    public static Calendar Epoch2Calendar(String epochseconds){
        Date updateDate = new Date(Long.parseLong(epochseconds));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(updateDate);
        return calendar;
    }
}
