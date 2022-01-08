n = int(input())
games = list(input().strip())
print('Anton') if games.count('A') > games.count('D') else print('Danik') if games.count('D') > games.count('A') else print('Friendship')
