import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        // Variables
        double peso, altura;

        Scanner scanner = new Scanner(System.in);

        // Invocación de los métodos
        peso = LecturaPeso(scanner);
        altura = LecturaAltura(scanner);

        // Método para calcular IMC
        CalcularIMC(peso,altura);

        scanner.close();
    }

    private static void CalcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);

        // Mostrar el IMC con dos decimales
        System.out.printf("Tu IMC es: %.2f\n", imc);

        // Clasificación del IMC
        if (imc < 18.5){
            System.out.print("Tienes bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.print("Tienes peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.print("Tienes sobrepeso");
        } else {
            System.out.print("Tienes obesidad");
        }
    }

    private static double LecturaAltura(Scanner scanner) {
        // Lectura de altura
        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        // Validación de altura
        if(altura <= 0){
            System.out.print("La altura NO puede ser menor o igual a 0!\n");

            // Utilizamos recursividad para volver a capturar la altura hasta que sea mayor a 0
            altura = LecturaAltura(scanner);
        }

        return altura;
    }

    private static double LecturaPeso(Scanner scanner) {
        // Lectura de peso
        System.out.print("Introduce tu peso en kg: ");
        double peso = scanner.nextDouble();

        // Validación de peso
        if(peso <= 0){
            System.out.print("El peso NO puede ser menor o igual a 0!\n");

            // Utilizamos recursividad para volver a capturar el peso hasta que sea mayor a 0
            peso = LecturaPeso(scanner);
        }

        return peso;
    }
}