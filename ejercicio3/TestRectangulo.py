from ejercicio3.Rectangulo import Rectangulo

try:
    rectangulo = Rectangulo(9, 1)
    print(rectangulo)
except ArithmeticError as e:
    print(e)