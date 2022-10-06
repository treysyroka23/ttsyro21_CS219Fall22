package HW5;

public class canSpell {

    //checks if a word can be spelt from string of letters
    public static boolean canSpell(String word, String tiles) {
        // lets you run through each letter of the tiles string, then moves to the next
        for(int i = 0; i < tiles.length(); i++) {
            // checks if the letter at position i in the string tiles is in the string word
            //if it isn't or appears more times in tiles than word it returns false
            if(word.indexOf(tiles.charAt(i)) == -1) {
                return false;
            } else {
                // saves the amount (i) letters within the tiles string to the index of word
                int char_location = word.indexOf(tiles.charAt(i));
                // redefine word to the lengths of the substrings of itself
                word = word.substring(0, char_location) + word.substring(char_location + 1);
            }
        }

        return true;
    }




        public static void main (String[]args) {
            System.out.println(canSpell("axobastro", "boot"));
            System.out.println(!canSpell("haxobapsrito", "hippo"));
            System.out.println(canSpell("zooleta", "taz"));

        }
    }

