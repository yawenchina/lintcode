/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
 
 
public class Solution {
    /**
     *@param inorder : A list of integers that inorder traversal of a tree
     *@param postorder : A list of integers that postorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] inorder, int[] postorder) {
      
	if(inorder.length != postorder.length){
		return null;
}
HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
int position = 0;
for(int  i : inorder){
	map.put(i, position++);
}
return helper(map, postorder, inorder.length-1 , 0 , inorder.length-1);
     }
	public TreeNode helper(HashMap<Integer, Integer> map , int[] postorder, int cur, int start, int end){
	if(start > end){
		return null;
}
TreeNode root = new TreeNode(postorder[cur]);
int mid = map.get(postorder[cur]);
	if(start < mid){
		root.left = helper(map, postorder, cur-1-end+mid ,start, mid-1);
}
if(mid < end){
	root.right = helper(map, postorder, cur-1, mid+1,end);
}
	return root;




    }
}
