import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteInputOutput {
	public static void main(String[] args){
		ByteInputOutput.CopyFileUtils("G:/软件/2016.HD720P.mp4", "D:/T71/1.mp4");
		
		
		  
		  
	}
	public static void CopyFileUtils(String inputfile,String outputfile){
		  FileInputStream fis = null;
		  BufferedInputStream bis = null;
		  
		  FileOutputStream fos = null;
		  BufferedOutputStream bos = null;
		  
		  try{
			  fis = new FileInputStream(inputfile);
			  bis = new BufferedInputStream(fis);
			  
			  fos = new FileOutputStream(outputfile);
			  bos = new BufferedOutputStream(fos);
			  
			  byte[] data = new byte[1024];
			  int len;
			  while((len = bis.read(data))!= -1){
				  bos.write(data, 0, len);
				  bos.flush();
			  }
			  System.out.println("文件已经成功复制");
		  }catch(Exception e){
			  e.printStackTrace();
		  }
		  try{
			  bos.close();
			  fos.close();
			  bis.close();
			  fis.close();
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	}

}
