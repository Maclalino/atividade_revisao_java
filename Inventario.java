import java.util.ArrayList;

public class Inventario {

    private ArrayList<ItemCosmetico> itens;

    public Inventario() {
        itens = new ArrayList<>();
    }

    public void adicionar(ItemCosmetico item) {

        if (buscarPorId(item.getId()) != null) {
            System.out.println("Erro: ID já existente!");
            return;
        }

        itens.add(item);
        System.out.println("Item adicionado com sucesso!");
    }

    public ItemCosmetico buscarPorId(String id) {
        for (ItemCosmetico item : itens) {
            if (item.getId().equalsIgnoreCase(id)) {
                return item;
            }
        }
        return null;
    }

    public void listarTudo() {
        for (ItemCosmetico item : itens) {
            System.out.println(item.detalhes());
            System.out.println("Efeito: " + item.efeito());
            System.out.println("----------------------------");
        }
    }

    public void listarEquipados() {
        for (ItemCosmetico item : itens) {
            if (item.isEquipado()) {
                System.out.println(item.detalhes());
            }
        }
    }

    public void equiparPorId(String id) {
        ItemCosmetico item = buscarPorId(id);
        if (item != null) {
            item.equipar();
        } else {
            System.out.println("Item não encontrado!");
        }
    }

    public void desequiparPorId(String id) {
        ItemCosmetico item = buscarPorId(id);
        if (item != null) {
            item.desequipar();
        } else {
            System.out.println("Item não encontrado!");
        }
    }
}
