import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		//创建一个Map对象
		Map<Integer,String> stumap = new HashMap<Integer,String>();
        stumap.put(1, "张三");
        stumap.put(2, "李四");
        stumap.put(3, "王五");
        stumap.put(4, "赵六");
        stumap.put(5, "田七");
        
        //size
        int size = stumap.size();
        System.out.println("现有学生"+size);
        
        //get方法获取数据
        String name = stumap.get(3);
        System.out.println("3号为："+name);
        
        //遍历Map
        //方法1：
        for(int key:stumap.keySet()){
        	System.out.println("键为："+key+",值为："+stumap.get(key));
        }
        //方法2：
        for(Entry<Integer, String> stu:stumap.entrySet()){
        	System.out.println("键为："+stu.getKey()+",值为："+stu.getValue());
        }
        
        //包含
        boolean flag1 = stumap.containsKey(5);
        if(flag1){
        	System.out.println("包含我们要查找的键");
        }else{
        	System.out.println("不包含我们要查找的键");
        }
        boolean flag2 = stumap.containsValue("王五");
       if(flag2){
    	   System.out.println("包含我们要查找的值");
        }else{
           System.out.println("不包含我们要查找的值");
        }
        
        //移除
       
        stumap.remove(1);
        stumap.remove(2, "李四");
        System.out.println(stumap.toString());
        
        //清除
        stumap.clear();
        System.out.println(stumap.toString());
	}

}
