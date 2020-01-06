package exception;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) throws IDFormatException {  //throws�� ����ó�� �̷��
		
		if(userID == null) {
			throw new IDFormatException("���̵��  null�� �� �����ϴ�.");    //throw�� ����ó�� �߻���Ű��
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������");
		}
		
		this.userID = userID;
	}

	
	
	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);      //���̵�� null�� �� �����ϴ�.
		}
	
		
		myId = "123456";
		try {
			idTest.setUserID(myId);
		} catch (IDFormatException e) {
			System.out.println(e);     //���̵�� 8�� �̻� 20�� ���Ϸ� ������.
		}
		
	}

}