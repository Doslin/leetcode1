### 0046_Permutations 

Given a collection of **distinct** integers, return all possible permutations.
  题意：给定一个数字列表，返回其所有可能的排列
  使用深度优先搜索算法 

```java
public class Solution {
    /*
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null) {
            return results;
        }
        dfs(nums, new boolean[nums.length], new ArrayList<Integer>(), results);
        return results;
    }
    private void dfs(int[] nums,
                     boolean[] visited,
                     List<Integer> permutation,
                     List<List<Integer>> results) {
        if (nums.length == permutation.size()) {
            results.add(new ArrayList<Integer>(permutation));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            permutation.add(nums[i]);
            visited[i] = true;
            dfs(nums, visited, permutation, results);
            visited[i] = false;
            permutation.remove(permutation.size() - 1);
        }
    }
}
```

 DFS适合此类题目：给定初始状态跟目标状态，要求判断从初始状态到目标状态是否有解。

这个算法运用的时候就是找一个头结点，然后沿着这个头结点一直找下去，直到走到最后一个满足条件的分节点，然后再寻找另一条路径，当沿着一条路走不满足条件时会自动的跳入上一层节点进行判断。dfs算法通常与回溯算法一起使用