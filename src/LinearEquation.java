
public class LinearEquation {
private int x;
        private int y;
        private  int x2;
        private  int y2;


        private double roundedSlope;
        private double yIntercept;
        private double distanceX;

private int x3;
private double y3;
public LinearEquation(int firstX, int firstY, int secondX, int secondY ){
        x=firstX;
                y=firstY;
                        x2=secondX;
                                y2=secondY;

}
    public LinearEquation(int thirdX){
        x3=thirdX;

    }

public double calculateSlope(){


        double slope=(double)(y2-y)/(double)(x2-x);
 roundedSlope=Math.round( (double) ((y2-y) / (x2-x)*100.0)/100.0);
return roundedSlope;
}
public double calculateYIntercept() {
        yIntercept = Math.round((y - (roundedSlope * x)) * 100.0) / 100.0;
        return yIntercept;
}
public double distanceBetweenPoints(){
 distanceX=Math.round(Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2)) * 100.0) / 100.0;
return distanceX;

}
public String toString(){
        String yes =  "/"+ (x2-x) + "x +" + yIntercept;
        String info=("First Coordinate: ("+x+","+y+")\nSecond Coordinate: ("+x2+","+y2+")\nSlope:"+ roundedSlope+"\nY-Intercept:"+yIntercept+"\nDistance: "+distanceX+"\nSlope Intercept Equation: y = "+(y2-y)+yes+"\n");
return info;
}

public double getThirdY(int thirdX){
         y3=roundedSlope*thirdX+yIntercept;
        return y3;}

    public void x3(){
        System.out.print("Solved Coordinate: ("+(double)x3);
    }
    public void y3(){
            System.out.println(","+y3+")");
        }

}

