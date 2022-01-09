n,a = map(int,input().split())
cities = list(map(int,input().split()))
highest_distance = n - a if a <= n/2 else a
BCD = [0 for i in range(highest_distance+1)] 
for j in range(n): #a is not zero indexed
    BCD[abs(a-1-j)] += cities[j]

criminals = 0
for k in range(highest_distance+1):
    if k == 0 and BCD[k] == 1: #the starting location is guaranteed to have one criminal
        criminals += 1
    else: # check if number of possiblities match up with the number of criminals
        left_side = 1 if a-1-k in range(n) else 0
        right_side = 1 if a-1+k in range(n) else 0
        if BCD[k] == left_side + right_side:
            criminals += BCD[k]
print(criminals)
        
    

