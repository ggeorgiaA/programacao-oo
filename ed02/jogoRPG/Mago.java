class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 80, 25);
    }

    @Override
    public void defender(int dano) {
        hp -= dano; // Defesa fraca
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa Bola de Fogo!");
        ataqueBase += 15;
    }
}
