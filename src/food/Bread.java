package food;


public class Bread implements AbstractBaked {
    @Override
    public void BakedBread(String which){
        System.out.println(which);
    }
    @Override
    public void Bread(String name){
        System.out.println(name);
    }
}
