class TotalAverage {

    // 2. Static integer variables
    static int a;
    static int b;

    // 3. Static integer variable total
    static int total;

    // 4. Static double variable average
    static double average;

    // 5. Static method calculate()
    static void calculate() {
        // 6. Calculate total
        total = a + b;

        // 7. Calculate average
        average = total / 2.0;
    }

    // 8. main() method
    public static void main(String[] args) {

        // 9 & 10. Read and convert command-line arguments
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);

        // 11. Call static method
        calculate();

        // 12. Display results
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}
