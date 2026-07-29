/**
 * @param {number[]} nums
 * @return {number[]}
 */
var singleNumber = function(nums) {
    let res = [];

    for(let i=0;i<nums.length;i++){
        let element = nums[i];

        if(nums.indexOf(element) === nums.lastIndexOf(element)){
            res.push(element);
        }
    }
    return res;
};