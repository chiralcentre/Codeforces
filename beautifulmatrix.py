matrix = [input().split() for _ in range(5)]
centre_row,centre_col = 2,2
for i in range(5):
    if '1' in matrix[i]:
        row,col = i,matrix[i].index('1')
        break

print(abs(row-centre_row)+abs(col-centre_col))        
