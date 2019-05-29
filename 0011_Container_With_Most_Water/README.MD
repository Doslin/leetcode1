给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i,ai) 。在坐标内画 n 条垂直线，垂直线i的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与x 轴共同构成的容器可以容纳最多的水。 [![image](https://camo.githubusercontent.com/14a186439c8f333217e98e7f9bf83c81c83c4003/68747470733a2f2f616c6979756e2d6c632d75706c6f61642e6f73732d636e2d68616e677a686f752e616c6979756e63732e636f6d2f616c6979756e2d6c632d75706c6f61642f75706c6f6164732f323031382f30372f32352f7175657374696f6e5f31312e6a7067)](https://camo.githubusercontent.com/14a186439c8f333217e98e7f9bf83c81c83c4003/68747470733a2f2f616c6979756e2d6c632d75706c6f61642e6f73732d636e2d68616e677a686f752e616c6979756e63732e636f6d2f616c6979756e2d6c632d75706c6f61642f75706c6f6164732f323031382f30372f32352f7175657374696f6e5f31312e6a7067)

图中垂直线代表输入数组[1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。

**示例:**

> 输入: [1,8,6,2,5,4,8,3,7] 输出: 49

说明：你不能倾斜容器，且 n 的值至少为 2。

```java
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int ans = 0;
        for(;i<j;){
            int minHeight =  height[i] < height[j] ? height[i++] : height[j--];
            ans = Math.max(ans,minHeight * (j - i + 1));
        }
        return ans;
    }
}
```


