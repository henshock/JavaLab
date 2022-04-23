package thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 5 ; i > 0 ; i--) {
			//Thread.currentThread()取得目前執行此行程式的執行緒(Thread)
			System.out.println("倒數:"+i+"秒,"+Thread.currentThread());
			try {
				Thread.sleep(1000);//停一秒
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread()+"執行完畢");
	}
	
	

}
