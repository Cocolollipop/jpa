package io.github.cocolollipop.jpa;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("comments")
public class GetCommentsServlet {
	
	@Inject
	private CommentService commentService;
	private String commentInstant = "";

	@GET
	@Transactional
	@Produces(MediaType.TEXT_PLAIN)
	public String displayList() {
		
		final List<Comment> listcommentaires = commentService.getComments();
		
		if(listcommentaires.size() == 0) return "";
		
		else {
		for(final Comment comment : listcommentaires) {
			System.out.println("\n" + comment.getComment() + "; " + comment.getInstant().toString());
			commentInstant+= "\n" + comment.getComment() + "; " + comment.getInstant().toString();
		}

		return commentInstant;
		}
	
	}
}
