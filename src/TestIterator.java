import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args){
		Collection<String> schools = new HashSet<String>();
		schools.add("湖南文理学院");
		schools.add("邵阳学院");
		schools.add("湖南商学院");
		schools.add("湖南警察学院");
		schools.add("湖南一师范");
		
		Iterator<String> iter=schools.iterator();
		
		while(iter.hasNext()){
			String school = (String)iter.next();
			System.out.println(school);
			
			if(school.contains("湖南一师范")){
				iter.remove();
			}
		}
		
		for(String s:schools)
			System.out.println("--"+s);
		
	}

}
