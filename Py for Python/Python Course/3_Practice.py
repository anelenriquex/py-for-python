full_name = input('Hi user number one, please add your full name to start playing: ')
age = input('Alright ' + full_name + '. How old are you? ')

print('Perfect! ' + full_name + ' I see you are' + age + ' thats dope! Lets start playing now!')
explanation = '''Let me explain the rules real quick, there will be a secret word and you must guess it before the guy with the rope is completely hanged
                  Now I will let some other person to pick and write the word you must guess okay?'''

print(explanation)
word = input("(Whispers) Write the word secretly here: ")
amount_char = str(len(word))
print('The amount of characters of the secret word is ' + amount_char ) 
usertry = input('Now you try: ')

if(usertry == word):
    print("Dope you got it!")
else: 
    usertry = input("Try again!")


