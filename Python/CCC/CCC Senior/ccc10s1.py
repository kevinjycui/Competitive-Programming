class Computer(object):
    def __init__(self, name, r, s, d):
        self.name = name
        self.value = 2*r + 3*s + d
    def __gt__(self, other):
        if self.value == other.value:
            return self.name > other.name
        return self.value < other.value
    def __lt__(self, other):
        if self.value == other.value:
            return self.name < other.name
        return self.value > other.value

n = int(input())
computers = []
for i in range(n):
    s = input().split(' ')
    computers.append(Computer(s[0], int(s[1]), int(s[2]), int(s[3])))

computers.sort()

if (n == 1):
    print(computers[0].name)
elif (n > 1):
    print(computers[0].name+'\n'+computers[1].name)
    
