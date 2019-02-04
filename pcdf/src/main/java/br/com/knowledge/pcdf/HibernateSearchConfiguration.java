package br.com.knowledge.pcdf;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.knowledge.pcdf.service.HibernateSearchService;

@EnableAutoConfiguration
@Configuration
public class HibernateSearchConfiguration {
	@Autowired
	private EntityManager bentityManager;
	
	@Bean
	public HibernateSearchService hibernateSearchService() {
		HibernateSearchService hibernateSearchService = new HibernateSearchService(bentityManager);
		hibernateSearchService.initializeHibernateSearch();
		return hibernateSearchService;
	}
}
