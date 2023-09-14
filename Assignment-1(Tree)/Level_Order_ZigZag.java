//Level Order ( Zigzag , Binary Tree)


/*
 
import java.util.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
	}
	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public void levelOrderZZ() {
			Queue<Node> nq =  new LinkedList<>();
			if(root==null) return ;
			nq.offer(root);
			int count = 0 ;
			while(!nq.isEmpty()){
				int n = nq.size();
				count++;
				List<Integer> lst =  new ArrayList<>();
				for(int i = 0 ; i<n ; i++){
					if(nq.peek().left!=null) nq.offer(nq.peek().left);
					if(nq.peek().right!=null) nq.offer(nq.peek().right);
					lst.add(nq.poll().data);
				}
				if(count%2==1){
					for(int i = 0 ; i<lst.size() ; i++) System.out.print(lst.get(i) + " ");
				}
				else{
					for(int i = lst.size()-1 ; i>=0  ;i--) System.out.print(lst.get(i) + " ");
				}
			}
		}
	}
}


 */