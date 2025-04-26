package collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;

@Entity
public class Candidate {

	@Id
	private int id;
	private String name;
	
	//		1__________________________________________LIST
	//
//	@ElementCollection
//	@CollectionTable(
//			name = "Friends_123" ,
//			joinColumns = @JoinColumn(name ="e_id")
//			)
//	@OrderColumn(name="pos")
//	private List<String> friends;
	
	
	
//			2___________________________________________SET
//
//	@ElementCollection
//	@CollectionTable(
//			name="pro_16",
//			joinColumns = @JoinColumn(name="cp_id")
//			)
//	private Set<String> project;

	
//			3___________________________________________MAP
	
	@ElementCollection
	@CollectionTable(
			name = "card_16",
			joinColumns = @JoinColumn(name="cc_16")
			)
	@MapKeyColumn(name="C_name", nullable = false)
	private Map<String, String> cards;
	
	
	
	public Map<String, String> getCards() {
		return cards;
	}

	public void setCards(Map<String, String> cards) {
		this.cards = cards;
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

//	public Set<String> getProject() {
//		return project;
//	}
//
//	public void setProject(Set<String> project) {
//		this.project = project;
//	}

//	public List<String> getFriends() {
//		return friends;
//	}
//
//	public void setFriends(List<String> friends) {
//		this.friends = friends;
//	}
	
}
