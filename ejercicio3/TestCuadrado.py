from ejercicio3.Cuadrado import Cuadrado

try:
    cuadrado = Cuadrado(5)
    cuadrado2 = Cuadrado(4)
    print(cuadrado)
    print(cuadrado2)
except ArithmeticError as e:
    print(e)

print(cuadrado == cuadrado2)
print(cuadrado > cuadrado2)
print(cuadrado < cuadrado2)