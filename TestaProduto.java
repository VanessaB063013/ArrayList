package br.com.generation.produto;

import java.util.ArrayList;


import br.com.generation.collections3.Aluno;

public class TestaProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto ("1 Blusa preta", 5454 , 49.9);
		Produto p2 = new Produto ("2 Blusa branca", 5858, 39.9);
		Produto p3 = new Produto ("3 Blusa azul", 5757, 39.9);
		Produto p4 = new Produto ("4 Blusa amarela", 5959, 49.3);
		
		
		ArrayList <Produto>produto1 = new ArrayList<>();
		produto1.add(p1);
		produto1.add(p2);
		produto1.add(p3);
		produto1.add(p4);
		
		
		System.out.println("ÍTENS CADASTRADOS RECENTEMENTE:" );
		System.out.println(produto1);
		System.out.println();
		
		System.out.println("Íten " + "3 Blusa Azul" + " removido: ");
		produto1.remove(2);
		System.out.println(produto1);
		
		System.out.println("Atualizando o produto 1 : ");
		p1.setProduto("1 Blusa preta com manga. ");
		System.out.println(p1);
		
		
		System.out.println();
		System.out.println("Atualizado:");
		System.out.println(produto1);
		
		
		//Preciso estudar melhor os conceitos e organizar o código, este foi enviado apenas para a apresentação da atividade
		//Montar um sistema mais organizado que atenda as necessidades do enunciado.
		
		
		
		
		
		
		
		
		

	}

}
