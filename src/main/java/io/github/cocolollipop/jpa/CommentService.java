package io.github.cocolollipop.jpa;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@RequestScoped
public class CommentService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<Comment> getComments(){
		final TypedQuery<Comment> query = entityManager.createQuery("select t from Comment t", Comment.class);
		return query.getResultList();
	}
	
	@Transactional
	public void persist(Comment comment) {
		entityManager.persist(comment);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	

}
