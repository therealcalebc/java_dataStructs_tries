/**
 * 
 */
package com.javaoopdata.tries;

/**
 * @author ccomstock
 *
 */
public class TrieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("trie");
        trie.insertWord("null");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("try");
        
        trie.printAllKeys();

    	System.out.println();
        String testPrefix = "tr";
        System.out.printf("prefix '%s' %s valid\n",testPrefix, trie.isPrefixValid(testPrefix)?"is":"is NOT");
        testPrefix = "ca";
        System.out.printf("prefix '%s' %s valid\n",testPrefix, trie.isPrefixValid(testPrefix)?"is":"is NOT");
        testPrefix = "ty";
        System.out.printf("prefix '%s' %s valid\n",testPrefix, trie.isPrefixValid(testPrefix)?"is":"is NOT");
        
    	System.out.println();
        String testWord = "trie";
        System.out.printf("word '%s' %s valid\n",testWord, trie.isPrefixValid(testWord)?"is":"is NOT");
        testWord = "car";
        System.out.printf("word '%s' %s valid\n",testWord, trie.isPrefixValid(testWord)?"is":"is NOT");
        testWord = "tyrd";
        System.out.printf("word '%s' %s valid\n",testWord, trie.isPrefixValid(testWord)?"is":"is NOT");

	}

}
