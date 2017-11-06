import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args){
		Collection<String> schools = new HashSet<String>();
		schools.add("��������ѧԺ");
		schools.add("����ѧԺ");
		schools.add("������ѧԺ");
		schools.add("���Ͼ���ѧԺ");
		schools.add("����һʦ��");
		
		Iterator<String> iter=schools.iterator();
		
		while(iter.hasNext()){
			String school = (String)iter.next();
			System.out.println(school);
			
			if(school.contains("����һʦ��")){
				iter.remove();
			}
		}
		
		for(String s:schools)
			System.out.println("--"+s);
		
	}

}
