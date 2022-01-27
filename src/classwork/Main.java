package classwork;

public class Main {
    public static void main(String[] args) {
        Swimable[] swimables = {new Shark(),new Turtle(),new Duck()};
        for (Swimable element: swimables
        ){
            if(element instanceof Turtle){
                ((Turtle) element).setAge(12);
            }

            element.swim();
        }
    }
}
