name = input('Please user enter your name: ')
age = input('Please user enter your age: ')
print('Okay lets do this, we will create your own list of numbers, for this I will ask the list lenght and individual numbers, or names, okay?')

list1 = []

listlenght = int(input('Please add the lenght of your list: '))
for i in range(listlenght):
    data = (input('Please add the data of the list: ' ))
    list1.append(data)

print('Okay ' + name + ' I see you currently are ' + age + " that's dope! anyways... this is your list:")

print(list1)