package dullegil.biz;

import java.util.List;

import dullegil.domain.Stamp;

public interface IStampService {
	boolean newStamp(int stamp_id);
	List<Stamp> getAllStamp(String stamp_id);
	int readNfc();
	int removeNfc(int tag_id, String phone_id);
}
