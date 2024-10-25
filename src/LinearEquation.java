public class LinearEquation {
    private double x1;
    private double x2;
    private double y1;
    private double y2;


    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public double distance() {
        double xDif = x2 - x1;
        double yDif = y2 - y1;
        return roundedToHundredth(Math.sqrt(Math.pow(xDif, 2) + Math.pow(yDif, 2)));
    }


    public double slope() {
        double xDif = x2 - x1;
        double yDif = y2 - y1;
        return roundedToHundredth(yDif/xDif);
    }
    public double yIntercept() {
        double xDif = x2 - x1;
        double yDif = y2 - y1;
        return roundedToHundredth(y1 - slope() * x1);
    }


    public String equation() {
        double xDif = x2 - x1;
        double yDif = y2 - y1;
        String equation = "";
        String yIntercept = "";
        if (yDif/xDif < 0) {
            equation += "-" + Math.abs(yDif) + "/" + Math.abs(xDif);
        } else if (yDif/xDif > 0) {
            equation += Math.abs(yDif) + "/" + Math.abs(xDif);
        } else {
            equation += "";
        }


        if (yIntercept() < 0) {
            yIntercept += yIntercept();
        } else if (yIntercept() > 0) {
            yIntercept += "+" + yIntercept;
        } else {
            yIntercept = "";
        }
        return "y = " + equation + yIntercept;
    }


    public String coordinateForX(double x) {
        return "(" + x + ", " + (slope() * x + yIntercept());
    }


    public String lineInfo() {
        String str = "";
        str += "Your two point are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\n";
        str += "The equation of the line between these points is: " + equation() + "\n";
        str += "The y-intercept of this line is: " + yIntercept() + "\n";
        str += "The slope of this line is: " + slope() + "\n";
        str += "The distance between these points is " + distance();
        return str;
    }


    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}

