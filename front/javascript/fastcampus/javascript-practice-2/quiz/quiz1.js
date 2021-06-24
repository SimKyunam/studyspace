function biggerThanThree(numbers) {
    return numbers.filter((number) => number > 3);
}

const numbers = [1, 2, 3, 4, 5, 6, 7];
console.log(biggerThanThree(numbers));
