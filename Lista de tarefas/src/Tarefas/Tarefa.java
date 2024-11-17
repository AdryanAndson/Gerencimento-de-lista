package Tarefas;

public class Tarefa {
	public int id;
	private String titulo;
	private String descricao;
	private String data;
	
	
	public Tarefa(int id, String titulo, String descricao, String data) {
		
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.data = data;
	}
	@Override
	public String toString() {
		return  id + "-" + titulo + ": " + descricao + " (" + data + ")";
	}
	
}
