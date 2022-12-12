/* author of program:  Basheer Mansour
    Date:  12/10/2022
    Description:  This program will calculate the total hours worked by an employee and the total amount owed,based,over time
    and keep track of the hours worked.
*/
public class EmployeeInfo {
    /**
     * The Name.
     */
    public String name, /**
     * The Address.
     */
    address;
    /**
     * The Ssn.
     */
    public int SSN, /**
     * The Age.
     */
    age, /**
     * The Id.
     */
    ID;

    /**
     * Sets id.
     *
     * @param ID the id
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets ssn.
     *
     * @param SSN the ssn
     */
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }


    /**
     * Gets id.
     *
     * @return the id
     */
    public int getID() {
        return ID;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets ssn.
     *
     * @return the ssn
     */
    public int getSSN() {
        return SSN;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }



    /**
     * Print employee info.
     */
    public void printEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + ID);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee SSN: " + SSN);
        System.out.println("Employee Age: " + age);
    }


}
