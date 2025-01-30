package com.github.murilojatoba.unyleya_cidadao_backend.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidadaos")
public class CidadaoController {

	@GetMapping
	public List<String> getCidadaos() {
		return Arrays.asList("1", "2", "3");
	}
}
