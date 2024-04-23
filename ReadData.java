import java.util.Scanner;
public class ReadData {
    public static void main(String[] args) {
        System.out.print("Enter id, Name and Sal: ");
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        float sal = sc.nextFloat();

        System.out.println("Id ="+ id);
        System.out.println("Name ="+ name);
        System.out.println("Salary ="+ sal);

    }
}
