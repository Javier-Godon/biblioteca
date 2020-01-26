package com.montarelo.biblioteca.config.datasource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ApplicationDatasourceConfig {
	public static final String APPLICATION_DATASOURCE = "applicationDS";

	@Value("${datasources.application.driver-class-name}")
	private String driverClassNameApplication;

	@Value("${datasources.application.url}")
	private String postgresUrlApplication;

	@Value("${datasources.application.username}")
	private String postgresUsernameApplication;

	@Value("${datasources.application.password}")
	private String postgresPasswordApplication;

	@Bean(name = APPLICATION_DATASOURCE)
	public DataSource getApplicationDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(driverClassNameApplication);
		dataSource.setUrl(postgresUrlApplication);
		dataSource.setUsername(postgresUsernameApplication);
		dataSource.setPassword(postgresPasswordApplication);
		return dataSource;
	}

}
