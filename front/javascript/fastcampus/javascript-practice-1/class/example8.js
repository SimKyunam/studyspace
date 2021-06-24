// 변수, 함수 추가 및 오버라이딩

class Parent{
    name = 'lee';

    hello(){
        console.log('hello', this.name);
    }

    hello1 = () => console.log('hello1', this.name);

    hello2 = function(){
        console.log('hello3', this.name);
    }
}
// new Parent().hello();
// new Parent().hello1();
// new Parent().hello2();

class Child extends Parent{
    age = 37;

    hello(){
        console.log('hello', this.name, this.age);
    }
}

const p = new Parent();
const c = new Child();

console.log(p,c);
c.hello();
c.name = 'Anna';
c.hello();