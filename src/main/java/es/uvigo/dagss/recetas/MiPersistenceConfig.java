package es.uvigo.dagss.recetas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MiPersistenceConfig {

    /*@Bean
    @Scope("prototype")
    public ArticuloService articuloService(ArticuloDAO articuloDAO) {
        return new ArticuloServiceImpl(articuloDAO);
    }

    @Bean
    public ArticuloDAO articuloDAO() {
        return new ArticuloDAOJPA();
    }*/
}
