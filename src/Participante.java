public class Participante {

    private String nome;
    private String cpf;
    private String telefone;
    private String dataNascimento;
    private String dataAgendamento;
    private String periodo;

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAgendamento='" + dataAgendamento + '\'' +
                ", periodo='" + periodo + '\'' +
                '}';
    }

    public Participante(String nome, String cpf, String telefone, String dataNascimento, String dataAgendamento, String periodo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.dataAgendamento = dataAgendamento;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

}
