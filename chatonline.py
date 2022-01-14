p,q,l,r = map(int,input().split())
Z,X = sorted([tuple(map(int,input().split())) for _ in range(p)]),sorted([tuple(map(int,input().split())) for _ in range(q)])
moments = set()
for c,d in X:
    for a,b in Z:
        highest,lowest = b - c, a - d
        if lowest <= r and highest >= l:
            for i in range(max(lowest,l),min(highest+1,r+1)):
                moments.add(i)
print(len(moments))
        
        
