package devdojo.maratonaJava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int age = (int) 2600000000L;
        long numeroGrande = 10000000L;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0F;
        byte idadeByte = 40;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        System.out.println("A idade é: " + age + " anos!");
        System.out.println("A idade é: " + numeroGrande + " anos!");
        System.out.println("A idade é: " + salarioDouble + " anos!");
        System.out.println("A idade é: " + salarioFloat + " anos!");
        System.out.println("A idade é: " + idadeByte + " anos!");
        System.out.println("A idade é: " + idadeShort + " anos!");
        System.out.println("A idade é: " + verdadeiro + " anos!");
        System.out.println("A idade é: " + falso + " anos!");
        System.out.println("A idade é: " + caractere + " anos!");
    }
}
