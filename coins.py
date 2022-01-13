dict1 = {'A':0,'B':0,'C':0}
# 3 weightings possible
for _ in range(3):
    coin1,sign,coin2 = input().strip()
    if sign == '<':
        dict1[coin2] += 1
    else:
        dict1[coin1] += 1

print(list(dict1.keys())[list(dict1.values()).index(0)] + list(dict1.keys())[list(dict1.values()).index(1)] + list(dict1.keys())[list(dict1.values()).index(2)]) if list(sorted(dict1.values())) == [0,1,2] else print('Impossible')
        
        

    
