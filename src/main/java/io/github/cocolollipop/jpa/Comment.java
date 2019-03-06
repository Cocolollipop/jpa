package io.github.cocolollipop.jpa;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Comment {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String comment;
	private Instant instant;

	private String name;

	public Comment() {
		name = "";
	}
	
	public Comment(String comment, Instant instant) {
	
		this.instant = instant;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	/**
	 * Returns the item name.
	 *
	 * @return not <code>null</code>.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the item name.
	 *
	 * @param name
	 *            <code>null</code> strings are converted to empty strings.
	 */
	public void setName(String name) {
		this.name = name == null ? "" : name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Instant getInstant() {
		return instant;
	}

	public void setInstant(Instant instant) {
		this.instant = instant;
	}

	public void setId(int id) {
		this.id = id;
	}

}