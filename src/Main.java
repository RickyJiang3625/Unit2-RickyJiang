import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("Enter first xy coordinate: ");
String first=s.nextLine();
        String firstNoParentheses=first.substring(1,4);
        int noComma=firstNoParentheses.indexOf(",");
        String noCommaYesX=firstNoParentheses.substring(0,noComma);
        String noCommaYesY=firstNoParentheses.substring(noComma+1,3);
     int firstX=  Integer.parseInt(noCommaYesX);
     int firstY  =Integer.parseInt(noCommaYesY);
        System.out.print("Enter second xy coordinate: ");
        String second=s.nextLine();
        String secondNoParentheses=second.substring(1,4);
        int secondNoComma=secondNoParentheses.indexOf(",");
        String secondNoCommaYesX=secondNoParentheses.substring(0,noComma);
        String secondNoCommaYesY=secondNoParentheses.substring(noComma+1,3);
        int secondX=  Integer.parseInt(secondNoCommaYesX);
        int secondY  =Integer.parseInt(secondNoCommaYesY);
        LinearEquation Equation=new LinearEquation(firstX,firstY,secondX,secondY);
        System.out.print(Equation.calculateSlope());



    }
}