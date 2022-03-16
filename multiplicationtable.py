from sys import stdin,stdout
#https://codeforces.com/problemset/problem/448/D
# in ith row, there will min(m,(x-1)//i) numbers < x
def find_count(x,n,m): #O(n)
    return sum(min(m,(x-1)//i) for i in range(1,n+1))
#works only with Pypy             
n,m,k = map(int,stdin.readline().split())
#find largest x such that amount of numbers from table, least than x, is strictly less than k.
start,end = 1,n*m+1
while start < end: #binary search for answer; O(n log(nm))
    mid = (start+end)>>1
    if find_count(mid,n,m) < k:
        start = mid + 1
    else:
        end = mid
stdout.write(f'{start-1}\n')
