package com.tunghuy.bankapp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "BankApp-API",
                description = "Backend Rest API for bank",
                version = "v1.0",
                contact = @Contact(
                        name = "Tung Huy",
                        email = "huynguyentung22@gmail.com"
                ),
                license = @License(
                        name = "Huy's Bank"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Huy be"
        )
)
public class BankApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankApiApplication.class, args);
    }

}
