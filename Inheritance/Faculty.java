package Inheritance;

public class Faculty extends Employee{

    public String department;

    public String researchArea;

    public String officeHours;

    public Faculty() {

    }

    public Faculty(String name, String id, double salary, String jobTitle, String department, String researchArea, String officeHours) {
        super(name, id, salary, jobTitle);
        this.department = department;
        this.researchArea = researchArea;
        this.officeHours = officeHours;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
}
