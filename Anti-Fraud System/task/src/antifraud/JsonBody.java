package antifraud;

interface JsonBody {
}

class AmountBody implements JsonBody{
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

class ResultBody implements JsonBody{
    String result;

    public ResultBody() {
    }

    public ResultBody(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
