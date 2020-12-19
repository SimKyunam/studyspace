const doggy = {
    name: '멍멍이',
    sound: '멍멍',
    age: 2,
};

console.log(Object.entries(doggy)); //객체를 배열로 (키, value가 배열 1개)
console.log(Object.keys(doggy)); //객체 키를 배열로
console.log(Object.values(doggy)); //객체 value를 배열로

for (let key in doggy) {
    console.log(`${key}: ${doggy[key]}`);
}
