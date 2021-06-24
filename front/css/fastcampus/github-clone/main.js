(function (window, document){
    'use strict';

    const $toggles = document.querySelectorAll('.toggle');
    const $togglesBtn = document.getElementById('toggle-btn');

    $togglesBtn.addEventListener('click', () => toggleElements());

    window.addEventListener('resize', () => {
        if(window.innerWidth > 1024){
            offElements();
        }
    });

    function toggleElements(){
        [].forEach.call($toggles, (toggle) => toggle.classList.toggle('on'));
    }

    function offElements(){
        [].forEach.call($toggles, (toggle) => toggle.classList.remove('on')); 
    }
})(window, document)