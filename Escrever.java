import java.io.FileWriter;
import java.io.IOException;

public class Escrever {

    public static void main(String[] args) {

        try {
            FileWriter escritor = new FileWriter(
                    "/Users/matbo/OneDrive/Documentos/Java - arquivos/arquivos/src/arquivo.txt");

            escritor.write("Esta é a primeira linha do arquivo.\n");
            escritor.write("Esta é a segunda linha do arquivo.\n");
            escritor.write("Esta é a terceira linha do arquivo.\n");

            escritor.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo.");
        }

    }

}