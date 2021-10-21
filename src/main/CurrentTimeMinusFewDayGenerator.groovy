package main
// От текущей даты в формате dd.MM.yyyy вычитается 150 дней
def now = new Date();
def past = now - 150;
println(past.format("dd.MM.yyyy' '00:00:00"));  //=>25.04.2021 00:00:00
