package one.to.many;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Ques_13")
public class Question {
	@Id
	private int id;
	private String Question;
	@OneToMany
	private List<Answer> Ans;     //Since there can be many answers for one question.. 
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public List<Answer> getAns() {
		return Ans;
	}
	public void setAns(List<Answer> ans) {
		Ans = ans;
	}
	
}
