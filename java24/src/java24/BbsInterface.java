package java24;

public interface BbsInterface {
	
	public abstract void insert(BbsDto dto);
	public abstract void delete(String id);
	void update(BbsDto dto);
	BbsDto select(String id);
}
