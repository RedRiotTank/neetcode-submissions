class PrefixTree {

    private PrefixTree[] child;
    private boolean endOfWord;

    public PrefixTree() {
        child = new PrefixTree[26];
        endOfWord = false; 
    }

    public void insert(String word) {
        PrefixTree current = this;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (current.child[c - 'a'] == null) current.child [c - 'a'] = new PrefixTree();

            current = current.child[c - 'a'];
        }

        current.endOfWord = true;

    }

    public boolean search(String word) {
        PrefixTree current = this;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (current.child[c - 'a'] == null) return false;

            current = current.child[c - 'a'];
        }

        return current.endOfWord;
    }

    public boolean startsWith(String prefix) {
        PrefixTree current = this;

        for (int i = 0 ; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            
            if (current.child[c - 'a'] == null) return false;
            
            current = current.child[c - 'a'];
        }

        return true;
    }
}
