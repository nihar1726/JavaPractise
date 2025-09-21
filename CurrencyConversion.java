public class CurrencyConversion {
    public static void main(String[] args) {
        double usdAmount = 100.0; // Amount in USD
        double conversionRateUsdEur = 0.85; // Example conversion rate from USD to EUR

        // Convert USD to EUR
        double eurAmount = usdAmount * conversionRateUsdEur;
        System.out.println(usdAmount + " USD is equal to " + eurAmount + " EUR");

        double expenditureInEur = 50.0; // Expenditure in EUR
        // Deduct expenditure from EUR amount
        eurAmount -= expenditureInEur;
        System.out.println("After spending " + expenditureInEur + " EUR, remaining amount is: " + eurAmount + " EUR");

        // Convert EUR back to USD
        double convertedBackToUsd = eurAmount / conversionRateUsdEur;
        System.out.println(eurAmount + " EUR is equal to " + convertedBackToUsd + " USD");

        // Now, let's Convert USD to INR
        double conversionRateUsdInr = 88.10; // Example conversion rate from USD to INR
        double inrAmount = usdAmount * conversionRateUsdInr;
        System.out.println(usdAmount + " USD is equal to " + inrAmount + " INR");
    }
}
