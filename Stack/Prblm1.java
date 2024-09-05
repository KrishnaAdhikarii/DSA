import java.util.Scanner;
import java.util.Stack;

public class Prblm1 {
    public static boolean check_parenthesis(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='('||curr=='{'||curr=='['){
                s.push(curr);
            }
            else{
                if(s.empty()){
                    return false;
                }
                char top=s.pop();
                if((curr==')')&&(top!='(')){
                    return false;
                }
                if(curr==']'&&top!='['){
                    return false;
                }
                if(curr=='}'&&top!='{'){
                   return false;
                }
            }
            
        }
        return s.empty();
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter  String:");
        String Str=sc.nextLine();

        System.out.println("Given String:"+Str);
      
        System.out.println("Parenthesis:"+check_parenthesis(Str));

        sc.close();
    }


}
