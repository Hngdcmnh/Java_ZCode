

class HCN {
    private double width;
    private double height;
    private String color;

    HCN()
    {

    }

    public HCN(double width, double height, String color) {
        this.width = width;
        this.height = height;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<color.length();i++)
        {
            if(i==0)
            {
//                System.out.println(Character.toUpperCase(color.charAt(i)));
                sb.append(Character.toUpperCase(color.charAt(i)));
            }
            else
            {
                sb.append(Character.toLowerCase(color.charAt(i)));
            }
        }
        this.color = sb.toString();
    }

    public double getDienTich()
    {
        return this.height*this.width;
    }

    public double getChuVi()
    {
        return 2*(this.height+this.width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
