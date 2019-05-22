'''
3. Haz el ejercicio anterior en Python. Enunciado del ejercicio anterior:
• Crea la clase Rectángulo de forma que:
• Un objeto de esta clase se construye pasándole el ancho y el alto. Ninguno de los dos atributos
puede ser menor o igual a cero ni mayor que diez, en esos casos se debe lanzar la excepción
ArithmeticException.
• Mediante getters y setters permite que se acceda y se modifique el ancho y el alto del
rectángulo teniendo en cuenta las restricciones en cuanto a las dimensiones del apartado
anterior.
• Al imprimir en pantalla un objeto de la clase usando System.out.print se debe dibujar el
rectángulo por la pantalla (de manera similar a como se imprime un cuadrado en la página 130
del libro Aprende Java con Ejercicios).
• Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
la posibilidad de comparar objetos cuadrados entre sí.
• Crea los programas de test correspondientes a ambas clases. Debes provocar que se lance la
excepción y capturarla.
__author__: Juan Manuel Gonzalez Profumo
'''
class Rectangulo():

    ''' Constructor de Rectangulo '''

    def __init__(self, ancho, alto):
        self.__ancho = ancho
        self.__alto = alto

    @property
    def ancho(self):
        return self.__ancho

    @ancho.setter
    def ancho(self, ancho):
        Rectangulo.__verifica_lado(ancho)
        self.__ancho = ancho

    @property
    def alto(self):
        return self.__alto

    @alto.setter
    def alto(self, alto):
        Rectangulo.__verifica_lado(alto)
        self.__alto = alto

    ''' Metodo para comprobar que el valor estte entre 1 y 10 '''

    def __verifica_lado(num):
        if not isinstance(num, int):
            raise TypeError("El lado no es entero", num)
        if (num < 1 or num > 10):
            raise ArithmeticError("Valor introducido entre 1 y 10")

    def __str__(self):
        resultado = ""

        for i in range(self.__ancho):
            resultado += "*"

        resultado += "\n"

        for i in range(1, self.__alto - 1):
            resultado += "*"
            for espacios in range(1, self.__ancho - 1):
                resultado += " "
            resultado += "*\n"
        for i in range(self.__ancho):
            resultado += "*"
        resultado += "\n"

        return resultado