package thread;

public class TestThread {

	public static void main(String[] args) {
		
		//MyThread t1 = new MyThread();
		//Anonymous class
		Runnable r = () -> {
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
			};
		//};
		//main Thread(done),倒數執行緒(java等他執行結束才會停止), listen port
		Thread t1 = new Thread(new Runnable() {			
			@Override
			public void run() {
				for(int i = 5 ; i > 0 ; i--) {
					//Thread.currentThread()取得目前執行此行程式的執行緒(Thread)
					System.out.println("倒數:"+i+"秒,"+Thread.currentThread());
					try {
						Thread.sleep(1000);//停一秒
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread()+"執行完畢");
			}
		});
		t1.setName("倒數執行緒");
		t1.setPriority(10);
		//t1.setDaemon(true);//設成daemon,java就不會等他結束
		System.out.printf("t1是否還在執行:%s%n",t1.isAlive());
		t1.start();//呼叫start會執行run(),什麼時候真的執行不一定,視作業系統決定,非同步
		System.out.printf("t1是否還在執行:%s%n",t1.isAlive());
		//join()
		try {
			t1.join(1000);//等t1執行結束
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("done");
		

	}

}







