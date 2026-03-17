// LeetCode 39 – Combination Sum

import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);

        return result;
    }

    void backtrack(int[] arr, int target, int start, List<Integer> temp, List<List<Integer>> result){

        if(target == 0){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int i = start; i < arr.length; i++){

            if(arr[i] > target)
                continue;

            temp.add(arr[i]);
            backtrack(arr, target - arr[i], i, temp, result);
            temp.remove(temp.size()-1);
        }
    }
}