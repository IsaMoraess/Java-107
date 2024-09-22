import java.util.Scanner;
class Metodo {
    // Método para calcular a potência
    public void calcularPotencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();
        int resultado = 1;

        for (int i = 0; i < expoente; i++) {
            resultado *= base;
        }
        System.out.println("Resultado: " + resultado);
    }

    // Método para verificar se um número é primo
    public void verificarPrimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        boolean isPrimo = true;

        if (numero <= 1) {
            isPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
        }

        if (isPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}