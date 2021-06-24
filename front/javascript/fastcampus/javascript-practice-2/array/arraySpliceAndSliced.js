const numbers = [10, 20, 30, 40];
// const index = numbers.indexOf(30);
// const spliced = numbers.splice(index, 2); //기존 배열 수정한다.

// console.log(spliced);
// console.log(numbers);

const sliced = numbers.slice(0, 2); //기존 배열 안건드린다.
console.log(sliced);
console.log(numbers);
