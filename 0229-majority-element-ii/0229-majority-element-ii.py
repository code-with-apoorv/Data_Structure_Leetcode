class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        el1 = None
        el2 = None
        cnt1 = 0
        cnt2 = 0
       
        for i in range(n):
            if cnt1 == 0 and el2 != nums[i]:
                el1 = nums[i]
                cnt1 = 1
            elif cnt2 == 0 and el1 != nums[i]:
                el2 = nums[i]
                cnt2 = 1
            elif el1 == nums[i]:
                cnt1 += 1
            elif el2 == nums[i]:
                cnt2 += 1
            else:
                cnt1 -= 1
                cnt2 -= 1
        
        cnt1 = 0
        cnt2 = 0
        ans = []
        
        for i in range(n):
            if el1 == nums[i]:
                cnt1 += 1
            elif el2 == nums[i]:
                cnt2 += 1
                
        
        if cnt1 > n // 3:
            ans.append(el1)
        if cnt2 > n // 3:
            ans.append(el2)
            
        ans.sort()
        return ans
