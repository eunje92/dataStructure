package queue_josephus;

import java.util.LinkedList;

public class MainClass {
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=1; i<42; i++){
			list.offer(i);
		}
		
		int save=1;
		while(list.size()!=2){
			if(save%3!=0){
				list.offer(list.get(0));
				System.out.println(list.get(0)+"�� ��ҽ��ϴ�.");
				list.poll();
				save++;
			}else if(save%3==0){
				System.out.println(list.get(0)+"�� �׾����ϴ�.");
				list.poll();
				save++;
			}
			System.out.println("<���� �ο�> : "+list.size());
		}
		
		System.out.print("��Ƴ��� ����� ");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.print("�Դϴ�.");
	}
}
