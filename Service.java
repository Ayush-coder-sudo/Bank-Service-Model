
/* Java program which simulates a bank with two cashiers,
 each with their own working hours, and processes customers arriving randomly at the bank.
  */


  import java.util.Random;
  import java.util.Scanner;
  
  public class Service {
      public static int count1=0;
      public static int count=0;
      
      public static int e=10;//time for cashier 1 in hrs
      public static int f=60;//time for cashier 1 in mins
      public static int g=10;//time for cashier 2in hrs
      public static int h=60;//time for cashier 2in mins
      
      public static  void toServe(int n){
      
          while(n>0){
          if(e<g || ( e==g &&f<=h)){
              toServe1(1);
              
          }
          else{
              toServe2(1);
              
          }
          n--;
       
      }
  }
          private static void toServe1(int n){
              
              while (e < 16 && (e < g || (e == g && f <= h)) && n>0) {
  
              
              if(f>=60){
              f=60-f;
              f=0-f;}
              if(h>=60){
                  h=60-h;
                  h=0-h;
              }
          
                  
                  int max=6;
                  int min=4;
                  Random random=new Random();
                  int y=random.nextInt(max-min+1)+min;
                  
                  count1++;  
                  f=f+y;
                   
                  if(f>=60){
                      f=60-f;
                      f=0-f;
                      e++;
                  }
                  String o=e+":"+f;
                  
                  System.out.println("  person"+count1+" served by cashier 1 :  "+o);
                  System.out.println();
                  //time for cashier 1
                      
                  n--;
              
  
              
              }
              
               
          }
          
  
  
      private static void toServe2(int n){
  
          while (g < 16 && (g < e || (g == e && h <= f)) && n>0) {
  
              
              if(h>=60){
              h=60-h;
              h=0-h;}
              if(f>=60){
                  f=60-f;
                  f=0-f;}
              
                  
                  int max=6;
                  int min=4;
                  Random random=new Random();
                  int y=random.nextInt(max-min+1)+min;
                  
                  count1++;  
                  h=h+y;
                   
                  if(h>=60){
                      h=60-h;
                      h=0-h;
                      g++;
                  }
                  String o=g+":"+h;
                  
                  System.out.println("  person"+count1+" served by cashier 2 :  "+o);
                  System.out.println();
                  //time for cashier 1
                      
                  n--;
              }
              
              
          }
          
  
          
  
      
          
      
      
  
      
  
      public static void main(String args[]) {
          
          
          Scanner sc=new Scanner(System.in);
          Random random=new Random();
          int x=0;
          int a=60;
          System.out.println("Enter the no. of persons standing before opening time");
          int n=sc.nextInt();
          toServe(n);
          int k=n;
          while(x<=360){
              for(int j=10;j<16;j++){
                  a=60-a;
                  a=0-a;
                  
      
              while(a<=60){
                  
                  int min=4;
                  int max=8;
                  int y=random.nextInt(max-min+1)+min;
                  x=x+y;
                  count++;
                  
                  String p=j+":"+ a;
                  x=x+y;
                  
                  
                  
                  if(j>e||j>g){
                      e=j;
                      g=j;
                      f=a;
                      h=a;
                  }
                  
                      if(j==e || j==g){
                          
                      
                          
                          if(a>f || a>h){
                              f=a;
                              h=a;
                              if((f-a<=5 && f-a>0 && f!=a) || (h-a<=5 && h-a>0 && h!=a)){
                                  f=f+(f-a);
                                  h=h+(h-a);
                              }
                          }
                      }
                      k=k+1;
                      
                        System.out.println();  
                        
                  System.out.print(" Arrrival :Person"+k +"  :"+p);
                  System.out.print(" ");
                  toServe(1);
      
                  a=a+y;
              }
              
              }
              
          }
              int p=(count+n)-count1;
              System.out.println();
              System.out.println();
              System.out.println("No.of person left in line is  "+p);
              
              
              
              
          
          }}
          
      
      
      