p,q,l,r = map(int,input().split())
Z,X = [tuple(map(int,input().split())) for _ in range(p)],[tuple(map(int,input().split())) for _ in range(q)]
moments = set()
for c,d in X:
    for a,b in Z:
        highest,lowest = b - c, a - d
        for i in range(max(lowest,l),min(highest+1,r+1)):
                moments.add(i)
print(len(moments))
        
        
