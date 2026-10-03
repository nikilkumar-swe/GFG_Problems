/* Structure of Binary Tree Node
class Node {
	int data;
	Node left, right;
	
	Node(int val) {
		this.data = val;
		this.left = this.right = null;
	}
} */

class Solution {
	
	public static void dfs(Node node, int level, List<Integer> ans) {
		
		if (node == null)
			return;
		
		if (level == ans.size()) {
			ans.add(node.data);
		}
		
		dfs(node.left, level + 1, ans);
		dfs(node.right, level + 1, ans);
	}
	
	public ArrayList<Integer> leftView(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		dfs(root, 0, ans);
		return ans;
		
	}
}
