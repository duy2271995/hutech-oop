// Overloading Demo
class Student
{
    String id, name;
    int score1, score2, score3;
    void setData(String s)  {id = s;}
    void setData(String s1, String s2) {id = s1;   name = s2;}
    void setData(String s1, String s2, int score1, int score2, int score3)
    {
        id = s1;    name = s2;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }

    void outData()
    {
        System.out.println(id + ", " + name + ", " + score1 + ", " + score2 + ", " + score3);
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        st1.setData("HS01", "Hoa");
        st2.setData("HS02", "Tuyet", 5, 6, 7);
        st3.setData("HS03");
        st1.outData();
        st2.outData();
        st3.outData();
    }
}