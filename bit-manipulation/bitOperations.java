import java.util.*;

class bitOperations {

    // get the bit in a number n at a given position p
    public static void getBit(int n, int p) {
        int bm = 1 << p; // define bit mask
        String result = ((bm & n) == 0) ? "0" : "1"; // AND OPERATION
        System.out.println(result);
    }

    public static void setBit(int n, int p) {
        int bm = 1 << p; // define bit mask
        System.out.println(n | bm); // OR OPERATION
    }

    public static void clearBit(int n, int p) {
        int bm = 1 << p; // define bit mask
        System.out.println(n & ~bm); // AND OPERATION WITH NOT(BITMASK)
    }

    public static void updateBit(int n, int p, int b) {
        int bm = 1 << p;
        if (b == 0)
            System.out.println(n & ~bm); // CLEAR BIT OPERATION
        else if (b == 1)
            System.out.println(n | bm); // SET BIT OPERATION
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter position: ");
        int p = sc.nextInt();
        System.out.print("Get Bit Output: ");
        getBit(n, p);
        System.out.print("Set Bit Output: ");
        setBit(n, p);
        System.out.print("Clear Bit Output: ");
        clearBit(n, p);
        System.out.print("Enter new bit for update: ");
        int b = sc.nextInt();
        System.out.print("Update Bit Output: ");
        updateBit(n, p, b);
    }
}