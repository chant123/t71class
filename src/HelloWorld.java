
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /* System.out.println(Byte.MAX_VALUE);
     System.out.println(Integer.MAX_VALUE);
     System.out.println(Integer.MIN_VALUE);
     System.out.println(Integer.SIZE);
     
     int max;
     int min;
     max=Integer.MAX_VALUE+1;
     min=Integer.MIN_VALUE-1;
     System.out.println("最大值+1:"+max);
     System.out.println("最小值-1:"+min);*/
		
	 String idcard="352202199908267756";
     String sex_string;
     sex_string=idcard.substring(16, 17);
     int sex_int = Integer.parseInt(sex_string);
     if(sex_int%2==0){
         System.out.println("该身份证是女性");
	}
     else{
    	 System.out.println("该身份证是男性");
     }
	}

}
