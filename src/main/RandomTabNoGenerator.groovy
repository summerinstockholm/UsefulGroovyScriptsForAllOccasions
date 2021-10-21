package main
// Строка РИЗП- + рандомное число
def randomValue = (Math.abs(new Random().nextInt()) % 600000000 + 1);
def newRandomValue = "РИЗП-" + randomValue;
println(newRandomValue);    //=>РИЗП-70573487
return(newRandomValue);

