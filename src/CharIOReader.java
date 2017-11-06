import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

 
public class CharIOReader {
	public static void main(String[] args){
		 FileReader fr = null;
		 BufferedReader bf = null;
		try{
			 fr = new FileReader("D:\\T71\\newdream.txt");
			 bf = new BufferedReader(fr);
			 String line = null;
			 while((line = bf.readLine())!=null){
				 System.out.println(line);
			 }
			 System.out.println("�ı���ȡ�ɹ�");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				bf.close();
				fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
}

}
