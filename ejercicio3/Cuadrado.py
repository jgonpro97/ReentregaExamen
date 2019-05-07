from ejercicio3.Rectangulo import Rectangulo

class Cuadrado(Rectangulo):

    def __init__(self, lado):
        super().__init__(lado, lado)
        self.__lado = lado

    @property
    def lado(self):
        return self.__lado

    @lado.setter
    def lado(self, lado):
        self.__lado = lado

    def __str__(self):
        return super().__str__()

    def __gt__(self, Cuadrado):
        return self.__lado > Cuadrado.__lado

    def __lt__(self, Cuadrado):
        return self.__lado < Cuadrado.__lado

    def __eq__(self, Cuadrado):
        return self.__lado == Cuadrado.__lado
