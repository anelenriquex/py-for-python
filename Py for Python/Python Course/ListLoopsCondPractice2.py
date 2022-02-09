lenghtoflist = int(input('Please add the lenght of the list: '))
list1 = []

for elements in range(lenghtoflist):
    data = int(input('Please add data to your list of elements: ' ))
    list1.append(data)

print(list1)

for x in list1:
    print('x' * x)
