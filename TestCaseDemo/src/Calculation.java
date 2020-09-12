
public class Calculation {

	public static int max(int[]a) {
		int m=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>m) {
				m=a[i];
			}
		}
		return m;
	}
	public static int cube(int n) {
		return n*n*n;
	}
	public static String reverse(String s) {
		StringBuilder sb=new StringBuilder(s);
		String res=sb.reverse().toString();
		return res;
	}
    public static String dublicate(String s) {
    	char[] c=s.toCharArray();
    	String st="";
    	for(int i=0;i<c.length;i++) {
    		for(int j=1;j<c.length;j++) {
    			if(c[i]==c[j]) {
    				st=c[i]+"";
    				return st;
    			}
    		}
    	}
		return st;
    }
}
