t = int(input())
for i in range(t):
    n = int(input())
    trace = 0
    hor = 0
    ver = 0
    matrix = []
    flipped = []
    for r in range(n):
        matrix.append(list(map(int, input().split(' '))))
        flipped.append([0]*n)
        trace += matrix[r][r]
        hor += 1 if len(set(matrix[r])) < len(matrix[r]) else 0
    for r in range(n):
        for c in range(n):
            flipped[r][c] = matrix[n-1-c][n-1-r]
    for c in range(n):
        ver += 1 if len(set(flipped[c])) < len(flipped[r]) else 0
    print('Case #%d: %d %d %d' % (i+1, trace, hor, ver))
