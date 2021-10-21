package main
// Рандомно выбирает из массива брэнч код. По сути можно переделать под любое содержимое массива.
def branchCodeList = ['01501', '01502', '01505', '01507', '01508'];
Random rnd = new Random()
randomBranchCode = branchCodeList[rnd.nextInt(branchCodeList.size())];
println(randomBranchCode);
return randomBranchCode;
