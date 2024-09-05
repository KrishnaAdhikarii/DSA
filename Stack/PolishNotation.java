import java.util.Scanner;
import java.util.Stack;

public class PolishNotation {
    public static boolean isOperand(char a){
        return (a>='0'&&a<='9')||(a>='a'&&a<='z')||(a>='A'&&a<='Z');
    }
    public static int precedence(char a) {
        if (a == '^') {
            return 4; 
        } else if (a == '*' || a == '/') {
            return 3;
        } else if (a == '+' || a == '-') {
            return 2;
        } else {
            return 1;
        }
    }
    
    public static String Reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

    public static String InfixToPostfix(String str){
        StringBuilder postfix=new StringBuilder();
        Stack<Character> s=new Stack<>();
         for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           
            if(isOperand(curr)){
               postfix.append(" ").append(curr);
            }
            else if (curr=='(') {

                s.push(curr);
            }
            else if(curr==')'){
                
                while(!s.empty()&&s.peek()!='('){
                    postfix.append(" ").append(s.pop());

                }
                if(!s.empty()){
                s.pop();}

                
            }
            else{
                while(!s.empty()&&precedence(curr)<=precedence(s.peek())){

                    postfix.append(" ").append(" ").append(s.pop());

                }
                s.push(curr);
            }
        }

        while(!s.empty()){

            postfix.append(" ").append(s.pop());
        }
        return postfix.toString();
    }

    public static String InfixToPrefix(String str){
        String rev=Reverse(str);
        
        char [] revString = new String(rev).toCharArray();
        for(int i=0;i<revString.length;i++){
            if(revString[i]=='('){
                revString[i]=')';
                i++;
            }
            if(revString[i]==')'){
                revString[i]='(';
                i++;
            }

        }
        String revvv=new String(revString);
        String result= InfixToPostfix(revvv);
        return Reverse(result);
    }


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter  String:");
        String Str=sc.nextLine();

        System.out.println("Given String:"+Str);
        // System.out.println("PostFix Notation:"+InfixToPostfix(Str));
        // System.out.println("Prefix Notation:"+InfixToPrefix(Str));
        System.out.println("Parenthesis:"+Prblm1.check_parenthesis(Str));

        sc.close();
    }
}
