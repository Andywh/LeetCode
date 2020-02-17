package com.tree._437;

import com.basic.TreeNode;

/**
 * Created by Ai Lun on 2019-06-26.
 */
public class Solution {

    /**
     * pathSum 是查找不一定包含 root 并且和为 sum 的路径个数。
     * @param root
     * @param sum
     * @return
     */
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        result += findPath(root, sum);
        result += pathSum(root.left, sum);
        result += pathSum(root.right, sum);
        return result;
    }

    /**
     * findPath的含义就是查找包含root并且和为sum的路径个数。
     * @param root
     * @return
     */
    public static int findPath(TreeNode root, int sum) {
        int ret = 0;
        if (root == null) {
            return 0;
        }
        if (root.val == sum) {
            ret += 1;
        }
        ret += findPath(root.left, sum - root.val);
        ret += findPath(root.right, sum - root.val);
        return ret;
    }

}
