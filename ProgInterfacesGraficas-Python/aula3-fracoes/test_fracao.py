import pytest
from Fracao import *

f = Fracao(15, 45)
g = Fracao(50, 75)
h = Fracao(10, 28)

def test1():
    assert ("f = 15/45 = %s" % f) == "f = 15/45 = 1/3"

def test2():
    assert ("g = 50/75 = %s" % g) == "g = 50/75 = 2/3"

# def test3():
#     assert "f + g = %s" % (f + g) == "f + g = 1"

def test4():
    assert ("h = 10/28 = %s" % h) == "h = 10/28 = 5/14"

def test5():
    assert ("f * h = %s" % (f * h)) == "f * h = 5/42"

def test6():
    assert ("f + g + h = %s" % (f + g + h)) == "f + g + h = 19/14"


def test7():
    assert ("f + g * h = %s" % (f + g * h)) == "f + g * h = 4/7"

# def test8():
#     assert ("g - f - f = %s" % (g - f - f)) == "g - f - f = 0"

# def test9():
#     assert ("f * 2 = %s" % (f * 2)) == "f * 2 = 2/3"

# def test10():
#     assert ("f + 2 = %s" % (f + 2)) == "f + 2 = 7/3"

def test11():
    assert ("f / g = %s" % (f / g)) == "f / g = 1/2"

# def test12():
#     f += g * 2
#     assert ("f += g*2 = %s" % f) == "f += g*2 = 5/3"

# def test12():
#     f -= g * 2
#     assert ("f -= g*2 = %s" % f) == "f -= g*2 = 1/3"
