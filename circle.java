class circle
{
    int x, y, r;

    public int getX() 
    {
        return x;
    }

    public void setX(int xx)
    {
        x = xx;
    }
    
    public int getY()
    {
        return y;
    }

    public void setY(int yy)
    {
        y = yy;
    }

    public int getR()
    {
        return r;
    }

    public void setR(int rr)
    {
        if(rr >= 0) r = rr;
    }

    public double getArea()
    {
        return Math.PI * r * r;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * r;
    }

    public void outData()
    {
        System.out.println("" + x + ", " + y + ", " + r);
    }

    public void setData(int x, int y, int r)
    {
        this.x = x;
        this.y = y;
        this.r = r;
    }
}

class useCircle
{
    public static void main(String[] args)
    {
        circle c = new circle();
        System.out.println("Circle raw data: ");
        c.outData();
        c.setData(5, 6, 7);
        System.out.println("Data after assigning values: ");
        c.outData();
        System.out.println("Square: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

    }
}

