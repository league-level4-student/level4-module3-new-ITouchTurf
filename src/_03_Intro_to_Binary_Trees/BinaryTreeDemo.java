package _03_Intro_to_Binary_Trees;

public class BinaryTreeDemo {

    /*
	 * A Binary Tree is a data structure that makes use of nodes and references like
	 * a LinkedList, but instead of the nodes pointing to a previous node or next
	 * node in an unorderd list they each points to two child nodes that are below
	 * them in the hierarchy.
	 * 
	 * Some important properties of BinaryTree are:
	 * 
	 * -The left node is always a smaller value than its parent and the right node
	 * is always a larger value. This is a property you have seen in some form
	 * already via Binary Search.
	 * 
	 * -Empty nodes are null references.
	 * 
	 * -The parent node at the very top of the tree is called the root.
	 * 
	 * 1. Read through the BinaryTree and Node classes.
	 * 
	 * 2. Create a BinaryTree of any type you like.
	 * 
	 * 3. Try using some BinaryTree methods to insert, search for, delete and print
	 * elements.
	 * 
	 * 4. Save the root into a Node Object and use references to traverse through
	 * the BinaryTree and perform an operation on every element(You may choose to do
	 * this recursively or iteratively). Then print it out to see if it worked.
	 * 
	 */

	public static void main(String[] args) {
		BinaryTree<Integer> integers = new BinaryTree<Integer>();
		integers.insert(143);
		integers.insert(-27);
		integers.insert(89);
		integers.insert(214);
		integers.insert(-95);
		integers.insert(37);
		integers.insert(168);
		integers.insert(2);
		integers.insert(-61);
		integers.insert(245);
		integers.insert(121);
		integers.insert(54);
		integers.insert(-13);
		integers.insert(197);
		integers.insert(80);
		integers.insert(-44);
		integers.insert(231);
		integers.insert(16);
		integers.insert(109);
		integers.insert(-82);
		integers.insert(66);
		integers.insert(174);
		integers.insert(-7);
		integers.insert(152);
		integers.insert(98);
		integers.insert(-56);
		integers.insert(220);
		integers.insert(31);
		integers.insert(186);
		integers.insert(-99);
		integers.insert(72);
		integers.insert(141);
		integers.insert(5);
		integers.insert(249);
		integers.insert(-35);
		integers.insert(118);
		integers.insert(201);
		integers.insert(47);
		integers.insert(-18);
		integers.insert(158);
		integers.insert(94);
		integers.insert(-70);
		integers.insert(233);
		integers.insert(12);
		integers.insert(177);
		integers.insert(60);
		integers.insert(-50);
		integers.insert(132);
		integers.insert(224);
		integers.insert(25);
		integers.insert(103);
		integers.insert(-87);
		integers.insert(192);
		integers.insert(39);
		integers.insert(165);
		integers.insert(-3);
		integers.insert(83);
		integers.insert(146);
		integers.insert(9);
		integers.insert(240);
		integers.insert(-65);
		integers.insert(126);
		integers.insert(57);
		integers.insert(209);
		integers.insert(-21);
		integers.insert(171);
		integers.insert(75);
		integers.insert(-91);
		integers.insert(134);
		integers.insert(44);
		integers.insert(216);
		integers.insert(-40);
		integers.insert(101);
		integers.insert(183);
		integers.insert(19);
		integers.insert(154);
		integers.insert(-11);
		integers.insert(68);
		integers.insert(227);
		integers.insert(-76);
		integers.insert(112);
		integers.insert(35);
		integers.insert(199);
		integers.insert(-29);
		integers.insert(147);
		integers.insert(87);
		integers.insert(6);
		integers.insert(236);
		integers.insert(-58);
		integers.insert(123);
		integers.insert(52);
		integers.insert(180);
		integers.insert(-1);
		integers.insert(96);
		integers.insert(161);
		integers.insert(28);
		integers.insert(211);
		integers.insert(-84);
		integers.insert(139);
		integers.insert(63);
		integers.insert(243);
		integers.insert(-47);
		integers.insert(176);

		Node<Integer> ints = integers.getRoot();

		getSize(ints);

	}

	public static void getSize(Node root) {
		System.out.println(root.getValue());
		
		if (root.getLeft() != null) {
			getSize(root.getLeft());
		}

		if (root.getRight() != null) {
			getSize(root.getRight());

		}
	}

}
