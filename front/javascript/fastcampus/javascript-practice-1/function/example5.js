// 생성자 함수를 이용하여 객체 생성

function Person(name, age){
    console.log(this);
    this.name = name;
    this.age = age;
}

const p = new Person('Mark', 37);

console.log(p, p.name, p.age);

const a = new Person('Anna', 20);

console.log(a, a.name, a.age);

//익명함수에는 this(객체)를 생성하지 못함.
const Cat = (name, age) => {
    console.log(this);
    this.name = name;
    this.age = age;
}

const c = new Cat('냥이', 1);