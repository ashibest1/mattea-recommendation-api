package io.mattea.recommendation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.core.CassandraTemplate;

import com.datastax.oss.driver.api.core.CqlSession;

@Configuration
public class CassandraConfiguration {

	@Bean
	public CqlSession session() {
		return CqlSession.builder().withKeyspace("cassandra_ofbiz").withAuthCredentials("cassandra", "cassandra").build();
	}

	@Bean
	public CassandraTemplate cassandraTemplate() {
		return new CassandraTemplate(session());
	}
}
