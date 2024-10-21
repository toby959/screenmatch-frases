package com.toby959.screenmatch_frases.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "API SCREENMATCH-FRASES",
                description = "Muestra frases dichas por actores de Series.",
                termsOfService = "www.toby959.com/terminos_y_servicios",
                version = "1.0.0",
                contact = @Contact(
                        name = "Christian Garay",
                        url = "https://github.com/toby959/screenmatch-frases/blob/main/LICENSE",
                        email = "www.christiangarayw8@gmail.com"
                ),
                license = @License(
                        name = "Standard Software Use License for toby959",
                        url = "https://github.com/toby959/screenmatch-frases/blob/main/LICENSE"
                )
        ),
        servers = {
                @Server(
                        description = "DEV SERVER",
                        url = "http://localhost:8000"
                ),
                @Server(
                        description = "PROD SERVER",
                        url = "http://toby959:8000"
                )
        }
)
public class SwaggerConfig {}
