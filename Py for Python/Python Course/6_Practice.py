print('Hello customer, I see you would like to convert your weight! Thats great! Lets hop on!')
name = input('Please, introduce your name: ')
age = input('Please now introduce you current age: ')
weightamount = input('And finally introduce your current weight: ')
weight = input('Would you like to transform it into L(bs) or K(gs): ')


cwk = float(weightamount) * 0.5
cwl = float(weightamount) * 2.2

if (weight == 'L' or weight == 'l'):
    print('Your current weight in (K)gs is: ' + str(cwk)) 
    
else:
    print('Your current weight in (L)bs is:' + str(cwl)) 