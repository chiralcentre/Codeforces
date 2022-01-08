n,h = map(int,input().split())
persons = list(map(int,input().split()))
width = 0
for height in persons:
    width += 2 if height > h else 1
print(width)
