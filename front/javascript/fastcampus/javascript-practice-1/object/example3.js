const a = {
    name: 'Mark',
    hello1(){
        console.log('hello1', this.name);
    },
    hello2: function(){
        console.log('hello2', this.name);
    },
    hello3: () => console.log('hello3', this.name) //에로우 평선은 this를 인식하지 못한다.
}

a.hello1(); //Mark
a.hello2(); //Mark
a.hello3(); //undefined