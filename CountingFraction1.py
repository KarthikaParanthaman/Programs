## works timeout
n = int(input())

def hcf(x, y):
    if y == 0 :
        return x
    return hcf(y, x%y)

def count_fraction(d) :
    count = 0
    for i in range(1, d+1):
        for j in range (i+1, d+1):
            if hcf(i,j) < 2:
                count += 1
                #print(f'{i}/{j}')    
    return count

fcount = []
for i in range(0, n):
    d =int(input())
    fcount.append(count_fraction(d))

for i in range(0, n):
    print(fcount[i])







