package com.proyectoocio.demo.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class demoRest {

	@GetMapping("/saludo2")
	public String holas() {
		System.out.println("Entro al metodo saludo");
		String formulario = "<h1>HOLA MUNDO</h1>";
		return formulario;
	}
}
