//1.����һ��Login���࣬��������username��password
//2.����usernameҪ����1���ص�11λ�ֻ��ţ�������1��ͷ��11λ��
//3.����Ҫ����6λ���֣�100000~999999��
//4.Ҫʵ�֣�ʵ����һ����¼�����ʱ��������û���������
//5.���һ����¼�ķ�����������=�û��������6λʱ����¼�ɹ��������¼ʧ�ܡ�


class Logining{
	 private String username;
	 private int password;
	
	
	  //ʵ����һ����¼�����ʱ��������û���������
	  /*Logining(String username,int password){
		System.out.println("�û�����"+username+"�����룺"+password);
	}*/
	public Logining(String username,int password){
	       if(username.charAt(0)=='1'&&username.length()==11){
				if(password>=100000&&password<=999999){
					String i = username.substring(5, 11);
					int s=Integer.valueOf(i).intValue(); //��Ϊpassword������Ϊint����username������ΪString��������Ҫ��username������ת��Ϊint��
					if(password == s){
				        System.out.println("��¼�ɹ�");
			       }else{
				        System.out.println("��¼ʧ��");
			        }
			    }else{
			    	System.out.println("�����������");
			    	}
		  }else{
			  System.out.println("�û����������");
			  } 
      }

   
 	/*public void setUsername(String username){
		if(username.substring(0, 1).equals("1")&&username.length()==11){
			this.username = username;
		}else{
			System.out.println("�û����������");
		}
	}
	public void setPassword(int password){
		if(password>=100000&&password<=999999){
			this.password = password;
		}else{
			System.out.println("�����������");
		}
	}
	
	public String getUsername(){
		return username;
	}
	public int getPassword(){
		return password;
	}*/	
}
public class Homework {
	public static void main(String[] args) {
		Logining index = new Logining("12343123456",123456); 
		
	}
}



