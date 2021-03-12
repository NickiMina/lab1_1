package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Discount {
    private String discountCause;
    private Money money;
    private BigDecimal value;

    public Discount(String discountCause, Money money, BigDecimal value) {
        this.discountCause = discountCause;
        this.money = money;
        this.value = value;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public Money getMoney() {
        return money;
    }

    public BigDecimal getValue() {
        return value;
    }



}
