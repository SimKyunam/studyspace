function isAnimal(text) {
    // return (
    //     text === '고양이' ||
    //     text === '개' ||
    //     text === '거북이' ||
    //     text === '너구리'
    // );

    const animals = ['고양이', '개', '거북이', '너구리'];
    return animals.includes(text);
}
console.log(isAnimal('개'));
console.log(isAnimal('노트북'));

function getSound(animal) {
    const sounds = {
        개: '멍멍!',
        고양이: '야옹~',
        참새: '짹짹',
        비둘기: '구구 구 구',
    };
    return sounds[animal] || '...?';

    // switch (animal) {
    //     case '개':
    //         return '멍멍';
    //     case '고양이':
    //         return '야옹';
    //     case '참새':
    //         return '짹짹';
    //     case '비둘기':
    //         return '구구 구구';
    //     default:
    //         return '...';
    // }

    // if (animal === '개') return '멍멍!';
    // if (animal === '고양이') return '야옹';
    // if (animal === '참새') return '짹짹';
    // if (animal === '비둘기') return '구구 구구';
    // return '...';
}

console.log('개');
console.log('비둘기');
console.log('인간');

function makeSound(animal) {
    const tasks = {
        개: () => {
            console.log('멍멍!');
        },
        고양이() {
            console.log('야옹');
        },
        비둘기: function () {
            console.log('구구 구 구');
        },
    };

    const task = tasks[animal];
    if (!task) {
        console.log('...');
        return;
    }
    task();
}
