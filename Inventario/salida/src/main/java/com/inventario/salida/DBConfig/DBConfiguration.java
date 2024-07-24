package com.inventario.salida.DBConfig;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DBConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSource dataSource = DataSourceBuilder.create()
                .url("jdbc:mariadb://localhost:3306/inventario")
                .username("root")
                .password("0000")
                .build();
        return dataSource;
    }

}



