public class TarefaUrgente extends Tarefa {
    private String razaoUrgencia;
    public TarefaUrgente(String titulo, String descricao, String prazo,
    String razaoUrgencia) {
        super(titulo, descricao, prazo, 5); // new Tarefa()
        this.razaoUrgencia = razaoUrgencia;
    }
    // Método Getters e Setters
    public String getRazaoUrgencia()
    return this.razaoUrgencia;

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Razão de Urgencia: " + razaoUrgencia)
    }
}
