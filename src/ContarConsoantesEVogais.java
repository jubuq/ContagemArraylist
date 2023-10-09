import java.util.ArrayList;
import java.util.Scanner;
public class ContarConsoantesEVogais {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Digite algo separado por espaço (após digitar, digite 'fim'):");
 String input = "";
 ArrayList<Character> listaCaracteres = new ArrayList<>();
 int consoantes = 0;
 int vogais = 0;
 while (!(input = scanner.next()).equalsIgnoreCase("fim")) {
 char ch = input.charAt(0);
 if (Character.isLetter(ch)) {
 if ("aeiouAEIOU".indexOf(ch) != -1) {
 vogais++;
 } else {
 consoantes++;
 }
 listaCaracteres.add(ch); // Adiciona o caractere à lista
 }
 }
 System.out.println("Consoantes: " + consoantes);
 System.out.println("Vogais: " + vogais);
 System.out.println("Lista " + listaCaracteres);
 scanner.close();
 }
}