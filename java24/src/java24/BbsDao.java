package java24;

public class BbsDao implements BbsInterface {

	@Override
	public void insert(BbsDto dto) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BbsDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BbsDto select(String id) {
		BbsDto dto = new BbsDto("kim", "kim", "kim", "kim");
		return dto;
	}

}
