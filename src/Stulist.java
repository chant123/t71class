import java.util.ArrayList;
import java.util.List;

public class Stulist {

	public static void main(String[] args) {
		List<Stu> stus = new ArrayList<Stu>();
		
		Stu stu1 = new Stu(1,"����",100);
		Stu stu2 = new Stu(2,"����",99);
		Stu stu3 = new Stu(3,"����",98);
		Stu stu4 = new Stu(4,"����",97);
		Stu stu5 = new Stu(5,"����",96);
		
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		stus.add(stu5);
		
		for(Stu str:stus){
			System.out.println("ѧ��Ϊ��"+str.getId()+"  ����Ϊ��"+str.getName()+"  ����Ϊ��"+str.getScore());
		}

	}

}
