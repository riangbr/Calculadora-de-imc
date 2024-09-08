import java.util.Scanner;


public class calcularImc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = calcularImc(peso , altura);

        System.out.printf("seu IMC é : %.2f\n" , imc);
        System.out.println("Categoria" +  clasificarImc(imc));
    }

    public static double calcularImc(double peso , double altura){
        //calcular imc!!
        return peso / (altura * altura);
    }
    public static String clasificarImc(double imc){
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc < 39.9) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III";
        }

    }
}