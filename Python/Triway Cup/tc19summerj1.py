line = input()
n = int(line.split(" ")[0])
m = int(line.split(" ")[1])

def check(n, m):
    if abs(n-m)>abs(n//2-m):
        return check(n//2, m)
    else:
        return n

print(check(n, m))