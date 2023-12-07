package tn.esprit.sptingproject2.Config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("APIs-Swagger")
                .description("TP étude de cas")  .contact(contactAPI());

    }


    @Bean
    public GroupedOpenApi blocPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Bloc Management API")
                .pathsToMatch("/bloc/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi chambrePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Chambre Management API")
                .pathsToMatch("/chambre/**")
                .pathsToExclude("**")
                .build();
    }

    @Bean
    public GroupedOpenApi foyerPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Foyer Management API")
                .pathsToMatch("/foyer/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi EtudiantPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Etudiant Management API")
                .pathsToMatch("/Etudiant/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi ReservationPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Reservation Management API")
                .pathsToMatch("/Reservation/**")
                .pathsToExclude("**")
                .build();
    }
    @Bean
    public GroupedOpenApi UniversitePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Universite Management API")
                .pathsToMatch("/Universite/**")
                .pathsToExclude("**")
                .build();
    }


    public Contact contactAPI() {
        Contact contact = new Contact().name("Eya Mechergui - 4TWIN1")
                .email("eya.mechergui@esprit.tn")
                .url("https://www.linkedin.com/in/**********/");
        return contact;
    }
}

