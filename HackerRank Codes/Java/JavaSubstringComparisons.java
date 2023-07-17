public static String getSmallestAndLargest(String s, int k) {
    java.util.SortedSet<String> set = new java.util.TreeSet<String>();
    for(int i = 0; i <= s.length() - k; i++){
        set.add(s.substring(i, i + k));
    }
    
    return set.first() + "\n" + set.last();
}