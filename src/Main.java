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
        Equation.calculateSlope();
        Equation.calculateYIntercept();
        Equation.distanceBetweenPoints();
        System.out.print(Equation.toString());
        System.out.print("Enter third X coordinate:");
        String third=s.nextLine();
        int thirdCoord=Integer.parseInt(third);
        LinearEquation Equation2= new LinearEquation(thirdCoord);
        Equation.getThirdY(thirdCoord);
        Equation2.x3();
        Equation.y3();




    }
}