name = input('Hello customer, please add your name: ')
fourssn = input('Please add the last four digits of your social security number: ')
bd = input('Please add your birth date ex(dd/mm/yyyy): ')

print('Just confirming. You are ' + name + ' your last four digits of your ssn are ' + fourssn + ' and your birthdate is ' + bd)
print('I see you are trying to buy this house, the current price is of 1 million dollars, and for that we need to verify if you have a good credit so we can proceed')

credit = input('Mr/Mrs ' + name + ' Do you have good credit?: ')
putdownamount1 = '100,000'
putdownamount2 = '200,000'

if (credit == 'yes'):
    print('The amount you need to put down is ' + putdownamount1)
else:
    print('The amount you need to put down is ' + putdownamount2)