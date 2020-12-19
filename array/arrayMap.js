const numbers = [1, 2, 3, 4, 5, 6, 7, 8];
const square = (n) => n * n;
const squared = numbers.map(square); //return
console.log(squared);

const items = [
    {
        id: 1,
        text: 'hello',
    },
    {
        id: 2,
        text: 'bye',
    },
];
const texts = items.map((item) => item.text);
console.log(texts);
