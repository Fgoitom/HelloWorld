package cs201labs.lab5;

public class WorkingHours {
    private double numHoursWorked;
    private double totalSales;
    private final double REGULAR_HOUR_RATE= 7.25;
    private double OVER_TIME_RATE = 1.5;
    private final int REGULAR_HOURS = 40;

    public WorkingHours (double numHoursWorked, double totalSales){
        this.numHoursWorked=numHoursWorked;
        this.totalSales=totalSales;
    }

    public void setNumHoursWorked(double numHoursWorked) {
        this.numHoursWorked = numHoursWorked;
    }
    public double getNumHoursWorked(){
        return this.numHoursWorked;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getREGULAR_HOUR_RATE() {
        return REGULAR_HOUR_RATE;
    }

    public double getOVER_TIME_RATE() {
        return OVER_TIME_RATE;
    }

    public void setOVER_TIME_RATE(double OVER_TIME_RATE) {
        this.OVER_TIME_RATE = OVER_TIME_RATE;
    }

    public void finalWage(){
        double overTimeHours=0.0;
        double wage=0.0;

        //Regular pay and overTime pay
        if ( numHoursWorked<=REGULAR_HOURS) {
            wage = REGULAR_HOURS * REGULAR_HOUR_RATE;
            System.out.println(wage);
        }
        else {
            overTimeHours = numHoursWorked - REGULAR_HOURS; // 5 hours of over time
            System.out.println("Ovetime hours "+ overTimeHours);
            wage =  REGULAR_HOURS * REGULAR_HOUR_RATE; // salary for 40 hours of work
            System.out.println("Regular wage " +wage);
            wage = wage + (OVER_TIME_RATE * REGULAR_HOUR_RATE) * overTimeHours; // (1.5 x 7.25 x 10hours ) + wage
            System.out.println("final wage " +wage);
        }
        // wage + commission
        if (totalSales >= 1 && totalSales <= 99.99 ){
            wage = wage + 0.05*totalSales;
            System.out.println("plus 5% " +wage);
        } else if (totalSales >= 100 && totalSales <= 299.99) {
            wage = wage + 0.10 * totalSales;
            System.out.println("plus 10% " +wage);
        } else {
            wage = wage + 0.15 * totalSales;
            System.out.println("plus 15% " +wage);
        }
        System.out.println(wage);
    }
}






























