package com.gustavotorregrosa.stockmanager.categoria;

import java.util.UUID;

import javax.persistence.Column;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.UUIDGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@javax.persistence.Entity(name = "categoria")
public class Entity {
	
	@Id
	private String id;
	
	@Column(name = "nome", unique = true)
	private String nome;

	
	public Entity() {
		this.id = UUID.randomUUID().toString();
	}
}
