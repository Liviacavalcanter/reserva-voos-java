package reservavoos;

import reservavoos.servico.GerenciamentoReserva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciamentoReserva gerenciamentoReserva = new GerenciamentoReserva();

        while (true) {
            System.out.println("Menu de Reservas:");
            System.out.println("1. Cadastrar Reserva");
            System.out.println("2. Editar Reserva");
            System.out.println("3. Listar Reservas");
            System.out.println("4. Deletar Reserva");
            System.out.println("5. Buscar Reserva Por CPF");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gerenciamentoReserva.cadastrar();
                    break;
                case 2:
                    gerenciamentoReserva.editarPeloNome();
                    break;
                case 3:
                    gerenciamentoReserva.listar();
                    break;
                case 4:
                    gerenciamentoReserva.deletar();
                    break;
                case 5:
                    gerenciamentoReserva.buscarReservaPorCpf();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
