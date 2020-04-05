class Task(object):
    def __init__(self, i, s, e):
        self.index = i
        self.pos = s
        self.time = set(range(s, e))
        self.person = ''
    def __gt__(self, other):
        if not chron:
            return self.pos > other.pos
        return self.index > other.index

t = int(input())
for i in range(t):
    n = int(input())
    chron = False
    tasks = []
    for j in range(n):
        s, e = map(int, input().split(' '))
        tasks.append(Task(j, s, e))
    tasks.sort()
    chron = True
    c = set()
    j = set()
    ans = ''
    for task in tasks:
        time = task.time
        if not c.intersection(time):
            c = c.union(time)
            task.person = 'C'
        elif not j.intersection(time):
            j = j.union(time)
            task.person = 'J'
        else:
            ans = 'IMPOSSIBLE'
            break
    if ans != 'IMPOSSIBLE':
        tasks.sort()
        for task in tasks:
            ans += task.person
    print('Case #%d: %s' % (i+1, ans))
