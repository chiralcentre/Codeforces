prev,current,groups = '','',0
for _ in range(int(input())):
    current = input().strip()
    if prev != current:
        groups += 1
    prev = current
print(groups)
