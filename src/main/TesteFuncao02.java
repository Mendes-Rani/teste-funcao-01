/**Programa que explica os metodos void e return, onde o void não retorna nada e o return retorna um valor, podendo ser armazenado em uma variável.
 *
 */
package main;

public class TesteFuncao02 {
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }

    static void main() {
        System.out.println("Começou o programa");
        int sm = soma(5, 2);
        System.out.println("A soma é " + sm);
    }
}
