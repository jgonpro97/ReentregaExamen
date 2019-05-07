from ejercicio3.Rectangulo import Rectangulo

try:
    rectangulo = Rectangulo(9, 3)
    print(rectangulo)
except ArithmeticError as e:
    print(e)