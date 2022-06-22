import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("Should concantenate two strings")
    void concat() {
        assertEquals("papa",StringUtils.concat("pa","pa"));
    }

    @Test
    @DisplayName("Should prefixe one this the second strings")
    void isPrefixe() {
        assertEquals(true,StringUtils.isPrefix("papa","pa"));
        assertEquals(true,StringUtils.isPrefix("Papa","pa"));
        assertEquals(false,StringUtils.isPrefix("papa","maman"));
        assertEquals(true,StringUtils.isPrefix("pa","papa"));
        assertEquals(true,StringUtils.isPrefix("papa","Pa"));
        assertEquals(true,StringUtils.isPrefix("papa","Pa"));
    }

    @Test
    @DisplayName("Should show the reverse string")
    void reverseInt() {    // -03  -3;  -30 -3   300- 3  17-71  -128 -821
        assertEquals(-3, StringUtils.reverseInt(-03));
        assertEquals(-3, StringUtils.reverseInt(-30));
        assertEquals(3, StringUtils.reverseInt(300));
        assertEquals(71, StringUtils.reverseInt(17));
        assertEquals(-821, StringUtils.reverseInt(-128));

    }
    @Test
    @DisplayName("should display true or false whether string is palindrome")
    void isPalindrom() {
        assertEquals(true,StringUtils.isPalindrom("tacocat"));
        assertEquals(false,StringUtils.isPalindrom("cat"));
        assertEquals(true,StringUtils.isPalindrom("tACocat"));
        assertEquals(true,StringUtils.isPalindrom("tACo cat"));

    }
    @Test
    @DisplayName("should return the position after directions haut,bas,gauche,droite")
    void direction() {
        assertEquals(Arrays.toString(new int[]{-1,2}),Arrays.toString(StringUtils.direction(new String[]{"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"})));
        assertEquals(Arrays.toString(new int[]{0,-3}),Arrays.toString(StringUtils.direction(new String[]{"bas","bas","bas"})));
        assertEquals(Arrays.toString(new int[]{-1,-3}),Arrays.toString(StringUtils.direction(new String[]{"bas","bas","ba"})));
    }
    @Test
    @DisplayName("Should verify if Anagram")
    void isAnagram(){
        assertEquals(true,StringUtils.isAnagram("chariot","haricot"));
        assertEquals(false,StringUtils.isAnagram("chien","camion"));
        assertEquals(true,StringUtils.isAnagram("chAriot","haricot"));
        assertEquals(true,StringUtils.isAnagram("chariot","haRicot"));
        assertEquals(true,StringUtils.isAnagram("chariot","HARICOT"));
        assertEquals(true,StringUtils.isAnagram("CHARIOT","HARICOT"));
        assertEquals(true,StringUtils.isAnagram("chariot","hari cot"));
        assertEquals(true,StringUtils.isAnagram("  chariot","haricot"));

    }

    @Test
    @DisplayName("Should put every first letter in capital")
    void capitalze(){
        assertEquals("Hello World",StringUtils.capitalze("hello world"));
        assertEquals("Hello World",StringUtils.capitalze("hello WORld"));
        assertEquals("Hello World",StringUtils.capitalze("HELLO WORLD"));
        assertEquals("Hello World",StringUtils.capitalze("   hello world"));
        assertEquals("Hello World",StringUtils.capitalze("hello  world"));
        assertEquals("Hello World",StringUtils.capitalze("hello      world"));
    }
    @Test
    @DisplayName("should alternate with letters capital ")
    void alternate(){
        assertEquals(Arrays.toString(new char[]{'a', 'B', 'c', 'D', 'e'}), Arrays.toString(StringUtils.alternate(new char[]{'a', 'b', 'c', 'd', 'e'})));
        assertEquals(Arrays.toString(new char[]{'a', 'B', 'c', 'D', 'e'}), Arrays.toString(StringUtils.alternate(new char[]{'A', 'B', 'C', 'D', 'E'})));
        assertEquals(Arrays.toString(new char[]{' ', 'B', 'c', 'D', 'e'}), Arrays.toString(StringUtils.alternate(new char[]{' ', 'B', 'C', 'D', 'E'})));
        assertEquals(Arrays.toString(new char[]{' ', ' ', ' ', ' ', ' '}), Arrays.toString(StringUtils.alternate(new char[]{' ', ' ', ' ', ' ', ' '})));
    }
    @Test
    @DisplayName("should return a reverse string")
    void reverseString(){
        assertEquals("apap", StringUtils.reverseString("papa"));
        assertEquals("APAP", StringUtils.reverseString("PAPA"));
        assertEquals("lielos", StringUtils.reverseString("soleil"));
        assertEquals("lielos", StringUtils.reverseString("sole il"));
        assertEquals("lieLOS", StringUtils.reverseString("SOLeil"));
    }

    @Test
    @DisplayName("Should return true with kayak")
    void isPalindromeKayak(){
        boolean result=StringUtils.isPalindrom("kayak");
        assertTrue(result);
    }



    @Test
    @DisplayName("Should return false with bonjour")
    void isPalindromeBonjour(){
        boolean result=StringUtils.isPalindrom("bonjour");
        assertFalse(result);
    }

    @Test
    @DisplayName("Should return true with empty string")
    void isPalidndromeChaineVide(){
        boolean result=StringUtils.isPalindrom("");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with KAyaK")
    void isPalindromeKAYak(){
        boolean result=StringUtils.isPalindrom("KAyaK");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true with string containing spaces")
    void isPalindromeWithSpaces(){
        boolean result=StringUtils.isPalindrom("Engage le jeu que je le gagne");
        assertTrue(result);
    }

    @Test
    @DisplayName("Should return true if the prefix is in uppercase")
    void isPrefixUpperCase(){
        boolean result=StringUtils.isPrefix("banner","Ban");
        assertTrue(result);
    }
}