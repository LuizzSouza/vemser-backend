package com.dbc.veiculoprodutorconsumidor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dbc.veiculoprodutorconsumidor"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false)
                .apiInfo(new ApiInfoBuilder()
                        .title("Veiculo REST API")
                        .description("Um exemplo de app com SpringBoot")
                        .version("1.0.0")
                        .license("Apache Licence Version 2.0")
                        .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
                        .contact(new Contact("Luiz", "https://www.dbccompany.com.br/", "luiz.moraes@dbccompany.com.br"))
                        .build()
                );
    }

}