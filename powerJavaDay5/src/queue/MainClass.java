package queue;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.offer("1");
		list.offer("2");
		list.offer("3");
		
		String receiveStr=list.poll();
		System.out.println("꺼낸 데이터 : "+receiveStr);
		
		for(int i=0; i<list.size(); i++){
			System.out.println("남은 데이터"+i+" : "+list.get(i));
		}
	}
}
