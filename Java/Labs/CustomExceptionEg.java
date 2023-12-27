package in.anudip.java_prac;

import java.util.Scanner;

public class CustomExceptionEg {

    static public void check(int age, int passout) throws InvalidStudentException {
        if (age >= 18 && age <= 25) {
            if (passout <= 2022) {
                System.out.println("you are eligible to enroll in the course");
            } else {
                throw new InvalidStudentException("Category not match for enrollment");
            }
        } else {
            throw new InvalidStudentException("Category not match for enrollment");
        }
    }

    public static void main(String[] args) throws InvalidStudentException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter passout");
        int passout = sc.nextInt();

        CustomExceptionEg.check(age, passout);
        sc.close();
    }
}
