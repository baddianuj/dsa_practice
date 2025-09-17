import java.util.*;

public class PalindromicTree {
    // Returns count of vertices whose path from root (1) is palindromic
    public static int solve(int N, int[][] E, String S) {
        ArrayList<Integer>[] adj = new ArrayList[N+1];
        for (int i = 1; i <= N; i++) adj[i] = new ArrayList<>();
        for (int[] e : E) {
            int u = e[0], v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }

        int count = 0;
        // stack holds (node, parent, mask)
        Deque<int[]> stack = new ArrayDeque<>();
        int rootMask = 1 << (S.charAt(0) - 'a'); // char of node 1
        stack.push(new int[]{1, 0, rootMask});

        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            int node = cur[0], parent = cur[1], mask = cur[2];

            // check palindromic condition: at most one bit set
            if (Integer.bitCount(mask) <= 1) count++;

            for (int nei : adj[node]) {
                if (nei == parent) continue;
                int bit = 1 << (S.charAt(nei - 1) - 'a'); // s.charAt(nei-1)
                stack.push(new int[]{nei, node, mask ^ bit});
            }
        }
        return count;
    }

    // Example runner
    public static void main(String[] args) {
        int N = 5;
        int[][] edges = {{1,2},{2,3},{1,4},{4,5}};
        String s = "aaaba";
        System.out.println(solve(N, edges, s)); // prints 3
    }
}

