package com.shanks.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import org.hibernate.Session;

@Path("/hello")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {

		String output = "Jersey say : " + msg;
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		User user = new User();

		// user.setUserId(11);
		user.setUsername("Mukesh");
		user.setCreatedBy("Google");
		user.setCreatedDate(new Date());

		session.save(user);
		session.getTransaction().commit();
		return Response.status(200).entity(output).build();

	}

}