// static 변수, 함수

class A {
    static age = 37;
    static hello(){
        console.log(A.age);
    }
}

console.log(A, A.age);
A.hello();

class B {
    age = 37;
    static hello(){
        console.log(this.age);
    }
}

console.log(B, B.age); //age 변수가 static이 아니라 undefined;
B.hello();  //age 변수가 static이 아니라 undefined;
// new B().hello(); //static이 아니라서 에러 발생

class C {
    static name = '이 클래스의 이름을 C가 아니다.'
}

console.log(C);