package ss10.Btap;

public class aaa extends RuntimeException {
    public aaa(String message) {
        super(message);
    }

    public static class EmptyFieldException extends Exception {
        public EmptyFieldException(String message) {
            super(message);
        }
    }

    public static class MinLengthException extends Exception {
        public MinLengthException(String message) {
            super(message);
        }
    }

     public static class NegativeNumberException extends Exception {
        public NegativeNumberException(String message) {
            super(message);
        }
    }
}
