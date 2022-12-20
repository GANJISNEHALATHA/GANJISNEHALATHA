class Addition
{
    double a,b,c;
    double add(double i)
    {
        
    double add()
    {
        System.out.println("0 parameter");
        a=b=c=2;
        return a+b+c;
    }
    double add(double int1,double int2,double int3)
    {
        System.out.println("3 parameters of double");
        a=int1;
        b=int2;
        c=int3;
        return a+b+c;
    }
    int add(int i)
    {
        System.out.println("single parameter of int");
        a=i;
        b=i;
        c=i;
        return a+b+c;
    }
}
class Overloading
{
    public static void main(String args[])
    {
        Addition A=new Addition();
        double s1,s2,s3;
        s1=A.add();
        System.out.println("sum of first num"+s1);
        s2=A.add(10);
        System.out.println("sum of first num"+s2);
        s3=A.add(10,20,30);
        System.out.println("sum of first num"+s3);
    }
}