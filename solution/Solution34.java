import java.util.ArrayList;
import java.util.Arrays;

/*
깊이 우선 탐색으로 모든 그래프의 노드를 순회하는 함수 solution()을 작성하시오.
시작노드는 start
graph는 [출발노드, 도착노드] 쌍들이 들어 있는 리스트.
반환값은 그래프의 시작노드부터 모든 노드를 깊이 우선 탐색으로 진행한 순서대로 노드가 저장된 리스트.
*/

public class Solution34 {
    public static void main(String[] args) {
        int[][] graph1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        System.out.println(Arrays.toString(solution(graph1, 1, 5)));

        int[][] graph2 = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {5, 6}};
        System.out.println(Arrays.toString(solution(graph2, 1, 6)));
    }

    // 인접 리스트 저장할 ArrayList 배열
    private static ArrayList<Integer>[] adjList;

    // 방문 여부를 저장할 boolean 배열
    private static boolean[] visited;
    private static ArrayList<Integer> answer;

    public static int[] solution(int[][] graph, int start, int n) {
        // ❶ 인접 리스트 초기화
        adjList = new ArrayList[n + 1];

        for(int i=0; i<adjList.length; i++) {
            adjList[i] = new ArrayList<>();
        }

        // ❷ 그래프를 인접 리스트로 변환
        for(int[] edge : graph) {
            adjList[edge[0]].add(edge[1]);
        }

        // DFS를 순회한 결과를 반환
        visited = new boolean[n + 1];
        answer = new ArrayList<>();
        dfs(start); // ❼ 시작 노드에서 깊이 우선 탐색 시작

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    // ❸ DFS 탐색 메소드
    private static void dfs(int now) {
        visited[now] = true; // ❹ 현재 노드를 방문했음을 저장
        answer.add(now); // ❺ 현재 노드를 결과 리스트에 추가

        // ❻ 현재 노드와 인접한 노드 순회
        for(int next : adjList[now]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}
