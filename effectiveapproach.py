n = int(input()); array = input().split()
m = int(input()); queries = input().split()
#dictionary is used to store indexes of elements in array
V,P,positions = 0,0,{value: key for key,value in enumerate(array)}

for i in range(m):
    V += positions[queries[i]] + 1
    P += n - positions[queries[i]]
        
print(f'{V} {P}')
