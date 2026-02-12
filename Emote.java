public class Emote extends ItemCosmetico {

    private int duracaoSegundos;
    private String memeRef;

    public Emote(String id, String nome, String raridade,
                 int duracaoSegundos, String memeRef) {
        super(id, nome, raridade);
        this.duracaoSegundos = duracaoSegundos;
        this.memeRef = memeRef;
    }

    @Override
    public String efeito() {
        return "Animação de " + duracaoSegundos +
               "s com som especial - Referência: " + memeRef;
    }

    @Override
    public String detalhes() {
        return super.detalhes() +
               " | Duração: " + duracaoSegundos + "s" +
               " | Meme: " + memeRef;
    }
}
