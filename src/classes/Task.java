package classes;

import java.util.Date;

public class Task {
	/**
	 * attributes
	 */
	private String name;
	private String description;
	private Date expirationDate;

	/**
	 * @param name
	 * @param description
	 * @param expirationDate
	 */
	public Task(String name, String description, Date expirationDate) {
		this.name = name;
		this.description = description;
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the expirationDate
	 */
	public Date getExpirationDate() {
		return expirationDate;
	}

	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}
