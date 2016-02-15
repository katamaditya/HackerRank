package Algorithms.Implementation;

import java.util.Scanner;
import java.util.TreeSet;

/*Some useful test cases at the end*/

public class TheGridSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numTestCases = sc.nextInt();
		int R, C, r, c;
		for (int i = 0; i < numTestCases; i++) {
			R = sc.nextInt();
			C = sc.nextInt();
			String[] grid = new String[R];
			for (int j = 0; j < R; j++) {
				grid[j] = sc.next();
			}
			r = sc.nextInt();
			c = sc.nextInt();
			String[] pattern = new String[r];
			for (int j = 0; j < r; j++) {
				pattern[j] = sc.next();
			}
			boolean flag = false;
			int confirm = 0, patternIndex = 0;
			TreeSet<Integer> indexSet = new TreeSet<Integer>();
			TreeSet<Integer> subIndexSet = new TreeSet<Integer>();
			for (int j = 0; j < R; j++) {
				if (flag && !grid[j].contains(pattern[patternIndex])) {
					flag = false;
					patternIndex = 0;
				}
				if (grid[j].contains(pattern[patternIndex])) {
					flag = true;
					boolean indexFlag = false;
					if (patternIndex == 0) {
						int partitionIndex = 0, subIndex;
						for (int w = 0; w < grid[j].length(); w++) {
							subIndex = grid[j].indexOf(pattern[patternIndex], partitionIndex);
							if (subIndex != -1)
								indexSet.add(subIndex);
							partitionIndex++;
						}
					} else {
						int partitionIndex = 0, subIndex;
						for (int w = 0; w < grid[j].length(); w++) {
							subIndex = grid[j].indexOf(pattern[patternIndex], partitionIndex);
							if (subIndex != -1)
								subIndexSet.add(subIndex);
							partitionIndex++;
						}
						for (Integer integer : subIndexSet) {
							if (indexSet.contains(integer)) {
								indexFlag = true;
							}
						}
						subIndexSet.clear();
						if (!indexFlag) {
							flag = false;
							patternIndex = 0;
							continue;
						}
					}
					if ((pattern.length - 1 == patternIndex) && indexFlag) {
						confirm = 1;
						break;
					}
					patternIndex++;
				}
			}
			if (confirm == 1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}

/*Some useful test cases
1
4 4
1234
4321
9999
9999
2 2
12
21
NO
1
4 6
123412
561212
123634
781288
2 2
12
34
YES
1
4 6
123456
567890
234567
194729
4 4
1234
5678
2345
4729
NO
1
5 15
111111111111111
111111111111111
111111011111111
111111111111111
111111111111111
3 5
11111
11111
11110
YES
1
2 6
999999
121211
2 2
99
11
YES*/
