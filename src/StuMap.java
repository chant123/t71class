import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StuMap {
	public static void main(String[] args){
		Map<Integer,Stu> stus = new HashMap<Integer,Stu>();
		
		Stu stu1 = new Stu(1,"����",100);
		Stu stu2 = new Stu(2,"����",99);
		Stu stu3 = new Stu(3,"����",98);
		Stu stu4 = new Stu(4,"����",97);
		Stu stu5 = new Stu(5,"����",96);
		
		stus.put(1, stu1);
		stus.put(2, stu2);
		stus.put(3, stu3);
		stus.put(4, stu4);
		stus.put(5, stu5);
		
		for(Entry<Integer, Stu> stumap:stus.entrySet()){
			System.out.println("ѧ��Ϊ��"+stumap.getValue().getId()+"  ����Ϊ��"+stumap.getValue().getName()+"   ����Ϊ��"+stumap.getValue().getScore());
		}
	}

}
