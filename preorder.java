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
     *@param preorder : A list of integers that preorder traversal of a tree
     *@param inorder : A list of integers that inorder traversal of a tree
     *@return : Root of a tree
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer>  map  = new HashMap<Integer, Integer>();
        int position = 0;
        for(int i : inorder){
		    map.put(i, position++);
        }
        return traHelper(map, preorder,0,0 , preorder.length-1);
    }
    public static TreeNode traHelper(HashMap<Integer, Integer> map, int[] preorder,int cur, int start, int end){
	if(start >  end){
		return null;
    }
    int mid = map.get(preorder[cur]);
	TreeNode root = new TreeNode(preorder[cur]);
	if(start < mid)
	root.left = traHelper(map, preorder,cur+1, start, mid-1);
	if(mid < end)
	root.right = traHelper(map,preorder,cur+1+mid-start ,mid+1, end);
	return root;
}

}
