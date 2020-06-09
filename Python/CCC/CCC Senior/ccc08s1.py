class City(object):
    def __init__(self, name, temp):
        self.name = name
        self.temp = temp

city = ""
cities = []
while city!="Waterloo":
    city, temp = input().split(" ")
    temp = int(temp)
    cities.append(City(city, temp))
mn = City("", 201)
for c in cities:
    if mn.temp > c.temp:
        mn = c
print(mn.name)