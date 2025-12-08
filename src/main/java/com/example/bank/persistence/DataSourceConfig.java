package com.example.bank.persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
    @Bean
    public DriverManagerDataSource getDataSource() {
        final var dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("org.sqlite.JDBC");
        dataSource.setUrl("jdbc:sqlite:bank:bank?cache=shared");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }
}
