import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ler {

    public static void main(String[] args) {

        try {
            File arquivo = new File("/Users/matbo/OneDrive/Documentos/Java - arquivos/arquivos/src/arquivo.txt");
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                System.out.println(linha);
            }

            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }

    }

}