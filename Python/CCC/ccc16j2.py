squareRows = []
for i in range(4):
    s = input()
    s = s.split(" ")
    for dig in range(len(s)):
        s[dig] = int(s[dig])
    squareRows.append(s)
squareCols = [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]
for i in range(4):
    for j in range(4):
        squareCols[i][j] = squareRows[j][i]
sm = sum(squareRows[0])
magic = 'magic'
for i in range(4):
    if sum(squareRows[i])!=sm:
        magic = 'not magic'
        break
    if sum(squareCols[i])!=sm:
        magic = 'not magic'
        break
print(magic)