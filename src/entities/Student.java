package entities;

public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double somaTotal(){
        return nota1 + nota2 + nota3;
    }

    public double missingPoints(){
        return 60 - somaTotal();
    }
}
