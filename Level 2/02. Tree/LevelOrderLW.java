public class LevelOrderLW {

    public static void levelOrderLW(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        
        while(queue.size() > 0 ){
            Node temp = queue.remove();
            if(temp != null){
            System.out.print(temp.data+" ");
            
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
            }else{
                if(queue.size() > 0){
                    System.out.println();
                    queue.add(temp);
                }
            }
            
        }
      }
    
}
