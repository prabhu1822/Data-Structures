public class LevelOrderLW {

    public static void levelOrderLWReverse(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        
        Stack<String> st = new Stack<>();
        String res = "";

        while(queue.size() > 0 ){
            Node temp = queue.remove();
            if(temp != null){
            //System.out.print(temp.data+" ");
            res += temp.data + " ";

            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
            }else{

                st.push(res + "\n");
                res = "";

                if(queue.size() > 0){
                //    System.out.println();
                    queue.add(temp);
                }
            }   
        }
        while(st.size() > 0){
            res = st.pop();
            System.out.println(res);
        }
     }
    
}
