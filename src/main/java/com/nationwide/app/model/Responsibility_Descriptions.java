package com.nationwide.app.model;

import java.util.List;

/**Embedded within {@link Responsibilities} class to define the descriptions and their skills. Contains {@link Responsibility_Criteria}.
 * @author willg
 *
 */
public class Responsibility_Descriptions {
	
	private int level;
	private List<Responsibility_Criteria> responsibility_criteria;
	
	//Setter and Getter methods
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public List<Responsibility_Criteria> getResponsibility_criteria() {
		return responsibility_criteria;
	}
	public void setResponsibility_criteria(List<Responsibility_Criteria> responsibility_criteria) {
		this.responsibility_criteria = responsibility_criteria;
	}
	
}
