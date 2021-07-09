package com.training.entity;



/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
public class AuthRequest {

  
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String username;
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	private String password;
}
