package factory;

public class Add implements Calculate {
    @Override
    public void calculate (Integer a,Integer b)
    {
        System.out.println(a+b);
    }
}
