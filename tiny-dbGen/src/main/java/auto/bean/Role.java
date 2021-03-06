package auto.bean;
//auto-gen file, do not edit anyway

public class Role implements org.tiny.base.Bean {

	private long roleId;

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	private String id = "";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String nickName = "";

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String password = "";

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private auto.bean.Friend girlFriend = new auto.bean.Friend();

	public auto.bean.Friend getGirlFriend() {
		return girlFriend;
	}

	public void setGirlFriend(auto.bean.Friend girlFriend) {
		this.girlFriend = girlFriend;
	}

	private java.util.List<auto.bean.Friend> friends = new java.util.ArrayList<>();

	public java.util.List<auto.bean.Friend> getFriends() {
		return friends;
	}

	public void setFriends(java.util.List<auto.bean.Friend> friends) {
		this.friends = friends;
	}

	private java.util.Map<Character, String> bag = new java.util.HashMap<>();

	public java.util.Map<Character, String> getBag() {
		return bag;
	}

	public void setBag(java.util.Map<Character, String> bag) {
		this.bag = bag;
	}

	@Override
	public Role clone() throws CloneNotSupportedException {
		Role clone = (Role)super.clone();

		clone.setGirlFriend(girlFriend.clone());
		java.util.List<auto.bean.Friend> friendsClone = new java.util.ArrayList<>(friends.size());
		for(auto.bean.Friend bean : friends) {
			friendsClone.add(bean.clone());
		}
		clone.setFriends(friendsClone);

		java.util.Map<Character, String> bagClone = new java.util.HashMap<>(bag.size());
		for(java.util.Map.Entry<Character, String> e : bag.entrySet()) {
			bagClone.put(e.getKey(), e.getValue());
		}
		clone.setBag(bagClone);

		return clone;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Role [");
		sb.append("roleId=" + roleId);
		sb.append(", ");
		sb.append("id=" + id);
		sb.append(", ");
		sb.append("nickName=" + nickName);
		sb.append(", ");
		sb.append("age=" + age);
		sb.append(", ");
		sb.append("password=" + password);
		sb.append(", ");
		sb.append("girlFriend=" + girlFriend);
		sb.append(", ");
		sb.append("friends=" + friends);
		sb.append(", ");
		sb.append("bag=" + bag);
		sb.append("]");

		return sb.toString();
	}
}