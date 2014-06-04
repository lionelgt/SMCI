package com.bbvabancocontinental.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.bbvabancocontinental.model.modeloejemplo;



@Controller
@Scope("session")

public class controllerEjemplo {	
	public List<modeloejemplo> modeloejemplos;
	
	@PostConstruct
	public void init(){
		System.out.println("controllerEjemplo.init()");		
		modeloejemplos= new ArrayList<modeloejemplo>();
		
	}
	
	public void metodoEjejmplo(){
		
	}

	public List<modeloejemplo> getModeloejemplos() {
		return modeloejemplos;
	}

	public void setModeloejemplos(List<modeloejemplo> modeloejemplos) {
		this.modeloejemplos = modeloejemplos;
	}

	
	
	

}

