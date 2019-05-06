package main.kotlin.Easy

/**
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

fun twoSum(nums: IntArray,target: Int): IntArray? {
    var map:HashMap<Int,Int> = hashMapOf<Int,Int>();
    for(i in nums.indices){
        if(map.containsKey(nums[i])) {
            return intArrayOf(map.get(nums[i])!!,i)
        }
        map.put(target - nums[i], i)
    }
    return null
}

fun main(){
    var result = twoSum(intArrayOf(2,8,7,3),9)
    for(i in result!!) {
        print(i)
    }
}


