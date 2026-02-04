package np.iims.beans;

import java.util.List;

public class Subjects {
	
	private List<String>subjects;

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	public String toString() {
		return subjects.toString();
	}

}
