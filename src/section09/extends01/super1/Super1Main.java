package section09.extends01.super1;

public class Super1Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.call();
        child.hello();
        ((Parent)child).hello();
    }
}
