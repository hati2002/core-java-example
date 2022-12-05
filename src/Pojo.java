import java.util.Scanner;

public class Pojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the emp name:");
        String name = sc.nextLine();

        System.out.println("enter the emp id:");
        int id = sc.nextInt();

        System.out.println("enter the emp address:");
        String address = sc.nextLine();

        try {

            if (id==345){
                System.out.println(" ID is found");
            }
            else {
                System.out.println("id not found");
            }
            System.out.println("given Employee ID is not found");
        }
        catch (Exception e){
            System.out.println("Welcome to office");
            System.out.println(e);
        }
    }
}

