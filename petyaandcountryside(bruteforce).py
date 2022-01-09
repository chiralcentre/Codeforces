#longer run time of 1746ms
n = int(input())
heights = list(map(int,input().split()))
highest = 0
for i in range(n):
    k,m,counter = i,i,0
    # check for local maximum
    while k-1 in range(n) and heights[k-1] <= heights[k]:
        counter += 1
        k -= 1
    while m+1 in range(n) and heights[m] >= heights[m+1]:
        counter += 1
        m += 1
    if counter + 1 > highest:
        highest = counter + 1
print(highest)
    
    
