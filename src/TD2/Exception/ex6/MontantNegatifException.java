package TD2.Exception.ex6;

// Exception pour montants négatifs
class MontantNegatifException extends Exception {
    public MontantNegatifException(String message) {
        super(message);
    }
}
