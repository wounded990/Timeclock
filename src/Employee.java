/* author of program:  Basheer Mansour
    Date:  12/10/2022
    Description:  This program will calculate the total hours worked by an employee and the total amount owed,based,over time
    and keep track of the hours worked.
*/
public class Employee {
    /**
     * The Days on.
     */
    public int daysOn , /**
     * The Days off.
     */
    daysOff, /**
     * The Vacation.
     */
    vacation, /**
     * The Days worked.
     */
    daysWorked;
    /**
     * The Hours worked.
     */
    public double hoursWorked;
    /**
     * The Clocked in.
     */
    public String clockedIn, /**
     * The Clocked out.
     */
    clockedOut;
    /**
     * The Info.
     */
//public PaySalary paySalary;
    public EmployeeInfo info;

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        info.setName(name);
    }

    /**
     * Req time off.
     */
    public void reqTimeOff() {
        System.out.println("Time off requested.");
    }

    /**
     * Clock in.
     */
    public void clockIn() {
        System.out.println("Clocked in.");
    }

    /**
     * Clock out.
     */
    public void clockOut() {
        System.out.println("Clocked out.");
    }

    /**
     * Sets days on.
     *
     * @param daysOn the days on
     */
    public void setDaysOn(int daysOn) {
        this.daysOn = daysOn;
    }

    /**
     * Sets days off.
     *
     * @param daysOff the days off
     */
    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }

    /**
     * Sets vacation.
     *
     * @param vacation the vacation
     */
    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    /**
     * Sets hours worked.
     *
     * @param hoursWorked the hours worked
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Sets clocked in.
     *
     * @param clockedIn the clocked in
     */
    public void setClockedIn(String clockedIn) {
        this.clockedIn = clockedIn;
    }

    /**
     * Sets clocked out.
     *
     * @param clockedOut the clocked out
     */
    public void setClockedOut(String clockedOut) {
        this.clockedOut = clockedOut;
    }

    /**
     * Gets days on.
     *
     * @return the days on
     */
    public int getDaysOn() {
        return daysOn;
    }

    /**
     * Gets days off.
     *
     * @return the days off
     */
    public int getDaysOff() {
        return daysOff;
    }

    /**
     * Gets vacation.
     *
     * @return the vacation
     */
    public int getVacation() {
        return vacation;
    }

    /**
     * Gets hours worked.
     *
     * @return the hours worked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Gets clocked in.
     *
     * @return the clocked in
     */
    public String getClockedIn() {
        return clockedIn;
    }

    /**
     * Gets clocked out.
     *
     * @return the clocked out
     */
    public String getClockedOut() {
        return clockedOut;
    }

    /**
     * Sets days worked.
     *
     * @param daysWorked the days worked
     */
    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }

    /**
     * Gets days worked.
     *
     * @return the days worked
     */
    public int getDaysWorked() {
        return daysWorked;
    }

    /**
     * Print employee info.
     */
    public void printEmployeeInfo() {
        System.out.println("Days on: " + daysOn);
        System.out.println("Days off: " + daysOff);
        System.out.println("Vacation: " + vacation);
        System.out.println("Clocked in: " + clockedIn);
        System.out.println("Clocked out: " + clockedOut);
    }



}
