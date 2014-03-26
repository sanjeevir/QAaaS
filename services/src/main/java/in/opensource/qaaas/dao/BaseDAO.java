package in.opensource.qaaas.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface BaseDAO {
	public void insert(Object object);
	public void update(Object object);
	public void delete(int id);
	public Object findByID(int id);
}
