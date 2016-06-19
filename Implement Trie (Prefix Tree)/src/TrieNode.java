/**
 * Created by yuze on 16/6/18.
 */
public class TrieNode {
    TrieNode() {

    }
    TrieNode(char c) {
        value = c;
    }

    TrieNode[] children = new TrieNode[26];
    char value;
    boolean isWord;
}
