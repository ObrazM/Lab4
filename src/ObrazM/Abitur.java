package ObrazM;

public class Abitur implements java.io.Serializable{
    int number;
    String lastName;
    String name;
    String fatherName;
    int yearOfBirth;
    int mark1;
    int mark2;
    int mark3;
    double averCertificate;

    public Abitur(int number,String lastName,String name,String fatherName,int yearOfBirth,int mark1,int mark2,int mark3, double averCertificate)
    {
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.fatherName = fatherName;
        this.yearOfBirth = yearOfBirth;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.averCertificate = averCertificate;
    }
}
