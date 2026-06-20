package _01_Spies_On_A_Train;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import _00_Intro_to_Linked_Lists.LinkedList;
import _00_Intro_to_Linked_Lists.Node;

public class SpiesOnATrain {

	/*
	 * A spy has made off with important intel from your intelligence agency! You
	 * know the spy is somewhere on this train(LinkedList). Your job is to find the
	 * suspect that matches the description given to you by the list of clues(the
	 * array).
	 * 
	 * Walk through the train, questioning each of the passengers about what they
	 * have seen and return the name of the most likely suspect.
	 * 
	 * The results are randomly generated each time so you should have a general
	 * case solution that carefully compares the clues to each passenger's
	 * testimony. Remember to use String methods to break up the passengers'
	 * statements.
	 */
	String findIntel(LinkedList<TrainCar> train, String[] clues) {
		String culprit = "";
		int checker = 0;
		HashMap<String, Integer> timesSuspected = new HashMap();
		Node<TrainCar> current = train.getHead();
		for (int i = 0; i < clues.length; i++) {
			//System.out.println(clues[i]);
		}

		while (current != null) {
			TrainCar car = current.getValue();
			//System.out.println(car.questionPassenger());
			for (int i = 0; i < clues.length; i++) {

				if (car.questionPassenger().contains(clues[i])) {

					String[] words = car.questionPassenger().split(" ");
					culprit = words[13];
					if (timesSuspected.containsKey(culprit)) {
						int times = timesSuspected.get(culprit);
						timesSuspected.put(culprit, times + 1);
					} else {
						timesSuspected.put(culprit, 1);
					}

				}
			}

			current = current.getNext();
		}
		for(Entry<String, Integer> a: timesSuspected.entrySet()) {
		if(a.getValue()==3) {
			culprit = a.getKey();
			break;
		}
		}
		
		return culprit;

	}

}
