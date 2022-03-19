package rasteiu.roxana.lab8.ex4;

public class AlarmUnit {
    private boolean alarm;
    public AlarmUnit(boolean alarm)
    {
        this.alarm=alarm;
        toString();
    }

    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
        toString();
    }

    @Override
    public String toString()
    {
        if(alarm)
            return ("The alarm is on and the owner is called");
        return("The alarm is off");
    }
}
