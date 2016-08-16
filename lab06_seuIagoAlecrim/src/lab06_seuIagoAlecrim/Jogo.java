package lab06_seuIagoAlecrim;

import java.util.Set;

public class Jogo {
	private String nome;
	private double preco;
	private int maiorScore;
	private int quantidadeJogada;
	private int concluiuJogo;
	private String tipo;
	private Set <String> Estilos;
	
	
	
	public void registraJogada(int scoreAtual, boolean zerou ){
		if (scoreAtual > maiorScore){
			maiorScore = scoreAtual;
			}
		
		if (zerou == true){
			concluiuJogo += 1;
		}
		
		
	}
	
	public Jogo(String nome, double preco, String tipo, Set<String> estilos){
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
	}

}
