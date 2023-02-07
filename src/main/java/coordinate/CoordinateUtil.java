package coordinate;

public class CoordinateUtil {

	public int[] extractCoordinateVal(String test) {
		String temp = (String) test.subSequence(1, test.length()-1);
		String[] stringCoordinate = temp.split(",");
		int[] res = new int[stringCoordinate.length];
		for (int i=0; i<res.length; i++) {
			res[i] = Integer.parseInt(stringCoordinate[i]);
		}
		
		return res;
	}
}
