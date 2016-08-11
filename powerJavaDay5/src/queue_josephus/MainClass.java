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
				System.out.println(list.get(0)+"는 살았습니다.");
				list.poll();
				save++;
			}else if(save%3==0){
				System.out.println(list.get(0)+"는 죽었습니다.");
				list.poll();
				save++;
			}
			System.out.println("<남은 인원> : "+list.size());
		}
		
		System.out.print("살아남은 사람은 ");
		for(int i=0; i<list.size(); i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.print("입니다.");
	}
}
