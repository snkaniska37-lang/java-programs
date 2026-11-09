import java.util.*;

public class gradeCalculation_method {

    static String name, dept, reg,grade;
    static int yr,m1, m2, m3, m4, m5;
    static double avg;
    

    static void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        name = sc.nextLine();

        System.out.print("Enter Your Department: ");
        dept = sc.nextLine();

        System.out.print("Enter Your Reg.no: ");
        reg = sc.nextLine();

        System.out.print("Current year: ");
        yr = sc.nextInt();
    }

    static void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter subject 1 mark: ");
        m1 = sc.nextInt();

        System.out.print("Enter subject 2 mark: ");
        m2 = sc.nextInt();

        System.out.print("Enter subject 3 mark: ");
        m3 = sc.nextInt();

        System.out.print("Enter subject 4 mark: ");
        m4 = sc.nextInt();

        System.out.print("Enter subject 5 mark: ");
        m5 = sc.nextInt();
    }

    static void calAvg() {
        avg = (m1 + m2 + m3 + m4 + m5) / 5.0;
    }

    static void gradecalculate() {

        if (m1 >= 30 && m1 <= 100 && m2 >= 30 && m2 <= 100 && m3 >= 30 && m3 <= 100 && m4 >= 30 && m4 <= 100 && m5 >= 30 && m5 <= 100) {

            if (avg >= 90) {
                grade="You got A+ grade.";
            }
            else if (avg >= 80) {
                grade="You got A grade.";
            }
            else if (avg >= 70) {
                grade="You got B grade.";
            }
            else if (avg >= 60) {
                grade="You got C grade.";
            }
            else if (avg >= 50) {
                grade="You got D grade.";
            }
            else {
                grade="You got E grade.";
            }
        }
        else {
            if (m1 < 30 || m2 < 30 || m3 < 30 || m4 < 30 || m5 < 30) {
                grade="You got fail mark.";
            }
            else {
                grade="Stick within 100.";
            }
        }
    }

    static void display() {
        System.out.println("Your name: " + name);
        System.out.println("Your Department: " + dept);
        System.out.println("Your Reg.no: " + reg);
        System.out.println("Your current year: " + yr);
    }

    static double calculatePercentage() {
        return avg;
    }

    public static void main(String[] args) {

        getDetails();
        getMarks();
        calAvg();
        gradecalculate();
        display();
        System.out.println(grade);
        System.out.printf("Your percentage: %.2f%%", calculatePercentage());
    }
}