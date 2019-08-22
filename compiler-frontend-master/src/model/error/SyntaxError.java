package model.error;

public class SyntaxError extends Error {
    private final String expected;

    public SyntaxError(int line, String token, String expected, String type) {
        super(line, token);
        this.type = type;
        this.expected = expected;
    }


    @Override
    public String toString() {
        return String.format("%2d %s (recebido: %s, esperado: %s)", this.getLine(), this.getType(), this.getToken(), this.expected);
    }
}
