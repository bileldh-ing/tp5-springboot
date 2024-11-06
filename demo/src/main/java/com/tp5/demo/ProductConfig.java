package com.tp5.demo;

import com.tp5.demo.model.Product;
import com.tp5.demo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class ProductConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository repository) {
        return args -> {
            Product product1 = new Product("1", "eye_creme", "efficient for dark circles", BigDecimal.valueOf(50));
            Product product2 = new Product("2", "night_creme", "efficient for hydrated face", BigDecimal.valueOf(60));

            repository.save(product1);
            repository.save(product2);
        };
    }
}
