package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5]; // justå�̻���� �ִ� ���� ����
		Book[] copyLibrary = new Book[5];
		
		//���� ��ü�� ����������Ѵ�.
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");

		for(int i=0; i<copyLibrary.length; i++) {
			copyLibrary[i] = new Book();
		}
		
		for(int i=0; i<library.length; i++) { //���� ����
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		library[0].setTitle("����");
		library[1].setAuthor("�ڿϼ�");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
	}

}