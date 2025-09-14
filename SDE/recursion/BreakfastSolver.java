 
 import java.util.*;

public class BreakfastSolver {
    static long[] solve(int N, int M, int[][] order) {
        // adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());

        // in-degree array
        int[] indegree = new int[N + 1];

        // build graph
        for (int i = 0; i < M; i++) {
            int u = order[i][0];
            int v = order[i][1];
            graph.get(u).add(v);
            indegree[v]++;
        }

        // min-heap for lexicographically smallest order
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) pq.add(i);
        }

        long[] result = new long[N];
        int idx = 0;

        while (!pq.isEmpty()) {
            int curr = pq.poll();
            result[idx++] = curr;

            for (int neighbor : graph.get(curr)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    pq.add(neighbor);
                }
            }
        }

        // if we placed all N items -> valid
        if (idx == N) {
            return result;
        } else {
            return new long[]{-1};
        }
    }

    // simple main to test
    public static void main(String[] args) {
        int N = 4, M = 4;
        int[][] order = {
            {1, 2},
            {4, 2},
            {1, 3},
            {2, 3}
        };
        long[] ans = solve(N, M, order);
        for (long x : ans) System.out.print(x + " ");
    }
}
