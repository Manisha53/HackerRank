from itertools import permutations
s, k=input().split()

output=list(permutations(s,int(k)))
output.sort()
for i in output:
    res=""
    for j in i:
        res = res+j
    print(res)
