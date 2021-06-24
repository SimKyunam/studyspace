const deepObject = {
    state: {
        information: {
            name: 'velopert',
            languages: ['korean', 'english', 'chinese'],
        },
    },
    value: 5,
};

//비구조 할당
// const { name, languages[first, second] } = deepObject.state.information;
// const { value } = deepObject;

const {
    state: {
        information: { name, languages },
    },
    value,
} = deepObject;

const extracted = {
    name,
    languages,
    value,
};
console.log(extracted);
