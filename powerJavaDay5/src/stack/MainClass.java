package stack;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		String receiveStr=list.removeLast();
		System.out.println("���� ������ : "+receiveStr);
		
		for(int i=0; i<list.size(); i++){
			System.out.println("���� ������"+i+" : "+list.get(i));
		}
	}
}
