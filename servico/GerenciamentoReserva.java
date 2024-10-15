package reservavoos.servico;

import reservavoos.Cliente;
import reservavoos.Reserva;
import reservavoos.modelo.Voo;
import reservavoos.modelo.VooInternacional;
import reservavoos.modelo.*;

import java.util.*;

public class GerenciamentoReserva{
    private ArrayList<Reserva> listareserva = new ArrayList<>();
    private Map<String, Reserva> mapaReservaPorCpf = new HashMap<>();

    Scanner scanner = new Scanner(System.in);

    public void cadastrar() {
        System.out.println("Cadastro de Reserva");
        System.out.println("Informe o nome completo:");
        String nome = scanner.nextLine();
        System.out.println("Informe o CPF:");
        String cpf = scanner.nextLine();
        System.out.println("Informe o email:");
        String email = scanner.nextLine();
        Cliente cliente = new Cliente(nome, cpf, email);

        System.out.println("Selecione o tipo de voo:");
        System.out.println("1. Voo Internacional");
        System.out.println("2. Voo Nacional");
        int tipoVoo = scanner.nextInt();
        scanner.nextLine();

        Voo voo;
        if (tipoVoo == 1) {
            System.out.println("Informe o número do voo:");
            String numero = scanner.nextLine();
            System.out.println("Informe o país de origem:");
            String origem = scanner.nextLine();
            System.out.println("Informe o país de destino:");
            String destino = scanner.nextLine();
            System.out.println("Informe a data do voo:");
            String data = scanner.nextLine();
            System.out.println("Informe a hora do voo:");
            String hora = scanner.nextLine();
            voo = new VooInternacional(numero, origem, destino, data, hora);
        } else if (tipoVoo == 2) {
            System.out.println("Informe o número do voo:");
            String numero = scanner.nextLine();
            System.out.println("Informe a cidade de origem:");
            String origem = scanner.nextLine();
            System.out.println("Informe a cidade de destino:");
            String destino = scanner.nextLine();
            System.out.println("Informe a data do voo:");
            String data = scanner.nextLine();
            System.out.println("Informe a hora do voo:");
            String hora = scanner.nextLine();
            voo = new VooInternacional(numero, origem, destino, data, hora);
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        System.out.println("Selecione o tipo de assento:");
        System.out.println("1. Assento Executivo");
        System.out.println("2. Assento Economico");
        int tipoAssento = scanner.nextInt();
        scanner.nextLine();

        Assento assento;
        if (tipoAssento == 1) {
            System.out.println("Informe o número do assento:");
            String numeroAssento = scanner.nextLine();
            assento = new AssentoExecutivo();
        } else if (tipoAssento == 2) {
            System.out.println("Informe o número do assento:");
            String numeroAssento = scanner.nextLine();
            assento = new AssentoEconomico();
        } else {
            System.out.println("Opção inválida.");
            return;
        }

        Reserva reserva = new Reserva(cliente, voo, assento);
        listareserva.add(reserva);
        System.out.println("Reserva cadastrada com sucesso!");
        }
        public void editarPeloNome () {
            System.out.println("Informe o nome para editar a reserva:");
            String cpfNovo = scanner.nextLine();
            Reserva edicao = null;
            for (Reserva c : listareserva) {
                if (c.getCliente().getNome().equals(cpfNovo)) {
                    edicao = c;
                    break;
                }
            }
            if (edicao == null) {
                System.out.println("Reserva não encontrada.");
                return;
            }
            System.out.println("Informe o novo nome do cliente:");
            String nomeNovo = scanner.nextLine();
            edicao.getCliente().setNome(nomeNovo);
            System.out.println("Reserva editada com sucesso!");
        }
    public void listar() {
        System.out.println("Listagem de Reservas:");
        for (Reserva i : listareserva) {
            System.out.println("Dados do Cliente: " + i.getCliente().toString() + "/n Dados do Voo: " + i.getVoo().toString() + "Dados do Assento: " + i.getAssento().toString());
        }
        }
    public void deletar () {
        System.out.println("Informe o CPF para excluir a reserva:");
        String cpfNovo = scanner.nextLine();
        Reserva apagar = null;
        for (Reserva d : listareserva) {
            if (d.getCliente().getCpf().equals(cpfNovo)) {
                apagar = d;
                break;
            }
        }
        if (apagar == null) {
            System.out.println("Reserva não encontrada.");
            return;
        }
        listareserva.remove(apagar);
        System.out.println("Reserva excluída com sucesso!");
    }
    public void buscarReservaPorCpf() {
            System.out.println("Informe o CPF para buscar");
            String cpfNovo = scanner.nextLine();
            Reserva busca = null;
            for (Reserva b : listareserva) {
                if (b.getCliente().getCpf().equals(cpfNovo)) {
                    busca = b;
                    break;
                }
            }
            if (busca == null) {
                System.out.println("Reserva não encontrada.");
                return;
    }
        System.out.println("Info. do CPF: (" + busca.getCliente().getCpf() + "): " + busca.getCliente().toString());
    }

}
