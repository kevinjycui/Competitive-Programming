s = input()
parts = ['B', 'F', 'T', 'L', 'C']
missing = False
for p in parts:
    if s.count(p)==0:
        print(p)
        missing = True
if not missing:
    print('NO MISSING PARTS')