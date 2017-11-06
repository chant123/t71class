import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class CharIOWriter {
	public static void main(String[] args){
		String data = "我爱代码，代码是我快乐！！！";
		StringReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
		    fr = new StringReader(data);
			br = new BufferedReader(fr);
			fw = new FileWriter("D:\\T71\\taiwu.jpg");
		    bw = new BufferedWriter(fw);
		    String line;
		    while((line=br.readLine())!=null){
		    	bw.write(line);
		    	bw.flush();
		    }
		    System.out.println("文件写入成功");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				bw.close();
				fw.close();
				br.close();
				fr.close();
			}catch(IOException e){
				e.printStackTrace();
			}
					
		}
		
			
	}

}
