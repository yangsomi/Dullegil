package dullegil.domain;

public class Coordinate {
	
	private int coordinate_id;
	private double latitude, longitude;
	public Coordinate(int coordinate_id, double latitude, double longitude) {
		super();
		this.coordinate_id = coordinate_id;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	public int getCoordinate_id() {
		return coordinate_id;
	}
	public void setCoordinate_id(int coordinate_id) {
		this.coordinate_id = coordinate_id;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Coordinate [coordinate_id=");
		builder.append(coordinate_id);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append("]");
		return builder.toString();
	}
	
	

}
