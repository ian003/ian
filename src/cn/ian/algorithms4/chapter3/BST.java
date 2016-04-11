package cn.ian.algorithms4.chapter3;

import javax.xml.soap.Node;

/**
 * Created by ian on 2016/4/11.
 */
public class BST<Key extends Comparable<Key>, Value> {

    private Node root;

    private class Node {

        private Key key;
        private Value val;
        private Node left, right;
        private int N;

        public Node(Key key, Value val, int n) {
            this.key = key;
            this.val = val;
            N = n;
        }
    }

    public BST() {
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return x.N;
    }


    public void put(Key key, Value value) {
        if (key == null) throw new NullPointerException("key can not be null");
        if (value == null) { // value为空，则删除key
            // TODO: delete(key)
            return;
        }
        root = put(root, key, value);
    }

    private Node put(Node node, Key key, Value value) {
        if (node == null) return new Node(key, value, 1);

        int cmp = key.compareTo(node.key);
        if (cmp == 0) {
            node.val = value;
        } else if (cmp > 0) {
            node.right = put(node.right, key, value);
        } else {
            node.left = put(node.left, key, value);
        }
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x.val;
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return get(x.left, key);
        }
    }

    public Key min() {
        return min(root).key;
    }

    private Node min(Node x) {
        if (x.left == null) return x;
        else return min(x.left);
    }

    public Key max() {
        return max(root).key;
    }

    private Node max(Node x) {
        if (x.right == null) return x;
        else return max(x.right);
    }
}
