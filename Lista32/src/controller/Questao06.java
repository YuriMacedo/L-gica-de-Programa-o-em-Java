package controller;

import util.Teclado;

public class Questao06 {

	public static void main(String[] args) {
		
		String nome;
		double vendas;
		double salario;
		double comissao;
		double total;
		
		nome = Teclado.lerTexto("Digite o seu nome:");
		vendas = Teclado.lerDouble("Digite o valor total de suas vendas neste mês:");
		salario = Teclado.lerDouble("Digite seu salário:");
		
		comissao = vendas*0.15;
		total = salario + comissao;
		
		
		System.out.println("Nome:"+nome+ "-Salário:"+salario+ "-Comissão atual:"+comissao+ "-Total:"+total);
		
		
		
		
		
		
		
		
	}

}
