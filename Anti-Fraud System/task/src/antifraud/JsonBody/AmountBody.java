package antifraud.JsonBody;

public class AmountBody {
    long amount;

    public AmountBody() {
    }

    public AmountBody(long amount) {
        this.amount = amount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
}

