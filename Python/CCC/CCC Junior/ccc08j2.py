def buttonOne(lst):
    temp = lst.pop(0)
    lst.append(temp)
    return lst
def buttonTwo(lst):
    temp = lst.pop(len(lst)-1)
    lst.insert(0, temp)
    return lst
def buttonThree(lst):
    temp = lst.pop(0)
    lst.insert(1, temp)
    return lst

s = ['A', 'B', 'C', 'D', 'E']
while True:
    btn = int(input())
    n = int(input())
    if btn == 1:
        for i in range(n):
            s = buttonOne(s)[:]
    elif btn == 2:
        for i in range(n):
            s = buttonTwo(s)[:]
    elif btn == 3:
        for i in range(n):
            s = buttonThree(s)[:]
    else:
        break

for a in s:
    print(a, end=' ')