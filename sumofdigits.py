def sumofdigits(n):
    return sum(map(int,list(str(n))))

attempts,n = 0,int(input())
while n > 9:
    n = sumofdigits(n)
    attempts += 1
print(attempts)
