package ec.edu.epn.modelo.entidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TarjetaCredito {
    public static boolean validateCreditCard(String cardNumber, String expiryDate) {
        return isValidCardNumber(cardNumber) && isNotExpired(expiryDate);
    }

    private static boolean isValidCardNumber(String cardNumber) {
        // Algoritmo de Luhn para validar el número de tarjeta de crédito
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    private static boolean isNotExpired(String expiryDate) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
            LocalDate cardExpiryDate = LocalDate.parse("01/" + expiryDate, formatter);
            LocalDate currentDate = LocalDate.now();
            return cardExpiryDate.isAfter(currentDate.withDayOfMonth(1).minusDays(1));
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}
