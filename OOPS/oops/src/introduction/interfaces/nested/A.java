package introduction.interfaces.nested;

public class A {
    // nexted interface

    public interface  NestedInterface{
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}


