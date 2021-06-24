function countBiggerThanTen(numbers) {
    /*
    //foreach
    let count = 0;
    numbers.forEach((number) => {
        if (number > 10) {
            count++;
        }
    });
    return count;
    */
    /*
    //filter
    let countArray = numbers.filter((number) => number > 10);
    return countArray.length;
    */
    /*
    //reduce
    let count = numbers.reduce((acc, current) => {
        if (current > 10) {
            acc++;
        }
        return acc;
    }, 0);
    return count;
    */
}

const count = countBiggerThanTen([1, 2, 3, 4, 5, 10, 20, 30, 40, 50, 60]);
console.log(count); // 5
