public class Personagem {
    String nomeA;
    int energia;

    // Igualando as instâncias da minha class com os parametros do meu objeto.
    Personagem(String nomeP, int energia) {
        this.nomeA = nomeP;
        this.energia = energia;
    }

    void energy(int quantidade) {

        this.energia = this.energia + quantidade;

        if (this.energia >= 50) {

            System.out.println(this.nomeA + " ganhou " + quantidade + " e ficou com um total de " + this.energia
                    + " de motivação");
        }

        else if (this.energia < 50) {
            System.out.println(this.nomeA + " perdeu " + quantidade + " e ficou com um total de " + this.energia
                    + " de motivação");
        } else if (this.energia == 0) {
            System.out.println(" O personagem " + this.nomeA + " perdeu a vontade de comntinuar o dia!");
        }
    }
}