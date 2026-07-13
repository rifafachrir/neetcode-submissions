class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        boolean answer = Arrays.equals(charS, charT);
        System.out.println(answer);
        return answer;

    }

}
