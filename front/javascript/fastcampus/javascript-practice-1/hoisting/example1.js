//hoisting 아래에서 선언해도 위에서 사용할 수 있는 것!

function hello(){
    console.log('hello');
}

hello();
hello2();

function hello2(){
    console.log('hello2');
}