import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {
		//����һ��Map����
		Map<Integer,String> stumap = new HashMap<Integer,String>();
        stumap.put(1, "����");
        stumap.put(2, "����");
        stumap.put(3, "����");
        stumap.put(4, "����");
        stumap.put(5, "����");
        
        //size
        int size = stumap.size();
        System.out.println("����ѧ��"+size);
        
        //get������ȡ����
        String name = stumap.get(3);
        System.out.println("3��Ϊ��"+name);
        
        //����Map
        //����1��
        for(int key:stumap.keySet()){
        	System.out.println("��Ϊ��"+key+",ֵΪ��"+stumap.get(key));
        }
        //����2��
        for(Entry<Integer, String> stu:stumap.entrySet()){
        	System.out.println("��Ϊ��"+stu.getKey()+",ֵΪ��"+stu.getValue());
        }
        
        //����
        boolean flag1 = stumap.containsKey(5);
        if(flag1){
        	System.out.println("��������Ҫ���ҵļ�");
        }else{
        	System.out.println("����������Ҫ���ҵļ�");
        }
        boolean flag2 = stumap.containsValue("����");
       if(flag2){
    	   System.out.println("��������Ҫ���ҵ�ֵ");
        }else{
           System.out.println("����������Ҫ���ҵ�ֵ");
        }
        
        //�Ƴ�
       
        stumap.remove(1);
        stumap.remove(2, "����");
        System.out.println(stumap.toString());
        
        //���
        stumap.clear();
        System.out.println(stumap.toString());
	}

}
