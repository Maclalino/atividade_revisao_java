import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();

        // ✅ Itens pré-cadastrados
        inventario.adicionar(new SkinPersonagem(
                "SK001", "Cyber Ninja", "Épica",
                "NinjaX", "Neon"));

        inventario.adicionar(new Emote(
                "EM001", "Dança Robótica", "Rara",
                5, "Dancinha do Robô"));

        inventario.adicionar(new Spray(
                "SP001", "Dragão Digital", "Lendária",
                "Dragão Flamejante", true));

        int opcao;

        do {
            System.out.println("\n=== MENU INVENTÁRIO ===");
            System.out.println("1 - Adicionar Skin");
            System.out.println("2 - Adicionar Emote");
            System.out.println("3 - Adicionar Spray");
            System.out.println("4 - Listar Tudo");
            System.out.println("5 - Listar Equipados");
            System.out.println("6 - Equipar por ID");
            System.out.println("7 - Desequipar por ID");
            System.out.println("8 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("ID: ");
                    String idSkin = sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeSkin = sc.nextLine();

                    System.out.print("Raridade: ");
                    String raridadeSkin = sc.nextLine();

                    System.out.print("Personagem: ");
                    String personagem = sc.nextLine();

                    System.out.print("Cor/Tema: ");
                    String corTema = sc.nextLine();

                    inventario.adicionar(new SkinPersonagem(
                            idSkin, nomeSkin, raridadeSkin,
                            personagem, corTema));
                    break;

                case 2:
                    System.out.print("ID: ");
                    String idEmote = sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeEmote = sc.nextLine();

                    System.out.print("Raridade: ");
                    String raridadeEmote = sc.nextLine();

                    System.out.print("Duração (segundos): ");
                    int duracao = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Referência do meme: ");
                    String meme = sc.nextLine();

                    inventario.adicionar(new Emote(
                            idEmote, nomeEmote, raridadeEmote,
                            duracao, meme));
                    break;

                case 3:
                    System.out.print("ID: ");
                    String idSpray = sc.nextLine();

                    System.out.print("Nome: ");
                    String nomeSpray = sc.nextLine();

                    System.out.print("Raridade: ");
                    String raridadeSpray = sc.nextLine();

                    System.out.print("Arte: ");
                    String arte = sc.nextLine();

                    System.out.print("É animado? (true/false): ");
                    boolean animado = sc.nextBoolean();
                    sc.nextLine();

                    inventario.adicionar(new Spray(
                            idSpray, nomeSpray, raridadeSpray,
                            arte, animado));
                    break;

                case 4:
                    inventario.listarTudo();
                    break;

                case 5:
                    inventario.listarEquipados();
                    break;

                case 6:
                    System.out.print("Digite o ID para equipar: ");
                    String idEquipar = sc.nextLine();
                    inventario.equiparPorId(idEquipar);
                    break;

                case 7:
                    System.out.print("Digite o ID para desequipar: ");
                    String idDesequipar = sc.nextLine();
                    inventario.desequiparPorId(idDesequipar);
                    break;

                case 8:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 8);

        sc.close();
    }
}
