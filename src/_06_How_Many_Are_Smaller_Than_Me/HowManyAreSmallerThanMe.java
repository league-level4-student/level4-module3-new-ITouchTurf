package _06_How_Many_Are_Smaller_Than_Me;

import _00_Intro_to_Linked_Lists.Node;
import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

	/*
	 * Given an AVLTree filled with the random numbers from 1 to 20, and a single
	 * number within the AVL Tree, figure out how many numbers in the AVLTree are
	 * smaller than the provided number and return the result.
	 * 
	 * You may want to create a helper method to search through the AVLTree and
	 * count iteratively or recursively.
	 */
	AVLNode<Integer> numbers;
	int num;
	public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
		int times = 0;
		num = me;
		numbers = new AVLNode<Integer>(me);
		numbers = avlTree.getRoot();
		AVLNode<Integer> value = avlTree.getRoot();
		//
		//		for (int i = 0; i < numbers.getHeight(); i++) {
		//			
		//
		//			}
		//			if (numbers.getLeft() != null) {
		//				if ((Integer) numbers.getLeft().getValue() < me) {
		//					times++;
		//				}
		//			}
		return sumLessThanX(avlTree.getRoot(), me);

	}
	
	public int sumLessThanX(AVLNode<Integer> current, int max) {
		if(current == null) {
			return 0;
		}
		AVLNode<Integer> left = current.getLeft();
		AVLNode<Integer> right = current.getRight();
		
		//if(current.getValue() < max) {
			return sumLessThanX(right, max) + (current.getValue() < max? 1 : 0) + sumLessThanX(left, max);
		//}
	
	}
	
	
	//	
	AVLNode<Integer> leftNode = numbers;
	AVLNode<Integer> rightNode = numbers;
//	public int checker() {
//		int total = 0;
//
//		if(rightNode.getRight() != null) {
//			rightNode = rightNode.getRight();
//			if ((Integer) numbers.getRight().getValue() < num) {
//				total++;
//			}
//		}
//		
//		if(rightNode.getLeft() != null) {
//			leftNode = leftNode.getLeft();
//			if((Integer) numbers.getLeft().getValue() <num) {
//				total++;
//			}
//		}
//		if(numbers.getRight() == null && numbers.getLeft() == null) {
//			return total;
//		}
//		numbers = numbers.getRight();
//				return checker();
//	}
}
