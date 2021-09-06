import java.util.HashMap;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentList {
	
	@Id
	private int id;
	private String name;

	@ElementCollection
	private Map<Integer, Address> map = new HashMap<Integer, Address>();

	@Override
	public String toString() {
		return "StudentList [id=" + id + ", name=" + name + "]";
	}
	
	
	
	public Map<Integer, Address> getMap() {
		return map;
	}



	public void setMap(Map<Integer, Address> map) {
		this.map = map;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
