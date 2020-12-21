const purpleCuteSlime = {
    name: '슬라임',
    attribute: 'cute',
    color: 'purple',
};
const { color, ...cuteSlime } = purpleCuteSlime;
console.log(color);
console.log(cuteSlime);

const { attribute, ...slime } = cuteSlime;
console.log(attribute);
console.log(slime);
