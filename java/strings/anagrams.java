static boolean isAnagram(String a, String b) {
    // Complete the function by writing your code here.
    a = a.toLowerCase();
    b = b.toLowerCase();
    if (a.length() != b.length())
        return false;
    else {
        char[] aAsChar = a.toCharArray();
        char[] bAsChar = b.toCharArray();
        Arrays.sort(aAsChar);
        Arrays.sort(bAsChar);
        if (Arrays.equals(aAsChar, bAsChar))
            return true;
        else
            return false;
        }
    }
