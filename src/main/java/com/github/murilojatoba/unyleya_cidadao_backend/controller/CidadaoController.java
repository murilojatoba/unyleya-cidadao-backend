package com.github.murilojatoba.unyleya_cidadao_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.murilojatoba.unyleya_cidadao_backend.model.Cidadao;
import com.github.murilojatoba.unyleya_cidadao_backend.service.CidadaoService;

@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {

	@Autowired
	private CidadaoService cidadaoService;
	
	@GetMapping
	public List<Cidadao> getCidadaos() {
		return cidadaoService.obterCidadaos();
	}
	
	@PostMapping
	public ResponseEntity<Cidadao> criarCidadao(@RequestBody Cidadao cidadao) throws Exception {
		Cidadao cidadaoIncluido = cidadaoService.criarCidadao(cidadao);
		
		return ResponseEntity.ok()
				.body(cidadaoIncluido);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Cidadao> alterarCidadao(@PathVariable("id") Long id, @RequestBody Cidadao cidadao) throws Exception {
		Cidadao cidadaoAlterado = cidadaoService.alterarCidadao(id, cidadao);
		
		return ResponseEntity.ok()
				.body(cidadaoAlterado);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> removerCidadao(@PathVariable("id") Long id) throws Exception {
		cidadaoService.removerCidadao(id);
		
		return ResponseEntity.ok()
				.body(true);
	}
}
