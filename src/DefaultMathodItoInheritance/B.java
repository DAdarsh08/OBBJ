package DefaultMathodItoInheritance;

public class B implements A.nested{

    @Override
    public boolean isOdd(int num) {
        return (num&1)==1;
    }
}
