package com.stackroute;

/*Write a java program to calculate first and last date of a week.

  Output:

  First Date of Week:             Mon 24/07/2017

  Last date of the week:          Sun 30/07/2017
  */


import java.util.*;
import java.text.*;
public class CalculateFirstAndLastDateOfWeek {
    public String calculateFirstDateOfWeek(Date today){
        Date thisDate=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("E MM/dd/YY");
        System.out.println(dateFormat.format(thisDate));
        return null;
    }
    public String calculateLastDateOfWeek(Date today){
        Date thisDate=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("E MM/dd/YY");
        System.out.println(dateFormat.format(thisDate));
        Calendar calendar = Calendar.getInstance();
      //  calendar.setTime(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
      //  calendar.getFirstDayOfWeek();
        System.out.println(calendar);
        return null;
    }
}
