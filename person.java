//Creating the class with the associated variables.
public class person {
    String name;
    int telephoneNumber;
    String emailAddress;
    String physicalAddress;

    //Creating the constructor
    public person(String name, int telephoneNumber, String emailAddress, String physicalAddress) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
    }

    //Getting the various variables and then returning them.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTelephoneNumber() {
        return telephoneNumber;

    }

    public void setTelephoneNumber(Integer TelephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    //Creating the toString method.
    public String toString() {
        return "Name :" + name + "\n" +
                "Telephone Number: " + telephoneNumber + "\n" +
                "Email Address: " + emailAddress + "\n" +
                "Physical Address: " + physicalAddress;

    }
}

