package br.com.capgemini.alura;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		
		Map <Integer,String> mapaTeste = new HashMap();
		
		mapaTeste.put(25, "Frank");
		mapaTeste.put(19, "Teste");
		mapaTeste.put(20,"Joice");

		
		mapaTeste.keySet().forEach(idade -> {
					System.out.println(idade);
					});
		
		
		mapaTeste.values().forEach(nome -> {
		
			System.out.println(nome);		
		});
	}
}

