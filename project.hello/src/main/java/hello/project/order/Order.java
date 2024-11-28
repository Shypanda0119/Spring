package hello.project.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String memberName, int itemPrice, int discount) {
        this.memberId = memberId;
        this.itemName = memberName;
        this.itemPrice = itemPrice;
        this.discountPrice = discount;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId){
        this.memberId = memberId;
    }

    public String getMemberName() {
        return itemName;
    }

    public void setMemberName(String memberName) {
        this.itemName = memberName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discount) {
        this.discountPrice = discount;
    }

    @Override
    public String toString() {
        return "Order [memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice + "]";
    }

    public int calculatePrice() {
        return itemPrice - discountPrice;
    }
}
