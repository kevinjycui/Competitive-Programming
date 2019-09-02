k = int(input())
word = input()
ans = ''
for i in range(len(word)):
    ind = ord(word[i])-(3*(i+1)+k)
    if ind < 65:
        ind += 26
    ans += chr(ind)
print(ans)