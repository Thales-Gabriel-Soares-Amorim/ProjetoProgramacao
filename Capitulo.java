import java.util.ArrayList;
import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private ArrayList<Escolha> escolhas;
    private Personagem perso;
    private int alterarEnergia;
    private Scanner escaneador;

    public Capitulo(String nome,
            String texto,
            Personagem perso,
            int alterarEnergia,
            Scanner escaneador) {

        this.nome = nome;
        this.texto = texto;
        this.perso = perso;
        this.alterarEnergia = alterarEnergia;
        this.escaneador = escaneador;
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

    public void adicionarEscolha(Escolha escolha) {
        this.escolhas.add(escolha);
    }
}