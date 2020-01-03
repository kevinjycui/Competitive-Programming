s = input()
if s.count('.') != 1:
    name = s
    ext = input().lower()
else:
    name = s.split('.')[0]
    ext = s.split('.')[1].lower()
print('"'+name+'"'+' - '+ext)
