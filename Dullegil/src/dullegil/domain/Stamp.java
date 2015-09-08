package dullegil.domain;

import java.sql.Date;

public class Stamp {
	private int stamp_id;
	private String stamp_checking;
	private Date stamp_date;
	private User user;
	private NFCTag tag;
	
	
	public Stamp(int stamp_id, String stamp_checking, Date stamp_date, User user, NFCTag tag) {
		super();
		this.stamp_id = stamp_id;
		this.stamp_checking = stamp_checking;
		this.stamp_date = stamp_date;
		this.user = user;
		this.tag = tag;
	}
	
	public int getStamp_id() {
		return stamp_id;
	}
	public void setStamp_id(int stamp_id) {
		this.stamp_id = stamp_id;
	}
	public String getStamp_checking() {
		return stamp_checking;
	}
	public void setStamp_checking(String stamp_checking) {
		this.stamp_checking = stamp_checking;
	}
	public Date getStamp_date() {
		return stamp_date;
	}
	public void setStamp_date(Date stamp_date) {
		this.stamp_date = stamp_date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public NFCTag getTag() {
		return tag;
	}
	public void setTag(NFCTag tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stamp [stamp_id=");
		builder.append(stamp_id);
		builder.append(", stamp_checking=");
		builder.append(stamp_checking);
		builder.append(", stamp_date=");
		builder.append(stamp_date);
		builder.append(", user=");
		builder.append(user);
		builder.append(", tag=");
		builder.append(tag);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}

