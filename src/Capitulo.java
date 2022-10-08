import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//construtor
public class Capitulo {
    private String titulo;
    private String texto;
    protected ArrayList<Escolha> escolhas;
    private Personagem perso;
    private int alterarEnergia;
    private Scanner escaneador;

    //capitulo é capaz de ler a si mesmo
    protected Capitulo() {}

    public Capitulo(String nome,
            String texto,
            Personagem perso,
            int alterarEnergia,
            Scanner escaneador) {

        this.titulo = nome;
        this.texto = texto;
        this.perso = perso;
        this.alterarEnergia = alterarEnergia;
        this.escaneador = escaneador;
        this.escolhas = new ArrayList<Escolha>();
    }

    public Capitulo(HashMap<String, Personagem> personagens, Scanner escaneadorConsole,
            Scanner escaneadorArquivoCapitulos) {
        this.ler(personagens, escaneadorConsole, escaneadorArquivoCapitulos);
        this.escolhas = new ArrayList<Escolha>();
    }

    public void mostrar() {
        System.out.println(this.texto);
        this.perso.alterarEnergia(this.alterarEnergia);
        System.out.println();

        if (this.escolhas.size() > 0) {
            for (Escolha escolha : escolhas) {
                System.out.println(escolha.getTexto());
            }

            int idEscolha = escolher();
            this.escolhas.get(idEscolha).getProximo().mostrar();

        }

    }

    private int escolher() {
        int idEscolha = -1;
        String receba = escaneador.nextLine();

        for (int i = 0; i < escolhas.size(); i++) {
            if (receba.equals(escolhas.get(i).getTexto())) {
                idEscolha = i;
            }
        }
        return idEscolha;
    }

    protected void ler(HashMap<String, Personagem> personagens, Scanner escaneadorConsole,
            Scanner escaneadorArquivoCapitulos) {
        String linhaEscaneada;

        this.escaneador = escaneadorConsole;

        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Titulo
        this.titulo = escaneadorArquivoCapitulos.nextLine();

        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Texto
        this.texto = escaneadorArquivoCapitulos.nextLine();

        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Personagem
        this.perso = personagens.get(escaneadorArquivoCapitulos.nextLine());

        linhaEscaneada = escaneadorArquivoCapitulos.nextLine(); // Variação de Energia
        this.alterarEnergia = Integer.parseInt(escaneadorArquivoCapitulos.nextLine());
    }

    public void adicionarEscolha(Escolha escolha) {
        this.escolhas.add(escolha);
    }

    public String getTitulo() {
        return this.titulo;
    }
}