package serge.servlet;

public class SaldoInsufficienteException extends Throwable {

        public SaldoInsufficienteException() {
            super();
        }

        public SaldoInsufficienteException(String message) {
            super(message);
        }

        public SaldoInsufficienteException(String message, Throwable cause) {
            super(message, cause);
        }

        public SaldoInsufficienteException(Throwable cause) {
            super(cause);
        }

        protected SaldoInsufficienteException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
}
