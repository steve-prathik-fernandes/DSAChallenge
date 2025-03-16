from typing import List

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        # Copy elements from nums2 to nums1 starting at index m
        for i in range(n):
            nums1[m + i] = nums2[i]
        
        # Sort the entire nums1 array
        nums1.sort()