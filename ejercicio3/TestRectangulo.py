''' Clase para pruebas de Rectangulo
__author__: Juan Manuel Gonzalez Profumo
'''
from ejercicio3.Rectangulo import Rectangulo

try:
    rectangulo = Rectangulo(9, 4)
    print(rectangulo)
except ArithmeticError as e:
    print(e)