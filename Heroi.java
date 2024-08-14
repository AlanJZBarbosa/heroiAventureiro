public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void atacar() {
        String ataque;
        switch (this.tipo) {
            case "mago":
                ataque = " magia";
                break;
            case "guerreiro":
                ataque = "uma espada";
                break;
            case "monge":
                ataque = "as artes marciais";
                break;
            case "ninja":
                ataque = "uma shuriken";
                break;
            default:
                ataque = " um ataque desconhecido";
        }
        System.out.println("O " + this.tipo + " atacou usando " + ataque);
    }

    public static void main(String[] args) {
        Heroi heroi1 = new Heroi("Aragorn", 87, "guerreiro");
        Heroi heroi2 = new Heroi("Gandalf", 2019, "mago");
        Heroi heroi3 = new Heroi("Bruce Lee", 32, "monge");
        Heroi heroi4 = new Heroi("Naruto", 17, "ninja");

        heroi1.atacar(); // O guerreiro atacou usando espada
        heroi2.atacar(); // O mago atacou usando magia
        heroi3.atacar(); // O monge atacou usando artes marciais
        heroi4.atacar(); // O ninja atacou usando shuriken
    }
}
