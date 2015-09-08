package dullegil.biz;

import java.util.List;

import dullegil.domain.NFCTag;

public interface INfcService {
	int count();
	List<NFCTag> getAllNfc();
	NFCTag getNfc(int tag_id);
	boolean modifyNfc(NFCTag tag);
	boolean newNfc(NFCTag tag);
	boolean removeNfc(int tag_id);
	
}
