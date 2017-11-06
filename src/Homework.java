//1.创建一个Login的类，有输入项username和password
//2.其中username要求是1开关的11位手机号（限制是1开头，11位）
//3.密码要求是6位数字（100000~999999）
//4.要实现，实例化一个登录对象的时候就输入用户名和密码
//5.设计一个登录的方法，当密码=用户名的最后6位时，登录成功，否则登录失败。


class Logining{
	 private String username;
	 private int password;
	
	
	  //实例化一个登录对象的时候就输入用户名和密码
	  /*Logining(String username,int password){
		System.out.println("用户名："+username+"，密码："+password);
	}*/
	public Logining(String username,int password){
	       if(username.charAt(0)=='1'&&username.length()==11){
				if(password>=100000&&password<=999999){
					String i = username.substring(5, 11);
					int s=Integer.valueOf(i).intValue(); //因为password的类型为int，而username的类型为String，所以需要将username的类型转化为int型
					if(password == s){
				        System.out.println("登录成功");
			       }else{
				        System.out.println("登录失败");
			        }
			    }else{
			    	System.out.println("密码输入错误");
			    	}
		  }else{
			  System.out.println("用户名输入错误");
			  } 
      }

   
 	/*public void setUsername(String username){
		if(username.substring(0, 1).equals("1")&&username.length()==11){
			this.username = username;
		}else{
			System.out.println("用户名输入错误");
		}
	}
	public void setPassword(int password){
		if(password>=100000&&password<=999999){
			this.password = password;
		}else{
			System.out.println("密码输入错误");
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



