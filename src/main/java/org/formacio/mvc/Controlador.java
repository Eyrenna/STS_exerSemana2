package org.formacio.mvc;

import org.formacio.repositori.AgendaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {
		
		@RequestMapping(path="/nombre")
		@ResponseBody
		public Integer obteNombreContactes() {
			return AgendaService.nombreContactes();
		}

}
