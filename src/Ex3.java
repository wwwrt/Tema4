import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți textul: ");
        String linieCitita = scanner.nextLine();
        System.out.print("Introduceți numele fișierului: ");
        String numeFisier = scanner.nextLine();
        
        BufferedReader reader = new BufferedReader(new FileReader(numeFisier));
        String linieFisier;
        int numarLiniiEgale = 0;
        while ((linieFisier = reader.readLine()) != null) {
            if (linieFisier.equals(linieCitita)) {
                numarLiniiEgale++;
            }
        }
        reader.close();
        scanner.close();
        
        System.out.println("Numărul de linii egale din fișierul " + numeFisier + " este: " + numarLiniiEgale);
    }
}
