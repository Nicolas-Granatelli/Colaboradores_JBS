import java.util.ArrayList;
import java.util.List;

public class ParticipanteTest {
    public static void main(String[] args) {
        List<Participante> participantes = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String nome = "Participante " + i;
            String cpf = "CPF " + "teste" + i;
            String telefone = "Telefone " + "teste" + i;
            String dataNascimento = "Data de Nascimento " + "teste" + i;
            String dataAgendamento = "Data de Agendamento "+ "teste" + i;
            String periodo = "Período " + "teste" + i;
            Participante participante = new Participante(nome, cpf, telefone, dataNascimento, dataAgendamento, periodo);
            participantes.add(participante);
        }

        for (Participante participante : participantes) {
            System.out.println(participante);
        }
    }
}
