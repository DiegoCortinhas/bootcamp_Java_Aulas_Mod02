package br.com.alura.carteira.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.carteira.dto.TransacaoDto;
import br.com.alura.carteira.dto.TransacaoFormDto;
import br.com.alura.carteira.dto.UsuarioDto;
import br.com.alura.carteira.dto.UsuarioFormDto;
import br.com.alura.carteira.modelo.Transacao;
import br.com.alura.carteira.modelo.Usuario;
import br.com.alura.carteira.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	

	@Autowired  //Spring da new na classe sozinho
	private UsuarioService service;
	

	@GetMapping	
	public List<UsuarioDto> listar() {
		return service.listar();
	}

	@PostMapping
	public void cadastrar(@RequestBody @Valid UsuarioFormDto dto) {
		service.cadastrar(dto);
	}
	
}

//Controller é apenas para controlar fluxos de execução