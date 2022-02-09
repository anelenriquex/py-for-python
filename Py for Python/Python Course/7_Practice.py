from dis import Instruction
from tracemalloc import start


car = input('What brand and model of car are you riding?: ')
transmission = input("Is it manual or automatic transmission?: ")
name = input ('Dope! now please add your name: ')

print('Okay ' + name + ' I see you are rocking a ' + transmission + ' transmission ' + car + '. Thats hella dope!' )
print("Now let's start.")

started = False  #El booleano esta en "false" porque el carro no inicia encendido.
                 #EL BOOLEANO DEBE ESTAR FUERA DE EL LOOP WHILE SINO ALTERA LO DE ADENTRO

while True :
    command = input('> ').lower()
    if command == 'help':
        print(''' 
> Start - for the car to start its engine.
> Stop  - for the car to stop its engine.
> Quit  - if you want to quit the simulation.
        ''')
    
    elif command == 'start':
        if started: #El "If" en este caso hace que el booleano sea verdadero, por ende se lee de esta forma: "Si el carro ya esta encendido..."
            print(car + ' Already revving man wtf... ')
        else:
            started = True
            print(transmission  +  car + ' Engine revving...')
    
    
    elif command == 'stop':
        if not started: #El "If not" en este caso hace que el booleano sea falso, por ende se lee de esta forma: "Si el carro ya esta encendido..."
            print(car + ' Already stopped man wtf... ')
        else:
            started = False
            print(transmission  +  car + ' Engine dying... ')
    
    
    elif command == 'quit':
        break
    else:
        print("Sorry I don't understand that")
        