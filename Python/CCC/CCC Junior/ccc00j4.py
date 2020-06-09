n = int(input())
streams = []
for i in range(n):
    streams.append(int(input()))
while True:
    l = int(input())
    if l == 99:
        split = int(input())-1
        perc = int(input())
        a = streams[split]
        if perc != 0 and perc != 100:
            streams[split] = a/(100/perc)
            streams.insert(split+1, a/(100/(100-perc)))
        elif perc == 0:
            streams[split] = 0
            streams.insert(split+1, a)
        else:
            streams[split] = a
            streams.insert(split+1, 0)
    elif l == 88:
        join = int(input())-1
        streams[join] = streams[join] + streams[join+1]
        streams.pop(join+1)
    else:
        break
for s in streams:
    print(round(s), end=' ')
