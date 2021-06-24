//*var, function 선언부만* 최상단으로 올라오게 한다.

console.log(name); // Woong이 안찍히고 undefinde가 찍힌다.

name = 'Mark';

console.log(name);

var name = 'Woong'; 