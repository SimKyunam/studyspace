//배열 자체를 바꿔버림

const numbers = [10, 20, 30, 40];

// let value = numbers.shift(); //index 0부터 빠짐
// value = numbers.shift();
// value = numbers.shift();
// value = numbers.shift();

// let value = numbers.pop(); //index 끝부터 빠짐

let value = numbers.unshift(5); //index 0부터 넣음

value = numbers.push(50); //index 끝에서 넣음

console.log(value);
console.log(numbers);
