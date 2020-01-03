while True:
    s = input()
    if s == 'X':
        break
    pref = 0
    a = False
    monkey = True
    for c in s:
        if (c == 'A' and a) or (c == 'N' and not a) or pref < 0 or (c == 'S' and not a):
            monkey = False
        if c == 'B':
            pref += 1
        elif c == 'S':
            pref -= 1
        elif c == 'A':
            a = True
        elif c == 'N':
            a = False
        else:
            monkey = False

    if pref != 0:
        monkey = False

    if monkey:
        print('YES')
    else:
        print('NO')
