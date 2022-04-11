package arquivos;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class Buffered {
    
    public static void main(String[] args) {

        File arquivo = new File("arquivo2.txt");

        try {
            FileWriter fw = new FileWriter(arquivo, true);

            /* escrever com bufferedWriter é quase igual a escrever com FileWriter
            a diferença é que o bw recebe o fw como parâmetro */
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Essa mensagem vai ser escrita no arquivo");
            bw.newLine(); //esse método adiciona o caractere de quebra de linha ao arquivo
            bw.flush();
            bw.close();


            FileReader fr = new FileReader(arquivo);

            BufferedReader br = new BufferedReader(fr);


            //essa é uma forma de ler o conteúdo do arquivo
            /*
            char[] in = new char[500];

            int size = br.read(in);

            System.out.println("Tamanho do arquivo lido: " +size+ "\n");

            for(char c: in) {
                System.out.print(c);
            }

            br.close();
            */

            //essa é outra forma de ler o conteúdo do arquivo
            String s = null;
            
            /* o método readLine retorna uma string que é igual a uma linha inteira
            lida no arquivo */
            while((s = br.readLine()) != null) {
                System.out.print(s);
            }
            System.out.println();

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
