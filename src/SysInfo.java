//��ζ����࣬��ı�ʶclass �����ƣ�����ĸ��д��
    //���Ƕ�һ�����ܵ���в������������룬�������֣����
	//����������ǵ����ԣ������������ǵķ���
	//����������ǵĴ�ӡ������߷���ֵ
/*class Baby{
	//��¼�������ĳ�����Ϣ
	//��Ҫ��¼����Ϣ�ǣ��������Ա�����
	//����������Ϣ���棬�˴����ᱣ�浽���ݿ⣬ֻ�ǽ�����Ľ����ʾ����
	String name;
	private String sex;
	private int age; //���䱻˽�л�����ζ��babyֻ�ܱ�x.setAgeʹ��
	//��Ϊֻ�в�����ʱ�򣬲��в�����������������ֻ����Ҫ��ҳ���ϴ�ӡ��������ôֱ����void
	//�����������Ĳ��������Ҫ����һ�����������ܵ㣩��Ϊ���룬��ô������Ҫʹ��return
     
	
	//һ���ļ���ֻ�ܴ���һ��public�࣬�����������Ʊ������ļ�����ͬ
	//�������࣬���ܹ�����public����Ĭ�����
	//�����ط�������һ����public��privateʹ��
	//������ʹ��privateֻ���ڷ�װ������ʱ��ʹ��
	Baby(){    
		//�޲ι��췽��������һ�����飬�����һ������
	   System.out.println("�±���������");
	 
	   
}
	
	  //��Ϊ����С��������������Ϣ�Ƚ϶�
	  //��ЩС������������֪���Ա�ͳ������ڣ����䣩������û���
	public Baby(String sex,int age){
		   System.out.println("�Ա�"+sex+"���䣺"+age);
		   System.out.println("����û���");
	   }
	
	
	public void setAge(int age){
		if(age<0||age>100){
			System.out.println("������������");
		}else{
		    this.age = age;//this.age��ʾ���Ե��Ǹ��仯
		}
	}
	public void setSex(String b){
		if(b.equals("��")||b.equals("Ů")){
		    sex=b;
		}else{
			System.out.println("�Ա���������");
		}
			
	}
	public int getAge(){
		return age;
	}
	public String getSex(){
	   return sex;
	}
	public String save(){
		//��Ҫ��������ݱ��浽���ݿ���
		//�����ݿ��������,insert into usertbl values(name,sex,age);
		//����Ҫ����������Ľ����������һ��ģ����߲���ʹ�ã���Ҫ�õ�return����
		return "����Ϊ��"+name+"���Ա�Ϊ��"+sex+"������Ϊ��"+age;
	}
	public void show(){
		//������ʾ�����ݿ��б�������Щ����
		System.out.println(save());
	}
}

public class SysInfo {
	public static void main(String[] args) {
		//����Ƕ�����һ��X������baby���͵�
		//�ұ߿����˿ռ䣬ͨ��new��ִ���˹��췽��
		Baby x = new Baby();
		Baby y = new Baby("��",1);
		x.name="xiapyang";
		x.setAge(10);
		x.setSex("Ů");
		String sex=x.getSex();
		int age = x.getAge();
		System.out.println(age);
		System.out.println(sex);
		x.show(); 
	}
}*/



//�����¼ģ���ʹ�÷���
class Login{
	/*private*/ String username;
	/*private*/ String password;
	Login(){
		System.out.println("�û���������δ����");
	}
	public Login(String username,String password){
		System.out.println("�û�����"+username+",���룺"+password);
		this.username = username;
		this.password = password;
	}
	}
/*public void setUsername(String a){
	if(a.charAt(0)>='0'&&a.charAt(0)<='9'){
		System.out.println("�û�����������");
	}else{
		username = a;
	}
}
public void setPassword(String b){
	if(b.length()>5){
		password = b;
	}else{
		System.out.println("������������");
	}
}
public String getUsername(){
	return username;
}
public String getPassword(){
	return password;
}

public void login(){
	if(username.equals("admin") && password.equals("123456")){
		System.out.println("��½�ɹ�!!");
	}else{
		System.out.println("��¼ʧ��!!");
	}
}
public void reset(){
	username = null;
	password = null;
}
}*/
public class SysInfo{
	public static void main(String[] args) {
		Login in1 = new Login();
		Login in2 = new Login("admin","123456");
		
		
		
		/*Login index = new Login();
		index.setUsername("jfdkjg");
		index.setPassword("1213378");
		System.out.println(index.getUsername());
		System.out.println(index.getPassword());*/
		//index.username = "admin";
		//index.password = "123456";
		//index.login();
		//---------����һ���û�ʹ��admin,admin��¼------------
		//�൱��������һ���û������·��ʵ�¼����
		//ϵͳ������һ���µ�session��Login���ٴ�ʵ������
		//Login index2 = new Login();
		//index2.username = "admin";
		//index2.password = "admin";
		//index.login();
}
}
