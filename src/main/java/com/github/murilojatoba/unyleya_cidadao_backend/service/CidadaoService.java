package com.github.murilojatoba.unyleya_cidadao_backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.murilojatoba.unyleya_cidadao_backend.model.Cidadao;
import com.github.murilojatoba.unyleya_cidadao_backend.repository.CidadaoRepository;

@Service
public class CidadaoService {

	@Autowired
	private CidadaoRepository cidadaoRepository;
	
	public List<Cidadao> obterCidadaos() {
		return cidadaoRepository.findAll();
	}
	
	public Cidadao criarCidadao(Cidadao cidadao) throws Exception {
		if (!cidadao.getId().equals(null)) {
			throw new Exception("Usuário informado já possui um id.");
		}
		
		return cidadaoRepository.save(cidadao);
	}
	
	public Cidadao alterarCidadao(Long id, Cidadao cidadao) throws Exception {
		if (!id.equals(cidadao.getId())) {
			throw new Exception("O id informado não corresponde ao id do cidadao fornecido.");
		}
		
		cidadaoRepository.findById(id)
				.orElseThrow(() -> new Exception("O id informado é inválido."));
		
		return cidadaoRepository.save(cidadao);
	}
	
	public void removerCidadao(Long id) throws Exception {
		cidadaoRepository.findById(id)
				.orElseThrow(() -> new Exception("O id informado é inválido."));
		
		cidadaoRepository.deleteById(id);
	}
}
