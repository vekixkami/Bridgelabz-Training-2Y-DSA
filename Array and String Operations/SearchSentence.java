public class SearchSentence {
    static String find(String[] arr, String word) {
        for(String s : arr) {
            if(s.contains(word)) return s;
        }
        return "Not Found";
    }
}
