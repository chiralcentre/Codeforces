word = input().strip()
upper,lower,length = 0,0,len(word)
for char in word:
    if 65 <= ord(char) <= 90:
        upper += 1
    elif 97 <= ord(char) <= 122:
        lower += 1
print(word.upper()) if upper > lower else print(word.lower())