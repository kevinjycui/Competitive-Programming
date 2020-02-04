def calc(v):
    a = v//3
    b = (v-a)//2
    c = v-a-b
    return a*b*c
    
d = int(input())
for i in range(d):
    h = int(input())
    print(calc(h))