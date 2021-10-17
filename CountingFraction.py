(a,d) = input().split(' ')
a = int(a)
d = int(d)
num2 = float(1/(a))
num1 = float(1/(a+1))

def hcf(x, y):
    if y == 0 :
        return y
    return hcf(y, x%y)

print(hcf(1,5))
"""
count = 0
for i in range(1, d+1):
    for j in range (i+1, d+1):
        if (j%2) == 0 and (i%2) == 0 :
            continue
        elif hcf(i,j) == False:
            num = float(i/j)
            #print(f'{i}/{j} = {num}')
            if num > num1 and num < num2 :
                count += 1
                #print(f'{i}/{j}')

print(count)
"""