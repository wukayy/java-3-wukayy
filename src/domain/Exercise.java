package domain;

/**
 * Клас для перевірки числа Армстронга.
 * Число Армстронга — це число, яке дорівнює сумі
 * своїх цифр, піднесених до степеня кількості цифр.
 */
public class Exercise {

    /**
     * Перевіряє, чи є число числом Армстронга.
     *
     * @param number число для перевірки
     * @return true, якщо число є числом Армстронга
     */
    public boolean Calculate(int number) {

        int originalNumber = number;
        int digitsCount = String.valueOf(number).length();

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitsCount);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
