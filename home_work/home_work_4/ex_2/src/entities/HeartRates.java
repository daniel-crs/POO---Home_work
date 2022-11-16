package entities;

public class HeartRates {
    private String name, lastName;
    private int year, month, day;

    public HeartRates(String name, String lastName, int year, int month, int day) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int define_age() {
        int age = 0;

        age = 2022 - year;

        if (month > 11) {
            age += 1;
        } else if (month == 11) {
            if (day >= 16) {
                age += 1;
            }
        }

        return age;
    }

    public int maximum_heartRate() {
        int heartRateValue;

        heartRateValue = 220 - define_age();

        return heartRateValue;
    }

    public double target_heartRate_maximum() {
        return (double) (maximum_heartRate() * 0.50);
    }

    public double target_heartRate_minimum() {
        return (double) (maximum_heartRate() * 0.85);
    }

    public String toString() {
        return "\nGood morning " + getName() + " " + getLastName() + ", based in your age " + define_age()
                + ", your maximum heart rate is " + maximum_heartRate()
                + " per minute and your target heart rate should be between "
                + String.format("%.2f", target_heartRate_maximum())
                + " to " + String.format("%.2f", target_heartRate_minimum()) + " per minute.\n";
    }

}
