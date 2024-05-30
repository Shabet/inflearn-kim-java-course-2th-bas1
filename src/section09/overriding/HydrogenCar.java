package section09.overriding;

public class HydrogenCar extends Car {

    public void fillHydrogen() {
        System.out.println("수소를 충전합니다.");
    }

    @Override
    public void move() {
        System.out.println("수소차 움직입니다.");
    }
}
