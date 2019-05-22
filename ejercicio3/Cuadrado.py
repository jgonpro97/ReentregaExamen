from ejercicio3.Rectangulo import Rectangulo

class Cuadrado(Rectangulo):

    def __init__(self, lado):
        super().__init__(lado, lado)

    @property
    def lado(self):
        return self.alto

    @lado.setter
    def lado(self, lado):
        self.alto = lado
        self.ancho = lado

    def __str__(self):
        return super().__str__()


    def __gt__(self, Cuadrado):
        return self.lado > Cuadrado.lado

    def __lt__(self, Cuadrado):
        return self.lado < Cuadrado.lado

    def __eq__(self, Cuadrado):
        return self.lado == Cuadrado.lado
