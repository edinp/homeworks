package ba.bitcamp.homework01.task02;

public class Author {
	
	private String name;
	private String email;
	private String gender;
	
	public Author(String name, String email, String gender) {
		this.name = name;
		this.gender = gender;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getGender(){
		return gender;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setGender(String gender){
		this.gender = gender;
	}


	/**
	 * Generated equals method.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/**
	 * Transforms Author to String.
	 */
	public String toString(){
		String s = name + email + gender;
		return s;
	}

}
