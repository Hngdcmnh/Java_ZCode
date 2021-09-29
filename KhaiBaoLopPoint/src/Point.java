class Point {
    private double x;
    private double y;

    Point()
    {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(Point p1)
    {
        double res = Math.sqrt((p1.x - this.x)*(p1.x - this.x) + (p1.y - this.y)*(p1.y - this.y));
        return res;
    }

    public static double distanceBetween(Point p1,Point p2)
    {

        double res = Math.sqrt((p1.x - p2.x)* (p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
        return res;
    }

    public String toString()
    {
        return this.toString();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
