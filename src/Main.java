import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Participante> participantes = new ArrayList<>();

        System.out.print("Quantos participantes irão participar: ");
        int num = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < num; i++) {
            System.out.println("Digite os dados do participante " + (i+1) + ":");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF: ");
            String cpf = scanner.nextLine();

            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            System.out.print("Data de nascimento: ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Data de agendamento: ");
            String dataAgendamento = scanner.nextLine();

            System.out.print("Período (manhã/tarde/noite): ");
            String periodo = scanner.nextLine();

            // Adicionar o participante à lista
            Participante participante = new Participante(nome, cpf, telefone, dataNascimento, dataAgendamento, periodo);
            participantes.add(participante);
        }

        // Exibir a lista de participantes
        for (Participante participante : participantes) {
            System.out.println(participante);
        }
    }
}
