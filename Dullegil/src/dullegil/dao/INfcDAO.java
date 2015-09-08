package dullegil.dao;

import java.util.List;

import dullegil.domain.NFCTag;

public interface INfcDAO {
	int count();
	boolean createNfc(NFCTag tag);
	boolean deleteNfc(int tag_id);
	List<NFCTag> selectAllNfc();
	NFCTag selectNfc(int tag_id);
	boolean updateNfc(NFCTag tag);
	
}
