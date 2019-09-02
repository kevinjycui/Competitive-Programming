s = input()
nums = s.split(" ")
n = int(nums[0])
m = int(nums[1])

arr = []
arr.append(0)

for i in range(n):
    arr.append(int(input()))

ans = 0

for i in range(1, n+1):
    if arr[i]==1 and arr[i]!=arr[i-1]:
        ans+=1

print(ans)