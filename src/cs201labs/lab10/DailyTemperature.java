package cs201labs.lab10;

import java.time.LocalDate;

public class DailyTemperature {
    double[] dailyTemp = new double[365];
    double hottestDay;
    double coldestDay;

    DailyTemperature(double[] temp) {
        dailyTemp = temp;
    }

    public double coldestDayOfMonth(LocalDate d) {
        int month = d.getMonthValue();
        int previousDays = 0;

        for (int i = 1; i < month; i++) {
            LocalDate ld = LocalDate.of(d.getYear(), d.getMonthValue(), i);
            previousDays += ld.getDayOfMonth();
        }
        coldestDay = dailyTemp[previousDays];
        for (int i = previousDays; i < d.getDayOfMonth(); i++) {
            if (coldestDay > dailyTemp[i]) {
                coldestDay = dailyTemp[i];
            }
        }

        return coldestDay;
    }


    public double hotestDayOfMonth(LocalDate d) {
        int month = d.getMonthValue();
        int previousDays = 0;

        for (int i = 1; i < month; i++) {
            LocalDate ld = LocalDate.of(d.getYear(), d.getMonthValue(), i);
            previousDays += ld.getDayOfMonth();
        }

        hottestDay = dailyTemp[previousDays];
        for (int i = previousDays; i < d.getDayOfMonth(); i++) {
            if (hottestDay < dailyTemp[i]) {
                hottestDay = dailyTemp[i];
            }
        }

        return hottestDay;
    }


    public double calcAverageOfMonth(LocalDate d) {
        int month = d.getMonthValue();
        int previousDays = 0;
        double sumTemp = 0;

        for (int i = 1; i < month; i++) {
            LocalDate ld = LocalDate.of(d.getYear(), d.getMonthValue(), i);
            previousDays += ld.getDayOfMonth();
        }


        for (int i = previousDays; i < d.getDayOfMonth(); i++) {
            sumTemp += dailyTemp[i];
        }

        double averageTemp = sumTemp/d.getDayOfMonth();

        return averageTemp;
    }

    public static void main(String[] args) {

        double[] dailyTempOfYear = new double[365];
        for (int i = 0; i < 365; i++) {
            dailyTempOfYear[i] = (i+365)%100;
            System.out.println(""+dailyTempOfYear[i]);
        }

        for (int i = 0; i < 365; i++) {
            System.out.println(dailyTempOfYear[i]);
        }
        LocalDate ld = LocalDate.now();
        DailyTemperature tempOfYear = new DailyTemperature(dailyTempOfYear);
        System.out.println("hottest day of month:"+tempOfYear.hotestDayOfMonth(LocalDate.now()));
        System.out.println("coldest day of month:"+tempOfYear.coldestDayOfMonth(LocalDate.now()));
        System.out.println("average temperature of month:"+tempOfYear.calcAverageOfMonth(LocalDate.now()));

    }


}
