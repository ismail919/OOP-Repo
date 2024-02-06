import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Students Points;\n");

        String[] name = {"Joe\t\t\t43\t\t7\t\t50", "William\t\t50\t\t8\t\t58", "Mary Sue\t39\t\t10\t\t49", "Ismail\t\t23\t\t2\t\t91", "Khan\t\t23\t\t65\t\t76"};
        int lab = 0, bonus, total;

        System.out.println("Name\t\tLab\t\tBonus\tTotal");
        System.out.println("----\t\t---\t\t-----\t-----");

        for (String s : name)
        {
            System.out.println(s);
        }

    }

}