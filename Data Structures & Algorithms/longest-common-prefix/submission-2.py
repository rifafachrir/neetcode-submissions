class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        accumulateString = []
        for chars in zip(*strs):
            if(len(set(chars)) == 1):
                accumulateString.append(chars[0])
            else:
                break
        
        return "".join(accumulateString)





        