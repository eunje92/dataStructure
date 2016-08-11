package arraylist2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		
		System.out.print("과일 이름을 10개 입력하세요 :");
		//입력
		for(int i=0; i<10; i++){
			list.add(sc.next());
		}
		
		int n=10;
		while(list.size()!=1){
			Random rd=new Random();
			int remove=rd.nextInt(n);
			System.out.println("제거된 과일은 : "+list.get(remove));
			list.remove(remove);
			n--;
			System.out.println("남은 과일의 개수는 : "+list.size());
		}
		
		System.out.println("마지막 과일은 : "+list.get(0));
	}
}
