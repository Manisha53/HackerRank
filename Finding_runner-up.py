if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    b = sorted(arr , key = int)
    c = b[::-1]
    for i in range(n):
        if c[i]==c[i+1]:
            continue
        elif c[i]>c[i+1]:
            print(c[i+1])
            break