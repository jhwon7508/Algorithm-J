package lv1;

/* package whatever; // don't place package name! */

import java.io.*;

class MyCode
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        String[] arr = input.split(" ");
        int[] num = new int[arr.length];
        
        boolean ari = false;
        boolean dif = false;
        boolean geo = false;
        
        
        for(int i=0; i<arr.length-2; i++){
            num[i]=Integer.parseInt(arr[i]);
        	
            if(num[i]-num[i+1] == num[i+1]-num[i+2]){
                dif = true;
            }else{
                dif = false;
                break;
            }
   
            if(num[i+1]/num[i] == num[i+2]/num[i+1]){
                geo = true;
            }else{
                geo = false;
                break;
            }
        }
        


        
        
        for(int i=0; i<arr.length; i++){
            num[i]=Integer.parseInt(arr[i]);
            
            if(arr.length<2){
                input = "VAGUE";
            }else if(arr.length>2){
                //등차수열
                if(num[1]-num[0] == num[2]-num[1]){
                    ari = true;
                    int d = num[1]-num[0];
                    input = Integer.toString(num[arr.length-1]+d);
                }
                //등비수열
                try {
	                if(num[1]/num[0] == num[2]/num[1]){
	                    int r = num[1]/num[0];
	                    input = Integer.toString(num[arr.length-1]*r);
	                }
                }catch (Exception e){
                    //에러시 수행
                    e.printStackTrace();
                    throw e;
               }finally{
                	
               }
                
               
            }
            
            
            
        }
        
        System.out.println(input);
    }
}