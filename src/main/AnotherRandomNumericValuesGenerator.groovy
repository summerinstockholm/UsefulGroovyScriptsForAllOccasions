package main
// Генарация рандомного числа другим способом через Math.
def randomValue = (Math.abs(new Random().nextInt()) % 600000000 + 1);
print(randomValue); //=>20532039