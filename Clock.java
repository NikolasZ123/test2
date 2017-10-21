/* **********************************************************
 * Programmer:	Nikolas Z
 * Class:		CS30S
 * 
 * Assignment:	2 Alarm clock
 *
 * Description:	A class that lets you create a clock and set its time and 
 *              the alarm time. You can change these values and have them printed
 *              to the console. You can check the time to see if the alarm has
 *              went off.
 *
 * 
 * *************************************************************
 */
public class Clock {
    
    
    // ********** instance variables **********
    private  int timeHour, timeMinute, timeSecond; //variables used for time
    private  int alarmHour, alarmMinute, alarmSecond;//variabes used for alarm time
    
    // ********** constructors ***********
    
    //clock values if none are given
    public Clock() {
        
        timeHour = 0;
        timeMinute = 0;
        timeSecond = 0;
        
        alarmHour = 0;
        alarmMinute = 0;
        alarmSecond = 0;
       
    }
    
    //create a clock when values are givem
    public Clock(int hour, int minute, int second, int ahour, int aminute, int asecond) {
        
        timeHour = hour;
        timeMinute = minute;
        timeSecond = second;
        
        alarmHour = ahour;
        alarmMinute = aminute;
        alarmSecond = asecond;
        
    }
    
    
    
    
    
    // ********** accessors **********
    
    //returns the time of a clock
    public void getTime() {
        
        
        System.out.println ("Time- Hours: " +timeHour + " Minutes: " +timeMinute +" Seconds: " +timeSecond +"\n");
        
    }
    
    //returns the time the alarm will go off
    public void getAlarm() {
        
        System.out.println("Alarm- Hours: " +alarmHour + " Minutes: " +alarmMinute +" Seconds: " +alarmSecond +"\n");
    }
    
    //gives all the information about the clock object
    public String toString() {
        
        String clockInfo;
        
        clockInfo = "Time: \n";
        clockInfo += "Hours: " +timeHour + " Minutes: " +timeMinute +" Seconds: " +timeSecond +"\n";
        clockInfo += "Alarm Time: \n";
        clockInfo += "Hours: " +alarmHour + " Minutes: " +alarmMinute +" Seconds: " +alarmSecond +"\n";
        
        return clockInfo;
        
    }
    
    //checks if the time equals the alarm time, if it is the alarm will go off
    public void checkTime() {
        
        if((timeHour == alarmHour) && (timeMinute == alarmMinute) && (timeSecond == alarmSecond)) {
            System.out.println("Beep Beep, time to wake up!\n");
        } else {
            System.out.println("Not time yet\n");
        }
        
    }
    
    
    
    
    
    //******* Setters *******
    
    //set the time of a clock
    public void setTime(int hour, int minute, int second) {
        
        timeHour = hour;
        timeMinute = minute;
        timeSecond = second;
        
    }
    
    //set the time the alarm will go off
    public void setAlarm(int hour, int minute, int second) {
        
        alarmHour = hour;
        alarmMinute = minute;
        alarmSecond = second;
        
    }
    
    //increase the time of a clock by 1 second
    public void addSecond(){
        
        timeSecond++;
        
    }
      
}