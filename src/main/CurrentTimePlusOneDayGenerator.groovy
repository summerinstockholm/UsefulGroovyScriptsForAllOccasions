package main
// Выводит текущую дату в формате: yyyy-MM-ddTHH:mm:ss+03:00 но уже на завтрашний день.
def now = new Date();
def tomorrow = now + 1;
println(tomorrow.format("yyyy-MM-dd'T'HH:mm:ss'+03:00'"));  //=>2021-09-23T20:32:00+03:00
