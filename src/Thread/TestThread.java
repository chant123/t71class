package Thread;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		//ͨ���ӿ�ʵ�ֵ��߳�
		InterfaceThread ifd = new InterfaceThread();
		Thread.sleep(3000);
        //ͨ���̳�ʵ�ֵ��߳�
		ChileThread ctd = new ChileThread();
		Thread.sleep(3000);
		ctd.run();
	}

}
