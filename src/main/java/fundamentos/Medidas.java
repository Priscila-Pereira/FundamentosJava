// 1 - Pacote
package fundamentos;


// 2 - Bicliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos
    static Scanner entrada;

    // 3.2 - Metodos e funções

    public static void main(String[] args) throws IllegalStateException {
        String opcao;
        int area = 0; // receber o resultados dos calculos de areas
        entrada = new Scanner(System.in); // Instanciar o objeto de leitura do console

        System.out.println("Escolha oalculo de desejado");
        System.out.println("(1) - Area do quadrado");
        System.out.println("(2) - Area do retângulo");
        System.out.println("(3) - Area do triângulo");
        System.out.println("(4) - Area do círculo");

        opcao = entrada.nextLine(); // leitura da opcao
        switch (opcao) {
            case "1":
                area = calcularAreaDoQuadrado();

                break;
            case "2":
                // ToDo: calcular area do retangulo
                break;
            default:
                System.out.println("Opcao  Invalida: " + opcao);


        }
        if (area > 0) {
            System.out.println("A are é de " + area + "m²");
        }
    }
    public static int calcularAreaDoQuadrado() {

        int lado; // é o tamanho da lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado //nextInt é para retornar o próximo inteiro, não aceita String
        return lado * lado; // retorna a área do quadrado

    }


}