
public class member {
	private String memberName;
	private int memberId;
	public member(String name){
		memberName = name;
	}
	public member(int id){
		memberId = id;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int borrowBooks(){
		return memberId;
	}
	
}
