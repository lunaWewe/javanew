package tw.luna.pretty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class pokerV4 {

	public static void main(String[] args) {
		ArrayList<Integer> poker = new ArrayList<Integer>();
		for (int i = 0; i < 52; i++) {
			poker.add(i);
		}
		
		Collections.shuffle(poker);

		for (Integer card : poker) {
			System.out.println(card);
		}
	}

}
