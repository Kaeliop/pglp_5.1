package annuaire;

import java.io.Serializable;

public abstract class DAO<T> implements Serializable{
	   

	private static final long serialVersionUID = -7717251990065292246L;
	public abstract boolean create(T p);
	  public abstract boolean read(int id);
	  public abstract boolean delete(T p);
	  public abstract boolean update(T p);
	}