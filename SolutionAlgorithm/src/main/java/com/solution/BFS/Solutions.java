package com.solution.BFS;

import com.solution.Node;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solutions {
    //20240116
    public void mirror_mid(Node root) {
        if (root == null) {
            return;
        }
        Node p1 = root;
        Node p2 = null;
        while (p1 != null) {
            p2 = p1.left;
            //search left tree`s rightest node
            if (p2 != null) {
                while (p2.right != null && p2.right != p1) {
                    p2 = p2.right;
                }
                //connect p2.right to p1
                if (p2.right == null) {
                    p2.right = p1;
                    p1 = p1.left;
                    continue;
                } else {
                    //revert to null
                    p2.right = null;
                }
            }
            // reach the leftmost node, print node val
            System.out.println(p1.val);
            //
            p1 = p1.right;
        }

    }

    public void solution_99_1(Node root) {
        //迭代法中序遍历
        if (root == null) return;
        Deque<Node> list = new LinkedList<>();
        Node a = null;
        Node b = null;
        Node last = null;
        while (root != null || !list.isEmpty()) {
            //search leftmost node
            while (root != null) {
                list.addLast(root);
                root = root.left;
            }
            // reach the leftmost node, print node val
            root = list.pollLast();
            if (last != null && last.val > root.val) {
                if (a == null) {
                    a = last;
                    b = root;
                } else {
                    b = root;
                }
            }
            last = root;
            //
            root = root.right;
        }

        int val = a.val;
        a.val = b.val;
        b.val = val;

    }

    public void solution_99_mirror(Node root) {
        if (root == null) {
            return;
        }
        Node a = null, b = null, last = null;
        while (root != null) {
            Node t = root.left;
            //search leftmost node
            if (t != null) {
                while (t.right != null && t.right != root) {
                    t = t.right;
                }
                if (t.right == null) {
                    t.right = root;
                    root = root.left;
                    //指向之后
                    continue;
                } else {
                    t.right = null;
                }
            }
            // reach the leftmost node, print node val
            if (last != null && last.val > root.val) {
                if (a == null) {
                    a = last;
                    b = root;
                } else {
                    b = root;
                }
            }
            last = root;
            //
            root = root.right;
        }
        int val = a.val;
        a.val = b.val;
        b.val = val;
    }

    //20240117
    List<List<Integer>> ans;
    int t;

    public List<List<Integer>> solution_sw_34(Node root, int target) {
        if (root == null) {
            return null;
        }
        ans = new ArrayList<>();
        t = target;
        List<Integer> list = new ArrayList<>();
        dfs_sw_34(list, root);
        return ans;
    }

    private void dfs_sw_34(List<Integer> list, Node root) {
        if (root == null) return;
        list.add(root.val);
        if (t - root.val == 0 && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(list));
        }
        dfs_sw_34(list, root.left);
        dfs_sw_34(list, root.right);
        t = t + root.val;
        list.remove(list.size() - 1);

    }
}
