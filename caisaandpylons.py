n = int(input())
pylons = [0] + list(map(int,input().split()))
dollars,energy = 0,0
for i in range(n):
    if energy + pylons[i] - pylons[i+1] < 0:
        dollars += abs(energy + pylons[i] - pylons[i+1])
        energy = 0
    else:
        energy += pylons[i] - pylons[i+1] 
print(dollars)
