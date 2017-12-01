package homework;

import org.junit.Test;

public class HomePage {
	public static void main(String[] args){  
        test();  
    }  
      
    public static void test(){  
        Myself addtest = new Myself();
        int num1 = 3;
        int num2 = 4;
        int restul = addtest.addSuan(num1, num2);
        System.out.println(restul);
          
        float num3 = 3.0f;  
        float num4 = 7.0f;  
        System.out.println("浮点数和:"+addtest.addSuan(num3, num4));
          
        double num5 = 99.0;  
        double num6 = 1.0;  
        System.out.println("双精度浮点数和:"+addtest.addSuan(num5, num6));  
          
        long num7 = 300;  
        long num8 = 700;  
        System.out.println("长整数和:"+addtest.addSuan(num7, num8));
    } 
    
}
