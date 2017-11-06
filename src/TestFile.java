import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class TestFile {
	public static void main(String[] args) throws FileNotFoundException {
		TestFile.CreateFile("D:/T71/testfile.txt");
		TestFile.CreateDir("D:/T71/a");
		TestFile.GetDirList("D:/T71","D:/T71/2.txt");
	}
   
	
	//����һ���ļ�
	public static void CreateFile(String filepath) {
		File file = new File(filepath);
		boolean flag = false;
		if(file.exists()){
			System.out.println("�ļ��Ѵ��ڣ�������ɾ���ٴ���");
			file.delete();
		}else{
			try {
				  flag = file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(flag){
				System.out.println("�ļ������ɹ�");
			}else{
				System.out.println("�ļ�����ʧ��");
			}
		}
		}
		
		
		
		
		//����һ��Ŀ¼
		public static void CreateDir(String DirPath){
			File file = new File(DirPath);
			if(file.exists()){
				System.out.println("Ŀ¼�Ѵ��ڣ���ɾ���ٴ���");
				file.delete();
			}
			boolean flag = false;
			flag = file.mkdir();
			if(flag){
				System.out.println("Ŀ¼�����ɹ�");
			}else{
				System.out.println("Ŀ¼����ʧ��");
			}
		}
		
		//��Ŀ¼
		public static void GetDirList(String DirPath,String output) throws FileNotFoundException{
			File file = new File(DirPath);
			String[] files = file.list();
			StringReader a = null; 
			BufferedReader b = null;
			FileWriter c = null;
			BufferedWriter d = null;
			System.out.println("Ŀ¼��Ϣ���£�");
			for(String name:files){
				System.out.println(name); 
				try {
					a = new StringReader(name);
					b = new BufferedReader(a);
					c = new FileWriter(output,true);
					d = new BufferedWriter(c);
					String line;
					while((line = b.readLine())!=null){
						d.write(line);
						d.flush();
						d.newLine();
					}
					System.out.println("Ŀ¼д��ɹ�");
				} catch (IOException e) {
					e.printStackTrace();
				}finally{
					try {
						d.close();
						c.close();
						b.close();
						a.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
					
				}
			}
			
			
		}
		
	}


