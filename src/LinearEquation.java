
public class LinearEquation {
private int x;
        private int y;
        private  int x2;
        private  int y2;
        private final int differenceOfXs;
        private final int differenceOfYs;
        private double roundedSlope;
        private double distance;
        private double yIntercept;
public LinearEquation(int firstX, int firstY, int secondX, int secondY ){
        x=firstX;
                y=firstY;
                        x2=secondX;
                                y2=secondY;
                                differenceOfXs=(x2-x);
                                differenceOfYs=(y2-y);
}
public double calculateSlope(){


        double slope=(double)differenceOfYs/differenceOfXs;
        double roundedSlope=Math.round((slope*100.0)/100.0);
return roundedSlope;
}
public double CalculateYIntercept() {
        x = 0;
      yIntercept = y - (x * roundedSlope);
        return yIntercept;
}
public double distanceBetweenPoints(){
 distance=Math.sqrt((differenceOfXs*differenceOfXs)+(differenceOfYs*differenceOfYs));
return distance;

}
public String toString(){
return


}
}
