/**
 * Created by yuze on 16/6/18.
 */
public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode tn = root;
        for (int i=0;i<word.length();++i) {
            if (tn.children[word.charAt(i)-'a'] == null) {
                tn.children[word.charAt(i) - 'a'] = new TrieNode(word.charAt(i));
            }
            tn = tn.children[word.charAt(i)-'a'];
        }
        tn.isWord = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode tn = root;
        for (int i=0;i<word.length();++i) {
            if (tn.children[word.charAt(i)-'a'] == null) {
                return false;
            }
            tn = tn.children[word.charAt(i)-'a'];
        }
        return tn.isWord;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode tn = root;
        for (int i=0;i<prefix.length();++i) {
            if (tn.children[prefix.charAt(i)-'a'] == null) {
                return false;
            }
            tn = tn.children[prefix.charAt(i)-'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("app");
        t.insert("apple");
        t.search("app");
        t.startsWith("a");
    }
}
