package main
// Рандомное числовое значение аля 1234565065
def randomvalue = new Random().nextInt()%60000 + 1234567890;    //=>1234542964
println(randomvalue);
