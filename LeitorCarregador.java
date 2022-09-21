import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LeitorCarregador {
    
    HashMap<String, Personagem> lerPersonagem(String caminhoArquivoPersonagens)
    {
       HashMap<String, Personagem> personagens = new HashMap<String, Personagem>();
       File arquivoPersonagens = new File(caminhoArquivoPersonagens); 

       try {
        Scanner escaneadorArquivoPersonagens = new Scanner(arquivoPersonagens, "UTF-8");
    
        String nomePersonagem = "";
        String linhaEscaneada = "";
        int energiaPersonagem = 0;


        while(escaneadorArquivoPersonagens.hasNextLine())
        {
            while(!linhaEscaneada.equals("PERSONAGEM"))
            {
                linhaEscaneada = escaneadorArquivoPersonagens.nextLine();
            }
            linhaEscaneada = escaneadorArquivoPersonagens.nextLine(); //NOME
            nomePersonagem = escaneadorArquivoPersonagens.nextLine();
            linhaEscaneada = escaneadorArquivoPersonagens.nextLine(); //ENERGIA
            energiaPersonagem = Integer.parseInt(escaneadorArquivoPersonagens.nextLine());
            personagens.put(nomePersonagem, new Personagem(nomePersonagem, energiaPersonagem));
        }

        escaneadorArquivoPersonagens.close();
    } 
    catch (FileNotFoundException exception) 
    {
        // TODO Auto-generated catch block
        exception.printStackTrace();
    }
      return personagens;
    }
}
