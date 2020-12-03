// arrow 함수 (익명 함수에서만 가능!)
let name = '홍길동';
let age = 10;

const hello1 = () => {
    console.log('hello1');
}

const hello2 = name => {
    console.log('hello2', name);
}

const hello3 = (name, age) => {
    console.log('hello2', name, age);
}

const hello4 = name =>{
    return `hello ${name}`;
}

const hello5 = name => `hello ${name}`;

hello1();
hello2(name);
hello3(name, age);
hello4(name);
hello5(name);