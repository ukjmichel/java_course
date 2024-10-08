package course;

public class Variables {
    public static void main(String[] args) {

        System.out.println("");

        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        System.out.println("type Int");
        System.out.println("Size 32 bits (4 bytes)");
        System.out.println("The maximum value for a Int = " + maxInt);
        System.out.println("The minimum value for a Int = " + minInt);
        System.out.println("Usage: This is the most common integer type used for general-purpose calculations.");
        System.out.println("");

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        System.out.println("type Byte");
        System.out.println("Size 8 bits");
        System.out.println("The maximum value of a byte = " + maxByteValue);
        System.out.println("The minimum value of a byte = " + minByteValue);
        System.out.println("Usage: Used for saving memory in large arrays and can represent small numbers.");
        System.out.println("");

        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;

        System.out.println("type Short");
        System.out.println("Size 2 bits");
        System.out.println("The maximum value of a short = " + maxShortValue);
        System.out.println("The minimum value of a short = " + minShortValue);
        System.out.println(
                "Usage: Useful when you want to save memory in large arrays of integers, where the memory savings actually matters.");
        System.out.println("");

        long maxLongValue = Long.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;

        System.out.println("type Long");
        System.out.println("Size 8 bits");
        System.out.println("The maximum value of a long = " + maxLongValue);
        System.out.println("The minimum value of a long = " + minLongValue);
        System.out.println(
                "Usage: Used when a wider range than int is needed, such as for large counts or calculations.");
        System.out.println("");

        float maxFloatValue = Float.MAX_VALUE;
        float minFloatValue = Float.MIN_VALUE;

        System.out.println("type Float");
        System.out.println("Size 32 bits (4 bits)");
        System.out.println("Precision: 7 decimal digits");
        System.out.println("The maximum value of a long = " + maxFloatValue);
        System.out.println("The minimum value of a long = " + minFloatValue);
        System.out.println(
                "Used when less precision is acceptable, and memory savings are important.");
        System.out.println("");

        double maxDoubleValue = Double.MAX_VALUE;
        double minDoubleValue = Double.MIN_VALUE;

        System.out.println("type Double");
        System.out.println("Size 64 bits (8 bits)");
        System.out.println("Precision: 15 decimal digits");
        System.out.println("The maximum value of a long = " + maxDoubleValue);
        System.out.println("The minimum value of a long = " + minDoubleValue);
        System.out.println(
                "Usage: Most common for floating-point arithmetic due to its higher precision. This is the default type for floating-point numbers in Java.");
        System.out.println("");

    }

}
