from sys import stdin,stdout
from collections import deque
#https://codeforces.com/problemset/problem/796/D
n,k,d = map(int,stdin.readline().split()) #value of d does not matter here
#offset by 1 due to zero indexing, convert to set as there can be multiple police stations in one city
stations = set(map(lambda x: int(x) - 1, stdin.readline().split())) 
adjList = [[] for _ in range(n)]
for i in range(n-1):
    a,b = map(int,stdin.readline().split())
    a -= 1; b -= 1;
    adjList[a].append((b,i+1)) #road number is stored as right attribute
    adjList[b].append((a,i+1))
    
visited,frontier,removedRoads = [False for _ in range(n)],deque([]),set()
for vertex in stations:
    visited[vertex] = True
    frontier.append((vertex,0)) #right attribute keeps track of predecessor

while frontier: #BFS with time complexity O(n) since there are n vertices and n - 1 edges
    u,p = frontier.popleft()
    for v,r in adjList[u]:
        if not visited[v]:
            visited[v] = True
            frontier.append((v,u))
        elif v != p: #already visited and not the same vertex is predecessor
            removedRoads.add(r)
                
stdout.write(f'{len(removedRoads)}\n')
stdout.write(' '.join(str(r) for r in removedRoads))
    

