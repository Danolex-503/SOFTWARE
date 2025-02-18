from car import Car 
from account import account 
from uberX import UberX
from user  import User

if __name__=="__main__" :
    print("Inicialiizando las info de los carros ")
    print("car")

    car = car ("AMS256", Account("Leonardo Daniel", "ASD12365","leopequerbi@gmail.com", "2563"))
    print (vars(car))
    print(vars(car.driver))

    print("UberX")
    uberX = UberX("KLO365", Account("Marco Aurelio", "SGHJ1236", "leopequerbi2@gmail.com", "7856"), "Toyota", "Corolla" )
    print(vars(uberX))
    print(vars(uberX.driver))

    print("User")
    user = User("Mario castellano", "SDFG125F","mariocas@gmail.com", "7856")
    print(vars(user))
