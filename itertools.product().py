from itertools import product
a=input().split()
b=input().split()
a=[int(i) for i in a]
b=[int(i) for i in b]

cartesian = list(product(a,b))
for i in cartesian:
    print(i, end=" ")
