package com.campusdual.classroom;

class DivisionByZeroException extends Exception{
    public DivisionByZeroException(String message) {
        super (message);
    }
}
public class Exercise {

    public static int divisionWithCustomException (int dividend, int divisor) throws DivisionByZeroException{
        if (divisor == 0) {
            throw new DivisionByZeroException("Bad division");
        }
        return dividend / divisor;

    }

    public static void main(String[] args) {
        try{
            int result = divisionWithCustomException(4, 2);
            System.out.println("Resultado: " + result);
        }catch (DivisionByZeroException e){
            System.out.println("Excepción: " + e.getMessage());
        }

    }
}
