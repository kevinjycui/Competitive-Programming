d = int(input())
e = int(input())
w = int(input())
a = round(max(0, d-100)*0.25+e*0.15+w*0.2, 2)
b = round(max(0, d-250)*0.45+e*0.35+w*0.25, 2)
print("Plan A costs", a)
print("Plan B costs", b)
if a<b:
    print("Plan A is cheapest.")
elif a>b:
    print("Plan B is cheapest.")
else:
    print("Plan A and B are the same price.")