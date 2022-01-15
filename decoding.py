from collections import deque

n,s = int(input()),list(input().strip())
original = deque([])
while s:
    median = s.pop(0)
    if n%2:
        original.append(median)
    else:
        original.appendleft(median)
    n -= 1
print(''.join(original))
    
