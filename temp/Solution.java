import java.util.*;

public class Solution {
    
    public static int calculateMinimumSwaps(List<Integer> fileSize, List<Integer> affinity) {
        int n = fileSize.size();
        Map<Integer, Integer> bad = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (fileSize.get(i).equals(affinity.get(i))) {
                int v = fileSize.get(i);
                bad.put(v, bad.getOrDefault(v, 0) + 1);
            }
        }
        if (bad.isEmpty()) return 0;
        
        Map<Integer, Integer> fs = new HashMap<>();
        Map<Integer, Integer> af = new HashMap<>();
        for (int x : fileSize) fs.put(x, fs.getOrDefault(x, 0) + 1);
        for (int x : affinity) af.put(x, af.getOrDefault(x, 0) + 1);
        
        for (int b : bad.keySet()) {
            int f = fs.getOrDefault(b, 0);
            int a = af.getOrDefault(b, 0);
            int both = bad.get(b);
            int affected = f + a - both;
            if (affected == n) return -1;
        }
        
        int k = 0;
        int c_max = 0;
        for (int c : bad.values()) {
            k += c;
            c_max = Math.max(c_max, c);
        }
        
        else return (k + 1) / 2;
    }
    
    public static void main(String[] args) {
        System.out.println("=== File-Affinity Swap Calculator ===\n");
        
        // Test Case 1: Your main example
        List<Integer> fileSize1 = Arrays.asList(1, 2, 3, 2, 3);
        List<Integer> affinity1 = Arrays.asList(1, 2, 3, 2, 3);
        System.out.println("Test 1 - All matching pairs:");
        System.out.println("Files:    " + fileSize1);
        System.out.println("Affinity: " + affinity1);
        System.out.println("Result: " + calculateMinimumSwaps(fileSize1, affinity1) + " swaps needed\n");
        
        // Test Case 2: Impossible case
        List<Integer> fileSize2 = Arrays.asList(2,2,2,1,1);
        List<Integer> affinity2 = Arrays.asList(1,1,1,1,2);
        System.out.println("Test 2 - Impossible case:");
        System.out.println("Files:    " + fileSize2);
        System.out.println("Affinity: " + affinity2);
        System.out.println("Result: " + calculateMinimumSwaps(fileSize2, affinity2) + " (impossible)\n");
        
        
    }
}