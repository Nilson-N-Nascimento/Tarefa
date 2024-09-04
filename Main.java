class Tarefa {
    private String titulo;
    private String descrição;
    private String prazo;
    private int prioridade;

    //construtor
    public Tarefa(String titulo,String descrição, 
    String prazo,int prioridade){
        this.titulo = titulo;
        this.descrição = descrição;
        this.prazo = prazo;
        this.prioridade = prioridade;

    }

    //métodos Get e Set
    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
}
public class Main {
    public static void main(String[] args) {
        //ele vai saber quem alterar de acordo 
        //com a ordem do construtor
        Tarefa tarefa1 = new Tarefa("Estudar POO",
        "Revisar conceitos de classes e objetos", "04-09-2024", 1);
        System.out.println("Tarefa: " + tarefa1.getTitulo());
        tarefa1.setTitulo("Estudar Lógica de Programação");
        System.out.println("Tarefa: " + tarefa1.getTitulo());

    }
}
