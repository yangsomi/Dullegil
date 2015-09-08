package dullegil.domain;

import java.util.List;

public class User {
	private int user_seq_id;
	private String phone_id;
	private String user_id;
	private String user_pw;
	private String user_gender;
	private int tall,weight;
	private List<Health> health_list;
	private List<Stamp> stamp_list;
	public User(int user_seq_id, String phone_id, String user_id, String user_pw, String user_gender, int tall,
			int weight, List<Health> health_list, List<Stamp> stamp_list) {
		super();
		this.user_seq_id = user_seq_id;
		this.phone_id = phone_id;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_gender = user_gender;
		this.tall = tall;
		this.weight = weight;
		this.health_list = health_list;
		this.stamp_list = stamp_list;
	}
	public int getUser_seq_id() {
		return user_seq_id;
	}
	public void setUser_seq_id(int user_seq_id) {
		this.user_seq_id = user_seq_id;
	}
	public String getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(String phone_id) {
		this.phone_id = phone_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public List<Health> getHealth_list() {
		return health_list;
	}
	public void setHealth_list(List<Health> health_list) {
		this.health_list = health_list;
	}
	public List<Stamp> getStamp_list() {
		return stamp_list;
	}
	public void setStamp_list(List<Stamp> stamp_list) {
		this.stamp_list = stamp_list;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [user_seq_id=");
		builder.append(user_seq_id);
		builder.append(", phone_id=");
		builder.append(phone_id);
		builder.append(", user_id=");
		builder.append(user_id);
		builder.append(", user_pw=");
		builder.append(user_pw);
		builder.append(", user_gender=");
		builder.append(user_gender);
		builder.append(", tall=");
		builder.append(tall);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", health_list=");
		builder.append(health_list);
		builder.append(", stamp_list=");
		builder.append(stamp_list);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
