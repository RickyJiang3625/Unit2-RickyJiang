import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter first xy coordinate: ");
String first=s.nextLine();
        String firstNoParentheses=first.substring(1,first.length()-1);
        int noComma=firstNoParentheses.indexOf(",");
        String noCommaYesX=firstNoParentheses.substring(0,noComma);
        String noCommaYesY=firstNoParentheses.substring(noComma+1,firstNoParentheses.length());
     int firstX=  Integer.parseInt(noCommaYesX);
     int firstY  =Integer.parseInt(noCommaYesY);
        System.out.print("Enter second xy coordinate: ");
        String second=s.nextLine();
        String secondNoParentheses=second.substring(1,second.length()-1);
        int secondNoComma=secondNoParentheses.indexOf(",");
        String secondNoCommaYesX=secondNoParentheses.substring(0,noComma);
        String secondNoCommaYesY=secondNoParentheses.substring(noComma+1,secondNoParentheses.length());
        int secondX=  Integer.parseInt(secondNoCommaYesX);
        int secondY  =Integer.parseInt(secondNoCommaYesY);
        LinearEquation Equation=new LinearEquation(firstX,firstY,secondX,secondY);
        System.out.println(firstNoParentheses);
        System.out.print(noCommaYesX+noCommaYesY);



    }
}