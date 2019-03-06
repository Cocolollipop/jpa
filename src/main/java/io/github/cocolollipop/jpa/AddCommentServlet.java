package io.github.cocolollipop.jpa;


import java.time.Instant;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("comments")
public class AddCommentServlet {

	@Inject
	private CommentService commentService;
	private String commentInstant = "";

	@GET
	@Transactional
	@Produces(MediaType.TEXT_PLAIN)
	public String addComment(@QueryParam("param1") String param1) {
		
		Comment c = new Comment(param1, Instant.now());
		commentService.persist(c);
		commentService.getEntityManager().flush();
		
		return ";"+c.getComment();
	}

	public String getCommentInstant() {
		return commentInstant;
	}

	public void setCommentInstant(String commentInstant) {
		this.commentInstant = commentInstant;
	}
}
