package adapter;

public class Main {
    static void main() {
        NewDateInterface adapter = new CalendarToNewDateAdapter();

        adapter.setDay(7);
        adapter.setMonth(4);
        adapter.setYear(2026);

        System.out.println("Date right now: " + adapter.getDay() + "." + adapter.getMonth() + "." + adapter.getYear());

        adapter.advanceDays(14);

        System.out.println("Date after two weeks: " + adapter.getDay() + "." + adapter.getMonth() + "." + adapter.getYear());
    }
}
