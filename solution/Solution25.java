import java.util.Arrays;

// 입력값 : 이진트리를 표현한 리스트 nodes
// 해당 이진 트리에 대하여 전위순회, 중위순회, 후위순회 결과를 반환하는 solution()함수를 구현하시오
public class Solution25 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(solution(input)));
    }

    public static String[] solution(int[] nodes) {
        String[] result = new String[3];
        result[0] = preorder(nodes, 0).trim();
        result[1] = inorder(nodes, 0).trim();
        result[2] = postorder(nodes, 0).trim();

        return result;
    }

    private static String preorder(int[] nodes, int idx) {
        if(idx >= nodes.length) {
            return "";
        }

        // 루트 노드 -> 왼쪽 서브 트리 -> 오른쪽 서브 트리 순으로 재귀 호출하여 결과를 이어붙임
        return nodes[idx] + " " +
                preorder(nodes, 2 * idx + 1) +
                preorder(nodes, 2 * idx + 2);
    }

    private static String inorder(int[] nodes, int idx) {
        if (idx >= nodes.length) { // idx가 범위를 벗어나면 빈 문자열 반환
            return "";
        }

        // 왼쪽 서브 트리 -> 루트 노드 -> 오른쪽 서브 트리 순으로 재귀 호출하여 결과를 이어붙임
        return inorder(nodes, 2 * idx + 1) +
                nodes[idx] + " " +
                inorder(nodes, 2 * idx + 2);
    }

    private static String postorder(int[] nodes, int idx) {
        if (idx >= nodes.length) { // idx가 범위를 벗어나면 빈 문자열 반환
            return "";
        }

        // 왼쪽 서브 트리 -> 오른쪽 서브 트리 -> 루트 노드 순으로 재귀 호출하여 결과를 이어붙임
        return postorder(nodes, 2 * idx + 1) +
                postorder(nodes, 2 * idx + 2) +
                nodes[idx] + " ";
    }
}
