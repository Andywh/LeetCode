package com.tree._108;

import com.basic.TreeNode;

import java.util.Arrays;

/**
 * Created by Ai Lun on 2019-06-21.
 */
public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int mid = nums.length / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return node;
    }

}
