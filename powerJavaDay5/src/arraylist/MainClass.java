package arraylist;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList list1=new ArrayList();
		ArrayList<String> list2=new ArrayList<>();
		
		list1.add("ȫ�浿");
		list1.add("�����");
		list1.add(10);
		
		list2.add("����");
		
		list1.addAll(list2);
		
		for(int i=0; i<list1.size(); i++){
			System.out.println(list1.get(i));
		}
		System.out.println("------------");
		
		for(String s : list2){
			System.out.println(s);
		}
	}
}
