package Figure;

public class Circle implements AbstractDrawable {
    @Override
    public void DrawableCircle(String which){
        System.out.println(which);
    }
    @Override
    public void Circle (String name){
        System.out.println(name);
    }
}
