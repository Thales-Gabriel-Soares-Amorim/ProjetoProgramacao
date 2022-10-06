public class Personagem {
    private String nome;
    private int energia;

    public Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }

    public void alterarEnergia(int alteracao) {
        this.energia += alteracao;
        if (alteracao > 0) {

            System.out.println(this.nome + " ganhou " + alteracao + " e ficou com um total de " + this.energia
            + " de motivação");

        } else if (alteracao < 0) {

            System.out.println(this.nome + " perdeu " + -alteracao + " e ficou com um total de " + this.energia
            + " de motivação");
        }

        if (this.energia > 100) {

            this.energia = 100;
            
        } else if (this.energia <= 0) {

            this.energia = 0;
            System.out.println("O personagem " + this.nome + " perdeu a vontade de comntinuar o dia!");
        }
    }
}
