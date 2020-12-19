const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];

const concated = arr1.concat(arr2); //기존 배열 건드리지 않는다.
console.log(arr1); //[1, 2, 3]
console.log(arr2); //[4, 5, 6]
console.log(concated);
