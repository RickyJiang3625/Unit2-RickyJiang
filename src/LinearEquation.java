
public class LinearEquation {
private int x;
        private int y;
        private  int x2;
        private  int y2;


        private double roundedSlope;
        private double yIntercept;
        private double distanceX;
        private double y3;
private int x3;
public LinearEquation(int firstX, int firstY, int secondX, int secondY ){
        x=firstX;
                y=firstY;
                        x2=secondX;
                                y2=secondY;

}

public double calculateSlope(){


        double slope=(double)(y2-y)/(double)(x2-x);
 roundedSlope=Math.round((double) ((y2-y) / (x2-x)*100.0)/100.0);
return roundedSlope;
}
public double calculateYIntercept() {
        yIntercept = Math.round((y - (calculateSlope() * x)) * 100.0) / 100.0;
        return yIntercept;
}
public double distanceBetweenPoints(){
 distanceX=Math.round(Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)) * 100.0) / 100.0;
return distanceX;

}
public String toString(){
        String yes =  "/"+ (x2-x) + "x +" + calculateYIntercept();
        String info=("First Coordinate: ("+x+","+y+")\nSecond Coordinate: ("+x2+","+y2+")\nSlope:"+ calculateSlope()+"\nY-Intercept:"+calculateYIntercept()+"\nDistance: "+distanceBetweenPoints()+"\nSlope Intercept Equation: y = "+(y2-y)+yes+"\n");
return info;
}
        public LinearEquation(int thirdX){
                thirdX=x3;
        }
public double getThirdY(){
         y3=(roundedSlope*x3)+yIntercept;
        return y3;}
        public void thirdCoords(){
            System.out.println("("+x3+","+y3+")");
        }
}

