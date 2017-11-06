package Thread;

public class ChileThread extends Thread {
	@Override
	public void run(){
		super.run();
		System.out.println(getName()+"chileThread 正在运行......");
	}

}
