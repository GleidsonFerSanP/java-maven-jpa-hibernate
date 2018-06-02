package br.com.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.teste.model.Cliente;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("teste");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = new Cliente();
		em.getTransaction().begin();
		cliente.setNome("Muller Antunes");
		
		em.persist(cliente);
		
		em.getTransaction().commit();
		
		System.out.println("Cliente alterado com sucesso!");
	}

}
