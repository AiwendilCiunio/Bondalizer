import java.util.Scanner;

public class Bond {
    Scanner scanner;
    private String name;
    private String surname;

      
    public Bond() {
        setName();
        bondalize();
    
    }
    

    public void setName() {
        scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("What is your surname?");
        surname = scanner.nextLine();
        scanner.close();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void bondalize() {
        StringBuilder sb = new StringBuilder();
        sb.append("Your name is ");
        sb.append(getName());
        sb.append(", ");
        sb.append(getName());
        sb.append(" ");
        sb.append(getSurname());
        sb.append("!");
        System.out.println(sb.toString());
    }
}
