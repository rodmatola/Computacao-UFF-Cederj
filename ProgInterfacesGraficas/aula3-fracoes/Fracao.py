class Fracao(object):
    def __init__(self, numerador, denominador):
        self.numerador = numerador
        self.denominador = denominador
        self.simplifica()

    def __str__(self):
        return "%d/%d" % (self.numerador, self.denominador)

    def __add__(self,b):
        denominador = self.denominador * b.denominador
        numerador1 = denominador / self.denominador * self.numerador
        numerador2 = denominador / b.denominador * b.numerador
        numerador = numerador1 + numerador2
        return Fracao(numerador,denominador)

    def __sub__(self,b):
        denominador = self.denominador * b.denominador
        numerador1 = denominador / self.denominador * self.numerador
        numerador2 = denominador / b.denominador * b.numerador
        numerador = numerador1 - numerador2
        return Fracao(numerador, denominador)

    def __mul__(self,b):
        numerador = self.numerador * b.numerador
        denominador = self.denominador * b.denominador
        return Fracao(numerador,denominador)

    def __div__(self,b):
        numerador = self.numerador * b.denominador
        denominador= self.denominador * b.numerador
        return Fracao(numerador,denominador)

    def simplifica(self):
        mdc = self.mdc()
        self.numerador //= mdc
        self.denominador //= mdc
        return self

    def mdc(self):
        x = self.numerador
        y = self.denominador
        while y != 0:
            resto = x % y
            x = y
            y = resto
        return x

if __name__ == '__main__':
    f = Fracao(15,45)
    g = Fracao(50,75)
    print ("f = 15/45 = %s" % f)
    print ("g = 50/75 = %s" % g)
    # print ("f + g = %s" % (f + g))
    h = Fracao (10,28)
    print ("h = 10/28 = %s" % h)
    print ("f * h = %s" % (f * h))
    print ("f + g + h = %s" % (f + g + h))
    print ("f + g * h = %s" % (f + g * h))
    # print ("g - f - f = %s" % (g - f - f))
    # print ("f * 2 = %s" % (f * 2))
    # print ("f + 2 = %s" % (f + 2))
    print ("f / g = %s" % (f / g))
    # f += g*2
    # print ("f += g*2 = %s" % f)
    # f -= g*2
    # print ("f -= g*2 = %s" % f)