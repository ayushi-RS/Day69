class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
    	int i,j,l,m;
    	for (i=len;i>=0;i--) {											// length of substring each time = i
    		for (j=0;j<len-i;j++) {										// start of each substring of length i = j
    			l=j;													// start and end of the substrings is stored in l,m
    			m=j+i;
				while (s.charAt(l)==s.charAt(m)) {
					l++;
					m--;
					if (l>=m) {											// As it moved from longest to shortest, The first substing that becomes a palindrom  is the longest
						return (String)s.subSequence(j, j+i+1);			
					}
				}
    		}
    	}
    	return ""+s.charAt(0);											// just in case :)
    }
}