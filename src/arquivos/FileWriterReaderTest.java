package arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
    
    public static void main(String[] args) {

        int numTeste = 10;
        File arquivo = new File("Arquivo.txt");

        /* cria um "escritor" que será usado para escrever no arquivo
        instanciado anteriormente */
        try {
            /* um objeto da classe FileWriter, quando instanciado, cria
            um arquivo de nome igual ao parâmetro recebido caso o mesmo
            ainda não exista */
            FileWriter fw = new FileWriter(arquivo, true);

            /* esse método escreve no arquivo o que for passado como parâmetro 
            obs: esse método irá sobrescrever o conteúdo do arquivo se o segundo
            parâmetro de FileWriter (acima) seja false */
            fw.write("Escrevendo no arquivo...\n...acabei de pular uma linha.\n");

            /* esse método garante que toda a mensagem passada anteriormente chegou
            até a long-term memory 
            obs: utilizar sempre após a escrita */
            fw.flush();

            /* obs: utilizar sempre após a escrita */
            fw.close();

            /* um objeto da classe FileReader é utilizado para ler o arquivo
            passado como parâmetro */
            FileReader fr = new FileReader(arquivo);

            /* cria um vetor de caracteres para armazenar os caracteres do arquivo */
            char[] in = new char[500];

            /* o método leitor.read(arquivo) retorna o número de caracteres lidos 
            no arquivo */
            int size = fr.read(in);

            System.out.println("tamanho do arquivo lido: " +size+ "\n");

            /* esse trecho imprime os caracteres do arquivo que fora armazenados no vetor
            de caracteres anteriormente e para quando a quantidade total de caracteres
            (que também foi obtida anteriormente) for impressa */
            for(char c: in) {
                System.out.print(c);
            }

            /* utilizar sempre após a leitura */
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
