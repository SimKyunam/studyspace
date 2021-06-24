
class A{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
}

console.log(new A('Mark', 30));

// class field 는 런타임 확인

class B {
    name;
    age;
}

console.log(new B());

class C {
    name = 'no name';
    age = 0;

    constructor(name, age){
        this.name = name;
        this.age = age;
    }
}

console.log(new C('Mark', 30));