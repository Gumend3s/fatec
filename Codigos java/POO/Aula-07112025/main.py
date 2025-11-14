class Numeros:
    MULTIPLIER = 100
    
    def __init__(self,x=0,y=0):
        self._x = x
        self._y = y
    
    def soma(self):
        return self._x + self._y
    