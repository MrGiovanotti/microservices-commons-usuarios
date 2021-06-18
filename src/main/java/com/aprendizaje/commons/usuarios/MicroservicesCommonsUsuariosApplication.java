package com.aprendizaje.commons.usuarios;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication

//Excluimos la configuración de datasource, puesto que JPA por defecto lo pide y nosotros
//no lo necesitamos
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class MicroservicesCommonsUsuariosApplication {
	// Quitamos el método main, ya que este proyecto no se va a ejecutar sino que
	// solo nos va a servir
	// como librería
}
