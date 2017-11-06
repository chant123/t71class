package Thread;

public class InterfaceThread implements Runnable{
     Thread th;
     public InterfaceThread(){
    	 th =  new Thread(this,"007");
    	 th.start();
     }
	@Override
	public void run() {
		System.out.println(th.getName()+"TestThread 线程正在运行......");
		
	}
      
      
}
