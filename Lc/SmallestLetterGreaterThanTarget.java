public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'a', 'v', 'z'};
        char target = 'a';
        System.out.println(nextGreatestTarget(letters, target));   
    }

    static char nextGreatestTarget(char[] letters, char target){
        int start = 0; 
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
