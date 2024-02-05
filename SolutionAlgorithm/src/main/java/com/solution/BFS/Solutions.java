package com.solution.BFS;

import com.solution.Node;

import java.util.*;

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

    public List<List<Integer>> solution_sw_34(Node root, int target) {
        ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        List<Integer> list = new ArrayList<>();
        dfs_sw_34(list, target, root);
        return ans;
    }

    private void dfs_sw_34(List<Integer> list, int cur, Node root) {
        if (root == null) return;
        list.add(root.val);
        if (cur - root.val == 0 && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(list));
        }
        dfs_sw_34(list, cur - root.val, root.left);
        dfs_sw_34(list, cur - root.val, root.right);
        list.remove(list.size() - 1);
    }

    //20240118
    public List<List<Integer>> solution_94(int[] nums) {
        return new ArrayList<List<Integer>>();
    }

    public long solution_2171_violence(int[] nums) {
        if (nums == null) return 0;
        Arrays.sort(nums);
        long ans = Long.MAX_VALUE;
        long preSum = 0;
        boolean[] flags = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            long cur = preSum;
            preSum += nums[i];
            if (flags[i]) {
                continue;
            }
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    flags[j] = true;
                    continue;
                }
                cur += nums[j] - nums[i];
            }
            ans = Math.min(cur, ans);
        }
        return ans;
    }

    //20240119
    public long solution_2171(int[] beans) {
        int n = beans.length;
        Arrays.sort(beans);
        long total = 0; // 豆子总数
        for (int i = 0; i < n; i++) {
            total += beans[i];
        }
        long res = total; // 最少需要移除的豆子数
        for (int i = 0; i < n; i++) {
            res = Math.min(res, total - (long) beans[i] * (n - i));
        }
        return res;
    }
}
