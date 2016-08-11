package stack;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		String receiveStr=list.removeLast();
		System.out.println("꺼낸 데이터 : "+receiveStr);
		
		for(int i=0; i<list.size(); i++){
			System.out.println("남은 데이터"+i+" : "+list.get(i));
		}
	}
}
