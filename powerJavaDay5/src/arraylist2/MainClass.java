package arraylist2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		
		System.out.print("���� �̸��� 10�� �Է��ϼ��� :");
		//�Է�
		for(int i=0; i<10; i++){
			list.add(sc.next());
		}
		
		int n=10;
		while(list.size()!=1){
			Random rd=new Random();
			int remove=rd.nextInt(n);
			System.out.println("���ŵ� ������ : "+list.get(remove));
			list.remove(remove);
			n--;
			System.out.println("���� ������ ������ : "+list.size());
		}
		
		System.out.println("������ ������ : "+list.get(0));
	}
}
