package section06.access.ex.counter;

public class MaxCounter {
    private int count;
    private final int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        //검증 로직
        if (count >= max) {
            System.out.println("최대값을 초과할수 없습니다.");
            return;
        }

        //실행 로직
        this.count++;
    }

    public int getCount() {
        return this.count;
    }
}
