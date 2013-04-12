package de.beuth_hochschule.matusewicz.integration_plattform.dao;

import java.util.*;
import javax.persistence.*;

import de.beuth_hochschule.integration_plattform.model.*;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TreeDAOJpaImpl implements TreeDAO {

	private EntityManager entityManager;
	
	@PersistenceContext
	void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public List<Tree> getAll(){
		return (List<Tree>) entityManager.createQuery("SELECT t from Tree t").getResultList();
	}
	
	public Tree getById(Long id){
		return entityManager.find(Tree.class, id);
	}
	
	@Transactional
	public void save(Tree tree){
		if(tree.getId() == null){
			entityManager.persist(tree);
		}else{
			entityManager.merge(tree);
		}
	}
	@Transactional
	public void delete(Tree tree){
		entityManager.remove(tree);
	}
}
