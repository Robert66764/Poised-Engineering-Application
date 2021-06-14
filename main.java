//Importing a Java library

import java.util.*;

//Creating various display messages, the scanners and requiring user input.
public class main {
    public static person getPerson(String type) {
        System.out.println("Please provide the name of " + type);
        Scanner ins = new Scanner(System.in);
        String name = ins.nextLine();
        System.out.println("Please provide the telephone number. ");
        Scanner telephoneNumber = new Scanner(System.in);
        Integer newTelephoneNumber = telephoneNumber.nextInt();
        System.out.println("Please provide the email address. ");
        Scanner emailAddress = new Scanner(System.in);
        String newEmailAddress = emailAddress.nextLine();
        System.out.println("Please provide the physical address. ");
        Scanner physicalAddress = new Scanner(System.in);
        String newPhysicalAddress = physicalAddress.nextLine();

//returning the attributes.
        return new person(name, newTelephoneNumber, newEmailAddress, newPhysicalAddress);
    }

    //Creating a class for the details of the project.
    public static project getProject() {
        System.out.println("Please provide the project number.");
        Scanner projNum = new Scanner(System.in);
        int newProjNum = projNum.nextInt();
        System.out.println("Please provide the project name.");
        Scanner projName = new Scanner(System.in);
        String newProjName = projName.nextLine();
        System.out.println("Please provide the building design.");
        Scanner buildingDesign = new Scanner(System.in);
        String newBuildingDesign = buildingDesign.nextLine();
        System.out.println("Please provide the physical address.");
        Scanner physicalAddress = new Scanner(System.in);
        String newPhysicalAddress = physicalAddress.nextLine();
        System.out.println("Please provide the ERF Number.");
        Scanner ERFNumber = new Scanner(System.in);
        Integer newERFNumber = ERFNumber.nextInt();
        System.out.println("Please provide the total fee.");
        Scanner totalFee = new Scanner(System.in);
        Double newTotalFee = totalFee.nextDouble();
        System.out.println("Please provide the total paid to date.");
        Scanner totalPaid = new Scanner(System.in);
        Double newTotalPaid = totalPaid.nextDouble();
        System.out.println("Please provide the due date of the project.");
        Scanner dueDate = new Scanner(System.in);
        String newDueDate = dueDate.nextLine();

//getting the details of the customer, architect and contractor.
        person cust = getPerson("customer");
        person arch = getPerson("architect");
        person cont = getPerson("contractor");

//returning the various variables.
        return new project(newProjNum, newProjName, newBuildingDesign, newPhysicalAddress, newERFNumber,
                newTotalFee, newTotalPaid, newDueDate, cust, arch, cont);

    }

    //Creating the main class
    public static void main(String args[]) {

//Displaying a message to the user
        System.out.println("Welcome to the Poised Engineering App.");
        System.out.println("I shall require a few details.");

//Getting the project details and printing them out. Getting the person details.
        project pr = getProject();
        System.out.println(pr);

//Creating a menu for various options to select as well as a scanner for user input.
        System.out.println("Please select an option from the menu.\n");
        System.out.println("1 - Change the due date.\n");
        System.out.println("2 - Change the total amount of the fee paid to date.\n");
        System.out.println("3 - Update a contractor's details.\n");
        System.out.println("4 - Finalise existing projects.");
        Scanner userInput = new Scanner(System.in);
        String newUserInput = userInput.nextLine();

//If the user selects 1 then the due date is updated.
        if (newUserInput.equals("1")) {
            System.out.println("What would you like the new due date to be ?");
            Scanner userInputDueDate = new Scanner(System.in);
            String newUserInputDueDate = userInputDueDate.nextLine();
            pr.setDueDate(newUserInputDueDate);
            System.out.println(pr);

        }

//If the user selects 2 then the total fee is updated.
        if (newUserInput.equals("2")) {
            System.out.println("How much of the total fee would you like to be paid ?");
            Scanner userInputFeePaid = new Scanner(System.in);
            double newUserInputFeePaid = userInputFeePaid.nextDouble();
            pr.setTotalpaidtoDate(newUserInputFeePaid);
            System.out.println(pr);
        }

//If the user selects 3 then the contractor's details are updated.
        if (newUserInput.equals("3")) {
            System.out.println("Please enter the new details of the contractor. ");
            System.out.println("What is the name of the contractor? ");
            Scanner NameInput = new Scanner(System.in);
            String newNameInput = NameInput.nextLine();
            System.out.println("What is the email address of the contractor? ");
            Scanner emailAddress = new Scanner(System.in);
            String newEmailAddress = emailAddress.nextLine();
            System.out.println("What is the telephone number of the contractor? ");
            Scanner telephoneNumber = new Scanner(System.in);
            Integer newTelephoneNumber = telephoneNumber.nextInt();
            System.out.println("What is the physical address? ");
            Scanner physicalAddress = new Scanner(System.in);
            String newPhysicalAddress = physicalAddress.nextLine();
            pr.getContractor().setName(newNameInput);
            pr.getContractor().setEmailAddress(newEmailAddress);
            pr.getContractor().setTelephoneNumber(newTelephoneNumber);
            pr.getContractor().setPhysicalAddress(newPhysicalAddress);
            System.out.println(pr);

        }

//Finalising the project.
        if (newUserInput.equals("4")) {
            double invoice = pr.getTotalFee() - pr.getTotalpaidtoDate();
            if (invoice != 0) {
                System.out.println(pr.getCustomer());
                System.out.println("The outstanding amount is: R" + invoice);
            }
        }
    }
}
