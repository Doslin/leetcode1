### 0027_Remove_Element题解思路及其代码

Given an array *nums* and a value *val*, remove all instances of that value [**in-place**](https://en.wikipedia.org/wiki/In-place_algorithm) and return the new length.

Do not allocate extra space for another array, you must do this by **modifying the input array in-place** with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

```java
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int pointer = nums.length -1;
        while(i<= pointer){
            if (nums[i] == val){
                nums[i]=nums[pointer];
                pointer--;
            }else{
                i++;
            }
        }
        return pointer+1;
    }
}
```

思路：题意是原地``删除``数组中的元素，于是我的解决思路是,把val移到末尾，同时把末尾的数值与之替换，这样较少了数组中元素的移动的开销，同时给定一个指针来计数，以表示删除完成后，数组的空间