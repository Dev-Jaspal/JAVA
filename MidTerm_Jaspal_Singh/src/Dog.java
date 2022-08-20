
public class Dog {
	private String nickName;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Dog() {
		super();
		this.nickName = "";
	}

	public Dog(String nickName) {
		super();
		this.nickName = nickName;
	}

	@Override
	public String toString() {
		return "Dog [nickName=" + nickName + "]";
	}
	
	
}
