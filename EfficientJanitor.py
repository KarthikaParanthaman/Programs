#get n
n = input()
n = int(n)

# get array list
f = input()
f = f.split(' ')

#convert to list of float
i = 0
a = []
while i < n :
    a.append(float(f[i]))
    i += 1


#sort 
a.sort()
print(a)

# min 1.01 max 3 diff 1.99
i = 0
j = n-1
takes = 0
while i < j :
    if a[j] > 1.99 :
        takes += 1
        j -= 1
    elif (a[i]+a[j]) > 3.0 :
        takes += 1
        j -= 1
    else:
        i += 1
        j -= 1
        takes += 1

print(takes)


