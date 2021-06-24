//함수를 호출하면 함수를 만들어서 리터

function plus(base){
    return function(num){
        return console.log(base + num);
    }
}

const plus5 = plus(5);
plus5(10);

const plus7 = plus(7);
plus7(8);