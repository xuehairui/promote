package com.example.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2019, 9, 2, 10, 36, 11);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2019, 9, 2, 11, 37, 11);
        Date a = cal.getTime();
        Date b = cal2.getTime();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(b.getTime() - a.getTime());
        System.out.println(df.format(a));
        System.out.println(df.format(b));
        System.out.println(cal.getTimeInMillis() - cal2.getTimeInMillis());
        int hour = (int) ((b.getTime() - a.getTime() )/ (1000*3600));
        int min = (int) ((b.getTime() - a.getTime() )/ (1000*60));
        System.out.println(hour + ":" + min);
    }
}
