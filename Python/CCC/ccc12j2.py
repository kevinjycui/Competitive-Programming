a = []
flag = True
for i in range(4):
    a.append(int(input()))   
if a[0]<a[1]:
    for i in range(2, len(a)):
        if a[i-1]>=a[i]:
            flag = False
            break
    if flag:
        print("Fish Rising")
elif a[0]>a[1]:
    for i in range(2, len(a)):
        if a[i-1]<=a[i]:
            flag = False
            break
    if flag:
        print("Fish Diving")
elif a[0]==a[1]:
    for i in range(2, len(a)):
        if a[i-1]!=a[i]:
            flag = False
            break
    if flag:
        print("Fish At Constant Depth")
if not flag:
    print("No Fish")