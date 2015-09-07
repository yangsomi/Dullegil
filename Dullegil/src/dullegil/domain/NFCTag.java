package dullegil.domain;

public class NFCTag {
	private int tag_id;
	private double tag_latitude;
	private double tag_longitude;
	public NFCTag(int tag_id, double tag_latitude, double tag_longitude) {
		super();
		this.tag_id = tag_id;
		this.tag_latitude = tag_latitude;
		this.tag_longitude = tag_longitude;
	}
	public int getTag_id() {
		return tag_id;
	}
	public void setTag_id(int tag_id) {
		this.tag_id = tag_id;
	}
	public double getTag_latitude() {
		return tag_latitude;
	}
	public void setTag_latitude(double tag_latitude) {
		this.tag_latitude = tag_latitude;
	}
	public double getTag_longitude() {
		return tag_longitude;
	}
	public void setTag_longitude(double tag_longitude) {
		this.tag_longitude = tag_longitude;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NFCTag [tag_id=");
		builder.append(tag_id);
		builder.append(", tag_latitude=");
		builder.append(tag_latitude);
		builder.append(", tag_longitude=");
		builder.append(tag_longitude);
		builder.append("]");
		return builder.toString();
	}
	
	

}
