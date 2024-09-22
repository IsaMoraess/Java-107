/*Uma classe com um método principal que pergunta se o usuário quer: 1) calcular apotência; ou 2) verificar se um número é primo. E chama o método correspondente.
- Uma classe com um método que lê o valor da base e do expoente. Despois calcula emostra o valor da potência, sem usar qualquer função ou método de cálculo de potênciapré-existentes. Dica use aquele algoritmo para acumular produto que vimos emAlgoritmos.
Lembre-se: 23
= 2*2*2 = 6
- Uma classe com um método que lê um número e verifica se o mesmo é primo ou não.
Lembre-se: um número é primo se for divisível apenas por 1 e por ele mesmo. */

import java.util.Scanner;
public class principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Metodo metodo = new Metodo();

        System.out.println("Escolha uma opção:");
        System.out.println("1) Calcular potência");
        System.out.println("2) Verificar se um número é primo");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                metodo.calcularPotencia();
                break;
            case 2:
                metodo.verificarPrimo();
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
