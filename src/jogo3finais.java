import java.util.Scanner;
public class jogo3finais {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in); 
            Personagem perso = new Personagem("JeremiasCrayCray",0);
            
           // Personagem perso2 = new Personagem("Zara",50);
           //Apresentação dos Capítulos//
            Capitulos raiz = new Capitulos("DIA COMUM",
            "Acorda tarde da manhã, o barulho do lado de fora do quarto é grande,"
            + "pega a lista e sai de casa"+
            "\nComeço do dia, para a praça vou pelo ferro velho ou pela via? Pelo ferro velho é mais rápido, mas é sujo."
                                          , 
                                            perso ,
                                            50,
                                            input);     
          Capitulos cap2 = new Capitulos(".", 
                                            ".", 
                                            perso, 
                                            -55,
                                            input);                                      
            Capitulos cap3 = new Capitulos(".",
                                        ".", 
                                        perso, 
                                        30,
                                        input);                 
            Capitulos cap5 = new Capitulos("", 
            " "
                                             , 
                                             perso, 
                                             20,
                                             input);
            Capitulos cap6 = new Capitulos("", 
                                            "", 
                                            perso, 
                                            -45,
                                            input);                                                          
            Capitulos cap7 = new Capitulos("", 
                                                 "",                                                
                                                 perso, 
                                                 10,
                                                 input);                                                             
            Capitulos cap4 = new Capitulos("", 
                                                ".", 
                                                perso, 
                                                -15,
                                                input);                                                              
            
// opção de escolhas
            //nomecapitulo.nome arraylist.add(new ClassConstrutor(Parâmetros do Objeto))      
            //Referenciando as respostas com os capítulos.                       
            raiz.escolhas.add(new Escolha("", cap3));
            raiz.escolhas.add(new Escolha("", cap2));
            cap3.escolhas.add(new Escolha("", cap5));
            cap3.escolhas.add(new Escolha("", cap4));
            cap5.escolhas.add(new Escolha("", cap6));
            cap5.escolhas.add(new Escolha("", cap7));
            //Capitulo raiz.   
            raiz.mostrar();

                 input.close();  
        }             
    } 