/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        List<Integer> retVal = new ArrayList<>();
        
      if(root == null ) return 0;
      
      Queue<TreeNode> queue  = new LinkedList<>();
      queue.add(root);
        int result = 0;
      
      while(queue.size() > 0 ){
          int lsize = queue.size();
          
          for(int i=0 ; i < lsize ; i++){
              TreeNode temp = queue.remove();
              
              if(i == 0) retVal.add(temp.val);
              
              if(temp.left != null ) queue.add(temp.left);
              if(temp.right != null ) queue.add(temp.right);
              
          }
      }
      //return result;
       return retVal.get(retVal.size()-1); 
    }
}