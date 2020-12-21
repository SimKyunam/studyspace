//배열에서에 rest는 맨 마지막에 있어야한다
const numbers = [1, 2, 3, 4, 5, 6];
const [one, two, ...rest] = numbers;
console.log(one);
console.log(two);
console.log(rest);
