package com.gustavotorregrosa.stockmanager.categoria;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/categorias")
public class Controller {
	
	@Autowired
	private Repository repository;
	
	@GetMapping
	public ResponseEntity<List<Entity>> getAll(){
		try {
			List<Entity> listagem = this.repository.findAll();
			return ResponseEntity.ok().body(listagem);
		}catch(Exception e) {
			return ResponseEntity.status(500).build();			
		}
		
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Entity> findById(@PathVariable String id){
		System.out.println(id);
		try {
			Entity categoria = this.repository.getById(id);
			System.out.println(categoria);
			return ResponseEntity.ok().body(categoria);
		}catch(Exception e) {
			return ResponseEntity.status(500).build();			
		}
	}
	
	
	@PostMapping
	public ResponseEntity<Entity> save(@RequestBody Entity categoria){
		try {
			Entity categoriaObj = this.repository.save(categoria);
			return ResponseEntity.ok().body(categoriaObj);
		}catch (Exception e) {
			return ResponseEntity.status(500).build();		
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
