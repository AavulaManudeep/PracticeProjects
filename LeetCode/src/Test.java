import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.regex.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 */

/**
 * @author manu
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Set<String> set = new HashSet<String>();
		String[] stringarray = { "kjsdgakjgoaerhfjdjgh","afei","akegfakw","iewuariuwe"};
		
		
		System.out.println(stringarray[1]+stringarray[2]);
		set.add(stringarray[1]);
		set.add(stringarray[2]);
		int length1= stringarray[1].length();
		int length2= stringarray[2].length();
		int totallen = length1+length2;
		
		Set<Character> set2 = new HashSet<Character>();
		//Predicate<String> match = stringarray;
		//System.out.println(match.test("hello"));
		List<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList(stringarray));
		list.sort(getComparator);
		
		System.out.println(list);
		
		System.out.println(list.get(1).matches(list.get(2)));
		
		/*
		 * IntStream intStream = stringarray[1].chars();
		 * 
		 * Stream<String> streamOfString =
		 * Pattern.compile(", ").splitAsStream((CharSequence) intStream);
		 * System.out.println(streamOfString.anyMatch(null));
		 */
		
		System.out.println(Pattern.matches("[sagl]?","saglhj"));
	}

	public static Comparator<String> getComparator = new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o1.length() - o2.length();
		}
	};
		
	
	
}
