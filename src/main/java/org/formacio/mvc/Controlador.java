package org.formacio.mvc;

import org.formacio.repositori.AgendaService;
import org.formacio.repositori.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {
	
		@Autowired
		private AgendaService agenda = null;
		
		@RequestMapping(path="/nombre")
		@ResponseBody
		public Integer obteNombreContactes() {
			return agenda.nombreContactes();
		}
		
		@RequestMapping(path="/telefon")
		@ResponseBody
		public String obteTelefon(String id) {
			return agenda.recupera(id).getTelefon();
		}
		
		@RequestMapping(path="/telefon/{iden}")
		@ResponseBody
		public Persona contacto(@PathVariable String iden) {
			return agenda.recupera(iden);
		}

}
