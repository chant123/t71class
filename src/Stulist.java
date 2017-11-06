import java.util.ArrayList;
import java.util.List;

public class Stulist {

	public static void main(String[] args) {
		List<Stu> stus = new ArrayList<Stu>();
		
		Stu stu1 = new Stu(1,"张三",100);
		Stu stu2 = new Stu(2,"李四",99);
		Stu stu3 = new Stu(3,"王五",98);
		Stu stu4 = new Stu(4,"赵六",97);
		Stu stu5 = new Stu(5,"田七",96);
		
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		stus.add(stu5);
		
		for(Stu str:stus){
			System.out.println("学号为："+str.getId()+"  姓名为："+str.getName()+"  分数为："+str.getScore());
		}

	}

}
