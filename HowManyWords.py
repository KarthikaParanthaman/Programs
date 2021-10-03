import re

# get string
str = input()

#replace . , ! ?
str = re.sub('[.,!?0-9\n]','',str)
str = re.sub('\s$','',str)

words_count = str.split(' ')

print(len(words_count))