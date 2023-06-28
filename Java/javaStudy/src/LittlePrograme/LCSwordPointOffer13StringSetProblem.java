package LittlePrograme;

import java.util.*;

public class LCSwordPointOffer13StringSetProblem {


        public String[] permutation(String s) {
            Set<String> ansSet = new TreeSet<>();
            for (int i = 0; i <100+s.length()*s.length(); i++) {
                char[] chars = s.toCharArray();
                List<Character> characterList =new ArrayList<>();

                for (char c :
                        chars) {
                    characterList.add(c);
                }
                Collections.shuffle(characterList);
                String strings ="";
                for (char c:
                        characterList) {
                    strings +=c;
                }
                ansSet.add(strings);
            }
            String[] ansStrings = ansSet.toArray(new String[0]);


            return ansStrings;
        }
}
