//Creating the class Project and the variables associated with it.
public class project {
    int projNum;
    String projName;
    String buildingDesign;
    String physicalAddress;
    int ERFnumber;
    double totalFee;
    double totalpaidtoDate;
    String dueDate;

    //objects of the person class
    person customer;
    person architect;
    person contractor;

    //Creating the constructor for the class project.
    public project(int projNum, String projName, String buildingDesign, String physicalAddress, int ERFnumber,
                   double totalFee, double totalpaidtoDate, String dueDate, person customer, person architect, person contractor) {
        this.projNum = projNum;
        this.projName = projName;
        this.buildingDesign = buildingDesign;
        this.physicalAddress = physicalAddress;
        this.ERFnumber = ERFnumber;
        this.totalFee = totalFee;
        this.totalpaidtoDate = totalpaidtoDate;
        this.dueDate = dueDate;
        this.customer = customer;
        this.architect = architect;
        this.contractor = contractor;

    }

    //Returning the customer, architect and other attributes related to the project class.
    public person getCustomer() {
        return customer;
    }

    public person getArchitect() {
        return architect;
    }

    public person getContractor() {
        return contractor;
    }

    public double getTotalFee() {
        return totalFee;
    }

    //creating a constructor when the setDueDate is called.
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    //Returning totalpaidtoDate
    public double getTotalpaidtoDate() {
        return totalpaidtoDate;
    }

    //Creating a constructor when the setTotalpaidtoDate is called.
    public void setTotalpaidtoDate(double totalpaidtoDate) {
        this.totalpaidtoDate += totalpaidtoDate;
    }

    //Creating a toString method.
    public String toString() {
        return "======PROJECT DETAILS======\n" +
                "\nproject number: " + projNum +
                "\nproject name: " + projName +
                "\nbuilding design: " + buildingDesign +
                "\nphysical address: " + physicalAddress +
                "\nERF number: " + ERFnumber +
                "\ntotal fee: " + totalFee +
                "\ntotal paid to date: " + totalpaidtoDate +
                "\ndue date: " + dueDate +
                "\n======CUSTOMER DETAILS======\n" + customer +
                "\n======ARCHITECT DETAILS======\n" + architect +
                "\n======CONTRACTOR DETAILS======\n" + contractor;

    }
}





