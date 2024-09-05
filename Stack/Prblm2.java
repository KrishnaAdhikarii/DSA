import java.util.Scanner;
import java.util.Stack;

public class Prblm2 {

    public static String sort(String Str){
        char temp;
        String Sb;
        char[] str=Str.toCharArray();
        for(int i=0;i<str.length-1;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i]>str[j]){
                  temp=str[i];
                  str[i]=str[j];
                  str[j]=temp;
                }
                
            }
           

        }        
        Sb=new String(str);
        // System.out.println("Given String:"+Sb);
        return Sb;
    }

    public static String duplicate(String str){
       Stack<Character> s=new Stack<>();
       StringBuilder Sb=new StringBuilder();
       String Res= new String();
       for(int i=0;i<str.length();i++){
        char curr= str.charAt(i);
        if(!s.contains(curr)){
            s.add(curr);
           Sb.append(curr);
       }}
       Res=Sb.toString();
    //    System.out.println("Res "+Res);
       String Result=sort(Res);
       
       return Result;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter  String:");
        String Str=sc.nextLine();
        System.out.println("Given String:"+Str);
        System.out.println("Answer:"+duplicate(Str));

        sc.close();
    }
}
