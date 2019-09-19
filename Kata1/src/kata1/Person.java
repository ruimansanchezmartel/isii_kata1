package kata1;

import java.util.Date;

public class Person {
    private final String name;
    private final Date birthdate;
    private static int milliseconds_Per_Seconds = 1000;
    private static int seconds_Per_Hour = 360;
    private static int hours_Per_Day = 24;
    private static double days_Per_Year = 365.25;

    public Person(String name, Date birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }
    
    public Date getBirthdate() {
        return birthdate;
    }
    
    public int getAge() {
        return toYear((int) (new Date().getTime() - birthdate.getTime()));
    }

    private int toYear(int milliseconds) {
         return (int) (milliseconds / Milliseconds_Per_Year());
    }

    private double Milliseconds_Per_Year() {
        return milliseconds_Per_Seconds *
                seconds_Per_Hour *
                hours_Per_Day *
                days_Per_Year;
    }
}
