msg = input()
n = msg.count(":-)")
m = msg.count(":-(")
if n==0 and m==0:
    print("none")
elif n==m:
    print("unsure")
elif n>m:
    print("happy")
elif n<m:
    print("sad")