package Models;

public class Category {

	// todo: change this to data structure
	public static String parse(String category) {
		String res = "";
		
		if(category.equals("PTY")) {
			res = "��������";
		}
		else if (category.equals("REH")) {
			res = "����";
		}
		else if (category.equals("SKY")) {
			res = "�ϴû���";
		}
		else if (category.equals("T1H")) {
			res = "����";
		}
		else if (category.equals("RN1")) {
			res = "1�ð� ������";
		}
		else if (category.equals("REH")) {
			res = "���";
		}
		else if (category.equals("UUU")) {
			res = "�����ٶ�����";
		}
		else if (category.equals("VVV")) {
			res = "���Ϲٶ�����";
		}
		else if (category.equals("VEC")) {
			res = "ǳ��";
		}
		else if (category.equals("WSD")) {
			res = "ǳ��";
		}
		else {
			res = category;
		}
		
		return res;
	} 
}
