name = input('Hello user please add your name:' )
if len(name) <3:
    print('Name must be more than 3 char long') 
elif len(name) >50:
    print('Name can be maximun of 50 char long')
else:
    print('Name is good to go!')