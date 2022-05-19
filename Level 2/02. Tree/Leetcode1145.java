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
    int xkaleft;
    int xkaright;
    
    public int size(TreeNode Node,int x){
        if(Node == null ) return 0;
        
        int ls = size(Node.left,x);
        int rs = size(Node.right,x);
        
        if(Node.val == x){
            xkaleft = ls;
            xkaright = rs;
        }
        int ts=ls+rs+1;
        return ts;
    }
    
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) { 
    
        size(root,x);
        int otherSide = n-(xkaleft + xkaright + 1);
        int maxOfThree = Math.max(otherSide,Math.max(xkaleft,xkaright));
        
        int rest = n-maxOfThree;
        
        if(maxOfThree > rest){
            return true;
        }else{
            return false;
        }     
    }
}