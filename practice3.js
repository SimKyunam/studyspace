//함수에 this는 자신이 속해있는 것을 가르킨다.
//화살표 함수는 this가 뭔지 모른다.

const dog = {
    name: '멍멍이',
    sound: '멍멍!',
    say: function () {
        console.log(this.sound);
    },
};

const cat = {
    name: '야옹이',
    sound: '야옹~',
};

cat.say = dog.say;
dog.say();
cat.say();
