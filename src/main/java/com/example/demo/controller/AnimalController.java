package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Animal;
import com.example.demo.repository.Animais;

@Controller 
@RequestMapping("/animais") 
public class AnimalController {

	@Autowired 
	private Animais animais;

	@RequestMapping("/novo") 
	public String novo() {
		return "CadastroAnimal"; 
	}

	@RequestMapping(method = RequestMethod.POST) 
	public String salvar(Animal animal) {
		animais.save(animal); 
		return "CadastroAnimal";
	}
}