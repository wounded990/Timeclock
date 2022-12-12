/* author of program:  Basheer Mansour
    Date:  12/10/2022
    Description:  This program will calculate the total hours worked by an employee and the total amount owed,based,over time
    and keep track of the hours worked.
*/
public class Company {
    /**
     * The Title.
     */
    public String title = "Worker";
    /**
     * The Description.
     */
    public String description = "This program will calculate the total hours worked by an employee and the total amount owed,based,over time\n" +
            "    and keep track of the hours worked.";
    /**
     * The Company.
     */
    public String company="Basheer's Company";
    /**
     * The Salary.
     */
    public int salary =20;

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets description.
     *
     * @param description the description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets company.
     *
     * @param company the company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets company.
     *
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Print job.
     */
    public void printJob() {
        System.out.println("Welcome to the Time Clock");
        System.out.println("Company: " + company);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);

    }
}
