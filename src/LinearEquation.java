
public class LinearEquation {
private int x;
        private int y;
        private  int x2;
        private  int y2;
        private  int differenceOfXs;
        private  int differenceOfYs;
public LinearEquation(int firstX, int firstY, int secondX, int secondY ){
        x=firstX;
                y=firstY;
                        x2=secondX;
                                y2=secondY;
                                differenceOfXs=(x2-x);
                                differenceOfYs=(y2-y);
}
public double calculateSlope(){
        int numerator=differenceOfYs;
        int denominator=differenceOfXs;

        double slope=differenceOfYs/differenceOfXs;
        double roundedSlope=Math.round((slope*100.0)/100.0);
return roundedSlope;
}

}
