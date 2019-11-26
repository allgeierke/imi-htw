
public class ClockDisplayAlarm24 extends MusicOrganizer
{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private int alarmHours;
    private int alarmMinutes;
    private Boolean alarmstatus; //default as false
    private String displayString;    // simulates the actual display
    private int index;
    
    /**
     * Constructor for ClockDisplay objects. This constructor 
     * creates a new clock set at 00:00.
     */
    public ClockDisplayAlarm24()
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }

    /**
     * Constructor for ClockDisplay objects. This constructor
     * creates a new clock set at the time specified by the 
     * parameters.
     */
    public ClockDisplayAlarm24(int hour, int minute)
    {
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }

    /**
     * This method should get called once every minute - it makes
     * the clock display go one minute forward.
     */
    public void timeTick()
    {
        minutes.increment();
        if(minutes.getValue() == 0) {  // it just rolled over!
            hours.increment();
        }
        
        if ( alarmstatus == true && ( alarmHours == hours.getValue() && alarmMinutes == minutes.getValue() ) ) {
            playTrack(index);
            alarmstatus = false;
        }
        updateDisplay();
    }
    
        public void setAlarmOn(int hour, int minute, int index) {
        alarmstatus = true;
        alarmHours = hour;
        alarmMinutes = minute;
        this.index = index;
    }
    
    public void setAlarmOff() {
        alarmstatus = false;
    }

    /**
     * Set the time of the display to the specified hour and
     * minute.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }

    /**
     * Return the current time of this display in the format HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Update the internal string that represents the display.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() + ":" + 
                        minutes.getDisplayValue();
    }
    
}