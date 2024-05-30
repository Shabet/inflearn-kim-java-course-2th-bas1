package section09.extends01.ex03;

public class HydrogenCar extends Car {

    public void fillHydrogen() {
        System.out.println("수소를 충전합니다.");
    }

    @Override
    public void move() {
        System.out.println("수소차 움직입니다.");
    }
}
