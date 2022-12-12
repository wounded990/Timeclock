/**
 * The type Pay stub.
 */
/* author of program:  Basheer Mansour
    Date:  12/10/2022
    Description:  This program will calculate the total hours worked by an employee and the total amount owed,based,over time
    and keep track of the hours worked.
*/
public class PayStub {
    final int MAX_HOURS = 40;
    double TotalPay, HourlyWage;
    public String EmployeeName, EmployeeAddress;

    public double getHourlyWage() {
        return HourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        HourlyWage = hourlyWage;
    }

    public double getTotalPay() {
        return TotalPay;
    }

    public void setTotalPay(double totalPay) {
        TotalPay = totalPay;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getEmployeeAddress() {
        return EmployeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        EmployeeAddress = employeeAddress;
    }

    /**
     * The Hours worked.
     */
    public int hoursWorked;
    /**
     * The Overtime.
     */
    public double overtime;
    /**
     * The Bonus.
     */
    public int bonus;
    /**
     * The Hourly wage.
     */
    public int hourlyWage;
    /**
     * The Wage.
     */
    public int wage;

    /**
     * The Salary.
     */
    double salary;
    /**
     * The Hours.
     */
    double hours;

    /**
     * Instantiates a new Pay stub.
     */
    public PayStub() {

    }

    /**
     * Sets wage.
     *
     * @param wage the wage
     */
    public void setWage(int wage) {
        this.wage = wage;
    }

    /**
     * Gets total.
     *
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    public void setEmployeeName(String name) {
        this.EmployeeName = name;
    }

    /**
     * The Total.
     */
    public double total;

    /**
     * Sets hours worked.
     *
     * @param hoursWorked the hours worked
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Sets bonus.
     *
     * @param bonus the bonus
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    /**
     * Calculate overtime.
     */
    public void calculateOvertime() {

        overtime = (int) ((hoursWorked - MAX_HOURS));


    }

    /**
     * Sets overtime.
     *
     * @param overtime the overtime
     */
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    /**
     * Sets hourly wage.
     *
     * @param hourlyWage the hourly wage
     */
    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }


    /**
     * Gets bonus.
     *
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * Gets hours worked.
     *
     * @return the hours worked
     */
    public int getHoursWorked() {
        return hoursWorked;
    }
    /**
     * Gets sety wage.
     *
     * @return the sety wage
     */
    public double getSetyWage() {
        return wage;
    }


    /**
     * Gets overtime.
     *
     * @return the overtime
     */
    public double getOvertime() {
        return overtime;
    }

    /**
     * Instantiates a new Pay stub.
     *
     * @param hoursWorked the hours worked
     * @param bonus       the bonus
     * @param overtime    the overtime
     * @param hourlyWage  the hourly wage
     */
// Constructor
    public PayStub(int hoursWorked, int bonus, double overtime, int hourlyWage) {
        System.out.println("Constructing an PayStub");
        this.hoursWorked = hoursWorked;
        this.bonus = bonus;
        this.overtime = overtime;
        this.hourlyWage = hourlyWage;
    }

    /**
     * Print pay stub.
     */
// printPayStub calculates the amount of hours worked, overtime, bonus, and amount owed
    public void printPayStub() {
        salary = 0;
        overtime = 0;
        System.out.println("Employee Wage: " + wage);
        System.out.println("Hours worked: " + hoursWorked);
        if (hoursWorked <= MAX_HOURS) {
            salary = hoursWorked * hourlyWage;
            System.out.println("Salary: " + salary);
            System.out.println("Total  overtime Hours Worked: " + overtime);
            System.out.println("Total  overtime pay $: " + overtime);
        } else {
            salary = MAX_HOURS * hourlyWage;
            overtime = (hoursWorked - MAX_HOURS) * (hourlyWage * 1.5);
            System.out.println("Salary: " + salary);
            System.out.println("Total  overtime Hours Worked: " + (hoursWorked - MAX_HOURS));
            System.out.println("Total  overtime pay $: " + overtime);
        }

        System.out.println("Bonus: $ " + bonus);
        if (bonus == 0) {
            System.out.println("No bonus ");
        }
        total = (salary + bonus + overtime);
        System.out.println("Total pay: $ " + total);
    }
}
