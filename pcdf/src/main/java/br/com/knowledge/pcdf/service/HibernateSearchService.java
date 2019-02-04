package br.com.knowledge.pcdf.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.knowledge.pcdf.model.Veiculo;

@Service
public class HibernateSearchService {
	@Autowired
	private final EntityManager centityManager;
	
	@Autowired
	public HibernateSearchService(EntityManager entityManager) {
		super();
		this.centityManager = entityManager;
	}
	
	public void initializeHibernateSearch() {
		FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(centityManager);
		try {
			fullTextEntityManager.createIndexer().purgeAllOnStart(true).startAndWait();
			fullTextEntityManager.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Transactional
	public List<Veiculo> fuzzySearch(String searchTerm) {
		FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(centityManager);
		 QueryBuilder qb = fullTextEntityManager.getSearchFactory().buildQueryBuilder().forEntity(Veiculo.class).get();
		 Query luceneQuery = qb.keyword().fuzzy().withEditDistanceUpTo(1).withPrefixLength(1).onFields("marca_modelo")
				 .matching(searchTerm).createQuery();
		 javax.persistence.Query jpaQuery = fullTextEntityManager.createFullTextQuery(luceneQuery, Veiculo.class);
		 List<Veiculo> veiculoList = null;
		 try {
	    	 veiculoList = (List<Veiculo>)jpaQuery.getResultList();
	     } catch(NoResultException nre) {
	    	 
	     }
	     return veiculoList;
	}
}
