package mybatis;

/*
VO(Value Object) : DTO객체와 같이 순수 데이터만 가지고 있는 객체이다.
 */
public class MemberVO {
	//멤버변수
	private String id;
	private String pass;
	private String name;
	private java.sql.Date regidate;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public java.sql.Date getRegidate() {
		return regidate;
	}
	public void setRegidate(java.sql.Date regidate) {
		this.regidate = regidate;
	}
	
	
}
