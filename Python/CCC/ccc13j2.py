sign = input()
letters = ['I', 'O', 'S', 'H', 'Z', 'X', 'N']
flag = True
for s in sign:
    if s not in letters:
        flag = False
        break

if flag:
    print("YES")
else:
    print("NO")
