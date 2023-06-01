import codewars.Alarm;

public class Main {
    public static void main(String[] args) {
        System.out.println(Alarm.setAlarm(true, false));
        System.out.println(Alarm.setAlarm(true, true));
        System.out.println(Alarm.setAlarm(false, false));
        System.out.println(Alarm.setAlarm(false, true));

    }
}