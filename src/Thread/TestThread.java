package Thread;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		//通过接口实现的线程
		InterfaceThread ifd = new InterfaceThread();
		Thread.sleep(3000);
        //通过继承实现的线程
		ChileThread ctd = new ChileThread();
		Thread.sleep(3000);
		ctd.run();
	}

}
