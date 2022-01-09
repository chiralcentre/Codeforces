n = int(input())
columns = list(map(int,input().split()))
print(' '.join(list(map(str,sorted(columns)))))
