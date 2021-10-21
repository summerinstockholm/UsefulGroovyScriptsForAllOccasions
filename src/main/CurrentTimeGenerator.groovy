package main
// Выводит текущую дату в формате: yyyy-MM-ddTHH:mm:ss+03:00
def now = new Date();
println(now.format("yyyy-MM-dd'T'HH:mm:ss'+03:00'"));   //=>2021-09-22T20:30:28+03:00


