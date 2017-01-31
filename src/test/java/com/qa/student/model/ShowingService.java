package com.qa.student.model;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/*
 * @Author Colin Heyl
 */
@RequestScoped
public class ShowingService
{
	@Inject
	EntityManager em;
}
