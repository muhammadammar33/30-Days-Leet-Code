class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        count = {}

        for num in arr:
            count[num] = count.get(num, 0) + 1

        occurrence_set = set()

        for val in count.values():
            if val in occurrence_set:
                return False
            occurrence_set.add(val)

        return True