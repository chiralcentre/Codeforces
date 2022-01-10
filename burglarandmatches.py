n,m = map(int,input().split())
matchboxes = {}
for _ in range(m):
    a,b = map(int,input().split()) #a refers to number of matchboxes holding b matches
    matchboxes[b] = a if b not in matchboxes else matchboxes[b] + a
highest = 0
for key,value in sorted(matchboxes.items(),key = lambda x: x[0],reverse = True):
    if value <= n:
        highest += key*value
        n -= value
    else:
        highest += key*n
        n = 0
    if n == 0:
        break
print(highest)



