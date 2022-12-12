/**
 * The type Time clock.
 */
/* author of program:  Basheer Mansour
    Date:  12/10/2022
    Description:  This program will calculate the total hours worked by an employee and the total amount owed,based,over time
    and keep track of the hours worked.
*/
public class TimeClock {

    /**
     * The constant payStub.
     */
    public static PayStub payStub = new PayStub();

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        Company company = new Company();
        company.printJob();
        Administrator admin = new Administrator();
        admin.EmployeeInput();

    }
}









