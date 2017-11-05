package ArrayString;

public class RotateString {
	public boolean isRotation(String s1, String s2){
		if(s1.length() == s2.length() && s1.length()>0){
			String str = s1+s1;
			SubString su = new SubString();
			return su.isSubstring(str, s2);
		}
		return false;
	}
	
	public static void main(String [] args){
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		RotateString ro = new RotateString();
		System.out.println(ro.isRotation(s1, s2));
	}
}
