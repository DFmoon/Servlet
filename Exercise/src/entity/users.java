package entity;
//用户实体类
public class users {
	private String username;
	private String password;
	private String email;
	private String gender;
	private String[] favorites;
	private String introduce;
	private boolean isAccept;
	
	public users(){}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getFavorites() {
		return favorites;
	}
	public void setFavorites(String[] favorites) {
		this.favorites = favorites;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public boolean getisAccept() {
		return isAccept;
	}
	public void setisAccept(boolean isAccept) {
		this.isAccept = isAccept;
	}
	
}
