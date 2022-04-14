from unicodedata import name


print('''
Federacion Nacional de Basquetbol de Panama.

Bienvenido/a! Hoy estaremos reclutando tanto hombres como mujeres 
talentosas para nuesro programa nacional de basquetbol.

Hay ciertos requisitos que se necesitan cumplir:
-Edad máxima:  18 años
-Edad mínima:  14 años
-Estatura mínima: 1.80 mts.
-Peso máximo:  160 libras. 
''')                    
#Iterador
i = 0 

#Listas
Aspirantes = [] 
Fracasados = []
Aceptados = []
Hombres = []
Mujeres = []

#Limite de iteracion 
Players = int(input("¿Cuantos jugadores desea incluir?: "))

#Loop While
while i < Players:
    i += 1  #Progresion del iterador

    Name = input("Por favor introduzca su nombre: ") #Nombres de los jugadores
    Aspirantes.append(Name) #Acumula los nombres en la lista de aspirantes
    Age = int(input("Por favor introduzca su edad: ")) #Edad
    Sex = input("Introduzca su sexo(M/F): ") #Sexo
    Height = float(input("Por favor introduzca su estatura (m): ")) #Altura
    Weight = float(input("Por favor introduzca su peso (lbs): ")) #Peso

    if 14 > Age > 18 or Height < 1.80 or Weight > 160: #Conidcional para determinar aceptados o fracasados 
        print("Lo siento mucho, se exceden los limites para entrar a este programa.\n")
        Fracasados.append(Name) #Acumula fracasados
    else:
        print("Perfecto! Usted aplica para este programa.\n")
        Aceptados.append(Name) #Acumula aceptados
    
    if Sex == 'M':
        Hombres.append(Name) #Acumula hombres
    else:
        Mujeres.append(Name) #Acumula mujeres


print("Listado de los aspirantes :\n")
print(Aspirantes)

print("\nListado de los aceptados : \n")
print(Aceptados)

print("\nListado de los fracasados : \n")
print(Fracasados)

print("\nListado de los hombres : \n")
print(Hombres)

print("\nListado de las mujeres : \n")
print(Mujeres)

