package interfaces;

public class Child implements AbstractMom,AbstractFather {
@Override
    public void sayMom(String name){
    System.out.println(name);
}
 @Override
    public void sayFather(String name){
     System.out.println(name);
 }
}
