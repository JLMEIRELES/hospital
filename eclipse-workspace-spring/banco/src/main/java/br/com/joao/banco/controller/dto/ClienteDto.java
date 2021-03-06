package br.com.joao.banco.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.joao.banco.modelo.Cliente;


public class ClienteDto {
	
	private Long id;
	private String nome;
	
	public ClienteDto(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
	}
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	
	public static List<ClienteDto> converter(List<Cliente> clientes) {
		
		return clientes.stream().map(ClienteDto::new).collect(Collectors.toList());
	}
	
}
