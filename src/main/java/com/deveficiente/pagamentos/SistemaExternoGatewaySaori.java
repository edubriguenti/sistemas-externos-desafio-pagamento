package com.deveficiente.pagamentos;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SistemaExternoGatewaySaori implements PodeMeDeixarCaotico{
	
	private static final Logger log = LoggerFactory
			.getLogger(SistemaExternoGatewaySaori.class);


	@PostMapping(value = "/saori/processa")
	public void processa(@RequestBody @Valid DadosCompraGenerico request) {
		log.info("Processando pagamento gateway saori {}",request);
	}
}
