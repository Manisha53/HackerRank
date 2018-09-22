marksheet = []
for _ in range(int(input())):
    marksheet.append([input(),float(input())])
    
el = sorted(list(set(mark for name, mark in marksheet)))[1]
print('\n'.join([a for a , b in sorted(marksheet) if b == el]))