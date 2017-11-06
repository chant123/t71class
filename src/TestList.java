
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
	public static void main(String[] args){
		List<String> students = new ArrayList<String>();
	
		students.add("张三");
		students.add("李四");
		students.add("王五");
		students.add("赵六");
		students.add("田七");
		
		int size = students.size();
		System.out.println("学生数量为："+size);
		
		for(int i=0;i<size;i++){
			System.out.println(students.get(i));
		}
		
		System.out.println("使用for的第二种用法遍历集合");
		for(String name:students){
			System.out.println(name);
		}
		
		//方法3
		System.out.println(students.toString());
		 
		//移除
		students.remove(0);
		students.remove("赵六");
		System.out.println("移除之后的结果："+students.toString());
		
		//包含
		boolean flag = students.contains("王五");
		if(flag){
			System.out.println("存在一个叫王五的学生");
		}else{
			System.out.println("不存在叫王五的学生");
		}
		
		//复制到一个数组中
		String[] names = new String[5];
		students.toArray(names);
		System.out.println(Arrays.toString(names));
		
		//清除
		students.clear();
		System.out.println("清除之后的内容为："+students.toString());
		
	}

}
