package com.example.bank.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DriverManagerDataSource getDataSource() {
        final var dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://@localhost:3307/bank");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }
}
