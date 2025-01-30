package com.github.murilojatoba.unyleya_cidadao_backend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Cidadao criarCidadao(@RequestBody Cidadao cidadao) throws Exception {
		return cidadaoService.criarCidadao(cidadao);
	}
	
	@PutMapping("/{id}")
	public Cidadao alterarCidadao(@PathVariable("id") Long id, @RequestBody Cidadao cidadao) throws Exception {
		return cidadaoService.alterarCidadao(id, cidadao);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> removerCidadao(@PathVariable("id") Long id) throws Exception {
		cidadaoService.removerCidadao(id);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", true);
		return response;
	}
}
