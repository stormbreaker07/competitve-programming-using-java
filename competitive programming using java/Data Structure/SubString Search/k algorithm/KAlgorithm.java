public class KAlgorithm {

    public String pattern;
    public String text;
    public int[] z;
    public String str;

    public KAlgorithm(String pattern , String text) {
        this.pattern = pattern;
        this.text = text;
        this.str = pattern + text;
        z = new int[str.length()];
    }

    public void createZArray() {

        int i=0,l=0,r=0;
        int n = str.length();

        for(i=1;i<n;i++) {

            if(i>r) {
                r = i;
                l = i;

                while(r<n && str.charAt(r-l) == str.charAt(r)) {
                    r++;
                }
                z[i] = r-l;
                r--;
            }
            else {

                int k = i - l;

                if(z[k] < r-l+1) {
                    z[i] = z[k];    
                }
                else {
                    l = i;
                    while(r<n && str.charAt(r-l) == str.charAt(r)) {
                        r++;
                    }
                    z[i] = r-l;
                    r--;
                }
            }
        }
    }



    public int findIndex() {

        for(int i=1;i<str.length();i++) {
            if(z[i] >= pattern.length()) {
                return i-pattern.length();
            }
        }
        return -1;
    }
}


