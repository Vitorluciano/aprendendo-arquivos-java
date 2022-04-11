package arquivos;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws Exception {
        
        /*esse trecho de código não cria o arquivo apenas constrói um objeto do tipo File
        a partir do qual pode-se realizar algumas ações, em particular, criar o arquivo
        */
        File arquivo = new File("meuArquivo.txt");

        /*
        esse trecho cria o arquivo do tipo File (caso ele não exista ainda) instaciado no trecho anterior
        */
        try {
            arquivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
