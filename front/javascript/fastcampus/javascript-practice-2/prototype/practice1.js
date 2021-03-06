function Animal(type, name, sound) {
    this.type = type;
    this.name = name;
    this.sound = sound;
}

//함수
Animal.prototype.say = function () {
    console.log(this.sound);
};

//변수도 가능
Animal.prototype.sharedValue = 1;

const dog = new Animal('개', '멍멍이', '멍멍');
const cat = new Animal('고양이', '야옹이', '야옹');

dog.say();
cat.say();
