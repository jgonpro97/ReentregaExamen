class Rectangulo():

    def __init__(self, ancho, alto):
        Rectangulo.__verifica_lado(ancho)
        Rectangulo.__verifica_lado(alto)
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

    def __verifica_lado(num):
        if not isinstance(num, int):  # lado no entero
            raise TypeError("Lado no entero", num)
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