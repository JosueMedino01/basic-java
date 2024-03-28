package enums;

public enum AbstractMethods {
    SUM('+') {
        @Override
        public double calc(double a, double b) {
            return a + b;
        }
    }, SUBTRACTION('-') {
        @Override
        public double calc(double a, double b) {
            return a - b;
        }
    }, 
    MULTIPLICATION('*') {
        @Override
        public double calc(double a, double b) {
          return a * b;
        }
    }, 
    DIVISION('/') {
        @Override
        public double calc(double a, double b) {
            return b / a;
        }
    };

    private char operator;

    AbstractMethods(char operator){
        this.operator = operator;
    }

    public abstract double calc(double a, double b);

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }
}