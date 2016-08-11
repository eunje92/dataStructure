package ex01_atm;

class ATM2 {
	private int total;
	
	public ATM2(int total){
		this.total=total;
	}
	
	void deposit(int amount, String name){
		total+=amount;
		System.out.println(name+" : �Ա� �ݾ� : "+amount);
	}
	
	void withdraw(int amount, String name){
		if((total-amount)>0){
			total-=amount;
			System.out.println(name+" : ��� �ݾ� : "+amount);
		}else{
			System.out.println(amount+"�� ����Ϸ��� �Ͽ�����");
			System.out.println(name+"���� �ܾ��� ������ ����� �� �����ϴ�.");
		}
	}
	
	public void getTotal(){
		System.out.println("���� ���� �ܾ��� : "+total+"�� �Դϴ�.");
	}
}
