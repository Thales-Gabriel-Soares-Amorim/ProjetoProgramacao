public class Personagem {
    private String nome;
    private int energia;

// construtor
    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    
    public void alterarEnergia(int alteracao) {
        this.energia = this.energia + alteracao;

//texto das ações
        if (alteracao > 0) {
            System.out.println(
                    "Ao fazer isso, o " + this.nome + " recuperou " + alteracao + " pontos de energia.");
        } else {
            System.out.println("Ao fazer isso, o " + this.nome + " perdeu " + alteracao + " pontos de energia");
        }

        //mensagem de gameover
        if (this.energia > 100) {
            this.energia = 100;
        } else if (this.energia <= 0) {
            this.energia = 0;
            System.out.println("o " + this.nome + " se esgotou, não consegue mais correr.");
        }
    }
}