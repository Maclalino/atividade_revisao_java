public class Spray extends ItemCosmetico {

    private String arte;
    private boolean animado;

    public Spray(String id, String nome, String raridade,
                 String arte, boolean animado) {
        super(id, nome, raridade);
        this.arte = arte;
        this.animado = animado;
    }

    @Override
    public String efeito() {
        if (animado) {
            return "Pichação digital animada: " + arte;
        } else {
            return "Spray estático: " + arte;
        }
    }

    @Override
    public String detalhes() {
        return super.detalhes() +
               " | Arte: " + arte +
               " | Animado: " + (animado ? "Sim" : "Não");
    }
}
