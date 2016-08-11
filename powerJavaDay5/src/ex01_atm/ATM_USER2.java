package ex01_atm;

class ATM_USER2 extends Thread{
	boolean flag=false;
	ATM2 obj;
	public ATM_USER2(ATM2 obj, String name){
		super(name);
		this.obj=obj;
	}
	public void run(){
		for(int i=0; i<5; i++){
			try {
				sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			synchronized (obj) {
				if(flag){
					obj.deposit((int)(Math.random()*10000), getName());
					obj.getTotal();
				}else{
					obj.withdraw((int)(Math.random()*10000), getName());
					obj.getTotal();
				}
			}
			flag=!flag;
		}
	}
}
