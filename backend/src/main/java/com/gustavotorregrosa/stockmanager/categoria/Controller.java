package com.gustavotorregrosa.stockmanager.categoria;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/categorias")
public class Controller {
	
	@GetMapping
	public ResponseEntity<List<String>> getAll(){
		List<String> listagem = new ArrayList<>();
		listagem.add("ola");
		listagem.add("mundo");
		return ResponseEntity.ok().body(listagem);
	}
	

}
