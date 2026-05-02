/**Programa que explica os metodos void e return, onde o void não retorna nada e o return retorna um valor, podendo ser armazenado em uma variável.
 *
 */

package main;

public class TesteFuncao01 {

    static void soma(int a, int b){
        int s = a + b;
        System.out.print("A soma é " + s);
    }

    static void main() {
        System.out.println("Começou o programa");
        soma(5, 2);
    }
}
