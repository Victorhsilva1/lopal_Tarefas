package br.dev.victor.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.dev.victor.tarefas.model.Funcionario;
import br.dev.victor.tarefas.model.Tarefa;

public class Main {
		//DETERMINANDO O CAMINHO DO ARQUIVO QUE SERÁ ALI
		private static String path = "C:\\Users\\25132598\\tarefa\\tarefas.txt";
		
		public static void main(String[] args) {
			
			Tarefa t = new Tarefa("pagar o fornecedor");
			
			gravarArquivo();
			lerArquivo();
			
			
	}
		private static void gravarArquivo () {
			
			FileWriter arquivo = null;
			BufferedWriter escritor = null;
			
			try {
				
				arquivo = new FileWriter(path, true);
				escritor = new BufferedWriter(arquivo);
				
				escritor.write("Essa é a ultima nova linha!, por enquanto:( \n");
				escritor.flush();
				
			} catch (Exception erro) {
				System.out.println(erro.getMessage());
			}
		}

		private static void lerArquivo() {
			// ABRIR O ARQUIVO PARA LEITUR
			FileReader file = null;
			BufferedReader buffer = null;
			try {
				file = new FileReader(path);
				buffer = new BufferedReader(file);
				
				
				String linha = buffer.readLine();
				
				while (linha != null) {
					System.out.println(linha);
					linha = buffer.readLine();
				
					
					
				}
				
			
				
			} catch (FileNotFoundException erro) {	
				System.out.println("Arquivo não encontrado");
				System.out.println(erro.getMessage());	
			} catch (IOException erro) {
				System.out.println("Você não pode ler o arquivo");
				System.out.println(erro.getMessage());
			} catch (Exception erro) {
				System.out.println("Erro genérico");
				System.out.println(erro.getMessage());
			}
		}

}