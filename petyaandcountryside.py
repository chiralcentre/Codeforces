#LICS = longest_increasing_consecutive_subsquence
def LICS(lst,index):
    counter = 0
    for i in range(index+1,len(lst)):
        if lst[i] >= lst[i-1]:
            counter += 1
        else:
            return counter + 1 #inclusive of start 
    return counter + 1

#LDCS = longest_decreasing_consecutive_subsequence
def LDCS(lst,index):
    counter = 0
    for i in range(index+1,len(lst)):
        if lst[i] <= lst[i-1]:
            counter += 1
        else:
            return counter + 1 #inclusive of start 
    return counter + 1

n = int(input())
heights = list(map(int,input().split()))
highest = 0
# look for local maximum
for i in range(n):
    # remove 1 to prevent double counting
    counter = LICS(heights,i) + LDCS(heights,i+LICS(heights,i)-1) - 1
    if counter > highest:
        highest = counter
print(highest)

    
    

