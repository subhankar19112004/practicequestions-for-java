public class CellingforString {
    public static void main(String[] args) {
        char letters[] = {'c', 'd', 'f', 'j'};
        int target = 'j';
        int ans = nextGreatestLetter(letters, (char) target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {
        char start = 0;
        char end = (char) (letters.length - 1);
        while (start <= end) {
            //find the mid element
         char mid = (char) (start + (end - start) / 2);
        }
        char mid = 0;
        if (target < letters[mid]) {
            end = (char) (mid - 1);
        } else {
            start = (char) (mid + 1);
        }
        return letters[start%letters.length];
    }
}


