package mapssss;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

	public static void main(String[] args) {

		String str = "sairamjakkam";

		char[] letters = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char names : letters) {

			if (map.containsKey(names)) {
				map.put(names, map.get(names) + 1);
			} else {

				map.put(names, 1);

			}
		}

		System.out.println(map);
	}

}
