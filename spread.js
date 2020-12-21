const slime = {
    name: '슬라임',
};

const cuteSlime = {
    ...slime,
    // name: '슬라임',
    attribute: 'cute',
};

const purpleCuteSlime = {
    ...cuteSlime,
    // name: '슬라임',
    // attribute: 'cute',
    color: 'purple',
};

const greenCuteSlime = {
    ...purpleCuteSlime, //기존에 있는 속성이 들어옴. 위치 바꾸면 color가 안바뀜
    // name: '슬라임',
    // attribute: 'cute',
    color: 'green',
};

//객체에 할당하는 경우
//모든 객체가 동일한 값을 가짐.
// cuteSlime = slime;
// cuteSlime.attribute = 'cute';

// purpleCuteSlime = cuteSlime;
// purpleCuteSlime.color = 'purple';

console.log(slime);
console.log(cuteSlime);
console.log(purpleCuteSlime);
console.log(greenCuteSlime);
