package week2_ComputerProgram;

public enum Operator {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    EXPONENT("^");

    private final String symbol;

    public String getSymbol() {
        return symbol;
    }

    private Operator(String symbol) {
        this.symbol = symbol;
    }

    static public Operator getOp(String op) {
        for (Operator opt : Operator.values()) {
            if (opt.getSymbol().equals(op)) {
                return opt;
            }
        }
        return null;
    }

}
