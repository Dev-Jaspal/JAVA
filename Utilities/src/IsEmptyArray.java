
public class IsEmptyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] arr = {1,2,3};
		System.out.println(isArrayEmpty(arr));
	}

	public static boolean isArrayEmpty(Object[] arr) {
		if (arr == null) {
			return true;
		} else if (arr.length == 0) {
			return true;
		} else {
			for (var item : arr) {
				if (item != null) {
					return false;
				}
			}
			return true;
		}
	}
}
