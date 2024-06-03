package section06.access.ex.shooping;

public class ShoppingCart {
    private static final int max = 10;
    private Item[] items;
    private int itemCount;

    public ShoppingCart() {
        items = new Item[max];
        int itemCount = 0;
    }

    public void addItem(Item item1) {
        //검증 로직
        if (itemCount >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        //실행 로직
        items[itemCount++] = item1;
    }

    public void displayItem() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
