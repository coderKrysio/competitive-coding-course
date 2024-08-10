package Course_Topics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Joseph_Problem {
	public static void main(String[] args) {
		int winner = joseph(5, 3);
		System.out.println(winner);
	}
	
	public static int joseph(int noOfPeople, int remPosition) {
		int tempPos = remPosition - 1;
		int[] people = new 
				int[noOfPeople];
		for (int i = 0; i < noOfPeople; i++) {
			people[i] = i + 1;
		}
		int iteration = noOfPeople - 1;
		List<Integer> list = IntStream.of(people).boxed().collect(Collectors.toList());
		while (iteration > 0) {
			list.remove(tempPos);
			tempPos += 
					remPosition - 1;
			if (tempPos > 
			list.size() - 1) {
				tempPos = tempPos % list.size();
			}
			iteration--;
		}
		return list.get(0);
	}
}