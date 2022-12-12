/* author of program:  Basheer Mansour
    Date:  12/10/2022
    Description:  This program will calculate the total hours worked by an employee and the total amount owed,based,over time
    and keep track of the hours worked.
*/
import java.util.Scanner;

/**
 * The type Administrator.
 */
public class Administrator {
    /**
     * The Wage.
     */
    int wage;
    /**
     * The Hours worked.
     */
    int hoursWorked;
    /**
     * The Pay stub.
     */
    PayStub payStub = new PayStub();
    /**
     * The Employee.
     */
    Employee employee = new Employee();
    EmployeeInfo employeeInfo = new EmployeeInfo();

    /**
     * Employee input.
     */
//PaySalary paysalary = new PaySalary();
    public void EmployeeInput() {
        Scanner input = new Scanner(System.in);
        String nameInput = "";
        try {
            do {
                System.out.println("Enter employee name: ");
                nameInput = input.nextLine();
                employeeInfo.setName(nameInput);
                if (nameInput == "") {
                    System.out.println("Name cannot be empty");
                    System.out.println("Enter employee name: ");
                    employeeInfo.setName(nameInput);
                }
            } while (nameInput == "");
        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        String addressInput = "";
        try {
            do {
                System.out.println("Please enter your address: ");
                addressInput = input.nextLine();
                employeeInfo.setAddress(addressInput);
                if (addressInput == "") {
                    System.out.println("Address cannot be empty");
                    System.out.print("Please enter your address: ");
                    employeeInfo.setAddress(addressInput);
                }
            } while (addressInput == "");

        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        String numRegex = "[0-9]+";
        int idInput = -1;
        String idInputString = "";

        try {
            do {
                System.out.println("Please enter your ID: ");
                idInputString = input.nextLine();

                if (idInputString.matches(numRegex)) {
                    idInput = Integer.parseInt(idInputString);
                    employeeInfo.setID(idInput);

                    if (idInput < 0) {
                        System.out.println("ID cannot be negative.");
                        System.out.print("Enter employee ID: ");
                        employeeInfo.setID(idInput);
                    }
                } else {
                    System.out.println("ID must be a number and cannot be negative.");
                }
            } while (!idInputString.matches(numRegex) && idInput < 0);
        } catch (Exception ex) {
            System.out.println("Error in Input");
            System.exit(0);
        }

        int ssnInput = -1;
        String ssnInputString = "";

        try {
            do {
                System.out.println("Please enter your SSN: ");
                ssnInputString = input.nextLine();

                if (ssnInputString.matches(numRegex)) {
                    ssnInput = Integer.parseInt(ssnInputString);
                    employeeInfo.setSSN(ssnInput);

                    if (ssnInput < 0) {
                        System.out.println("SSN cannot be negative.");
                        System.out.print("Enter employee SSN: ");
                        employeeInfo.setSSN(ssnInput);
                    }
                } else {
                    System.out.println("SSN must be a number and cannot be negative.");
                }
            } while (!ssnInputString.matches(numRegex) && ssnInput < 0);
        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        int ageInput = -1;
        String ageInputString = "";

        try {
            do {
                System.out.println("Please enter your age: ");
                ageInputString = input.nextLine();

                if (ageInputString.matches(numRegex)) {
                    ageInput = Integer.parseInt(ageInputString);
                    employeeInfo.setAge(ageInput);

                    if (ageInput < 0) {
                        System.out.println("Age cannot be negative");
                        System.out.print("Enter employee age: ");
                        employeeInfo.setAge(input.nextInt());
                    }
                } else {
                    System.out.println("Age must be a number and cannot be negative.");
                }
            } while (!ageInputString.matches(numRegex) && ageInput < 0);
        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        int hourInput = -1;
        String hourInputString = "";

        try {
            do {
                System.out.println("Please enter your hours worked: ");
                hourInputString = input.nextLine();

                if (hourInputString.matches(numRegex)) {
                    hourInput = Integer.parseInt(hourInputString);
                    employee.setDaysWorked(hourInput);
                    payStub.setHoursWorked(hourInput);

                    if (hourInput < 0) {
                        System.out.println("Hours worked cannot be negative.");
                        System.out.println("Enter employee hours worked: ");
                        hoursWorked = input.nextInt();
                        employee.setDaysWorked(hoursWorked);
                        payStub.setHoursWorked(hoursWorked);
                    }
                } else {
                    System.out.println("Hours worked must be a number and cannot be negative.");
                }
            } while (!hourInputString.matches(numRegex) && hourInput < 0);
        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        try {



                System.out.println("Enter the number of days you worked this week: ");
                employee.daysOn = input.nextInt();


                while (employee.daysOn < 0) {
                    System.out.println("Days on the job cannot be negative");
                    System.out.print("Enter the number of days you worked this week: ");
                    employee.daysOn = input.nextInt();
                }

        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        try {



                System.out.println("Enter the number of days you off this week: ");
                employee.daysOff = input.nextInt();

                while (employee.daysOff < 0) {
                    System.out.println("Days off cannot be negative");
                    System.out.print("Enter the number of days you off this week: ");
                    employee.daysOff = input.nextInt();
                }


        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        try {
            System.out.println("Please enter your vacation days: ");
            employee.vacation = input.nextInt();

            while (employee.vacation < 0) {
                System.out.println("Vacation days cannot be negative");
                System.out.print("Enter employee vacation days: ");
                employee.vacation = input.nextInt();
            }
        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        try {



                System.out.println("Please enter your clock in time: ");
                employee.clockedIn = input.next();

                while (employee.clockedIn.isEmpty()) {
                    System.out.println("Clock in time cannot be empty");
                    System.out.print("Enter employee clock in time: ");
                    employee.clockedIn = input.next();
                }

        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        try {



                System.out.println("Please enter your clock out time: ");
                employee.clockedOut = input.next();

                while (employee.clockedOut.isEmpty()) {
                    System.out.println("Clock out time cannot be empty");
                    System.out.print("Enter employee clock out time: ");
                    employee.clockedOut = input.next();
                }

        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        try {
            System.out.println("Please enter your hourly wage: ");
            wage = input.nextInt();
            payStub.setWage(wage);
            payStub.setHourlyWage(wage);

            //PayStub payStub = new PayStub();
            while (payStub.hourlyWage < 0) {
                System.out.println("Hourly wage cannot be negative");
                System.out.print("Enter employee hourly wage: ");
                wage = input.nextInt();
                payStub.setWage(wage);
                payStub.setHourlyWage(wage);
            }
        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        String bonusInput = "";
        try {
            do {
                System.out.println("Do you want to give a bonus? Y or N: ");
                bonusInput = input.next();
                if (bonusInput == "") {
                    System.out.println("Answer cannot be empty");
                    System.out.print("Do you want to give a bonus? Y or N: ");
                    bonusInput = input.next();
                }
            } while (bonusInput == "");

            if (bonusInput.equals("Y") || bonusInput.equals("y")) {
                System.out.println("Enter the bonus: ");
                int bonus = input.nextInt();
                payStub.setBonus(bonus);
                payStub.bonus = bonus;
            } else {
                System.out.println("No bonus");
            }
        } catch (Exception ex) {
            System.out.println("Input is not valid");
        }

        System.out.println("-------------------- Welcome to the Baheer's Payroll System --------------------");

        Company company = new Company();
        company.printJob();

            System.out.println("-------------------- Employee information ---------------------");
            employeeInfo.printEmployeeInfo();
            employee.printEmployeeInfo();
            System.out.println("-------------------- Pay Stub ---------------------------------");

            payStub.printPayStub();
            System.out.println("---------------------------------------------------------------");
        }

}
