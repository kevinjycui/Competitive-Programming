s = input()
t = input()
if sorted(s.replace(' ', '')) == sorted(t.replace(' ', '')):
    print('Is an anagram.')
else:
    print('Is not an anagram.')
