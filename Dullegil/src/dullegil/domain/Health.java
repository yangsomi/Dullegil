package dullegil.domain;

import java.sql.Date;

public class Health {
	private int health_id;
	private int health_calorie;
	private int health_walk;
	private Date health_date;
	public Health(int health_id, int health_calorie, int health_walk, Date health_date) {
		super();
		this.health_id = health_id;
		this.health_calorie = health_calorie;
		this.health_walk = health_walk;
		this.health_date = health_date;
	}
	public int getHealth_id() {
		return health_id;
	}
	public void setHealth_id(int health_id) {
		this.health_id = health_id;
	}
	public int getHealth_calorie() {
		return health_calorie;
	}
	public void setHealth_calorie(int health_calorie) {
		this.health_calorie = health_calorie;
	}
	public int getHealth_walk() {
		return health_walk;
	}
	public void setHealth_walk(int health_walk) {
		this.health_walk = health_walk;
	}
	public Date getHealth_date() {
		return health_date;
	}
	public void setHealth_date(Date health_date) {
		this.health_date = health_date;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Health [health_id=");
		builder.append(health_id);
		builder.append(", health_calorie=");
		builder.append(health_calorie);
		builder.append(", health_walk=");
		builder.append(health_walk);
		builder.append(", health_date=");
		builder.append(health_date);
		builder.append("]");
		return builder.toString();
	}
	
	

}
