eggs = ['R','O','Y','G','B','I','V']
n,middle = int(input()),3
while n > 7:
    eggs.append(eggs[middle])
    middle += 1
    n -= 1
print(''.join(eggs))
