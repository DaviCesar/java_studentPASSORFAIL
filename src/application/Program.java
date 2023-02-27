package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);



        System.out.println("=====STUDENT_PASS_OR_FAIL=====");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("1* Nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("2* Nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("3* Nota: ");
        double nota3 = sc.nextDouble();
        Student student = new Student(name, nota1, nota2, nota3);

        System.out.printf("%nFINAL GRADE = %.2f%n", student.somaTotal());

        if (student.somaTotal() < 60 ){
            System.out.println("FAILED!");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }else {
            System.out.println("PASSED!");
        }

        sc.close();
    }
}
