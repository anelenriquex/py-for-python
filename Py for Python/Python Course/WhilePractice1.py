name = input('Please introduce your name user: ')
amount = int(input(name + ', please introduce the amount of numbers you want on your list: '))
base = 0

while base < amount:
    base += 1
    numbers = []
    numbers.append(int(input(name + ', please add your number: ')))
print('Perfect, to confirm everything is okay your list will be printed: ' )
print(numbers) 

