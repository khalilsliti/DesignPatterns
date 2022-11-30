package factory;

public class Multiply implements Calculate {
    public void calculate (Integer a, Integer b)
    {
        System.out.println(a*b);
    }
}
