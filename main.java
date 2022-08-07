function start () {
    var butt = document.getElementsByTagName('button')[0];
    var rnImg = document.getElementsByClassName('rndmImage')[0]; //Change selector to existing class and select the first (the only) one
    var pictures = document.getElementsByTagName('img');

    butt.addEventListener('click', menjaj, false);

    function menjaj (e) {
        // var new = e.button;// 'new' is reserved word in JS, you can't use it as variable name
        // var btn = e.button;// but this line is useless
        var choose = Math.floor(Math.random() * pictures.length); //better move this line inside this function to get rundom image every button clicks

        var img = document.createElement('img'); //creates new img tag
        img.src = pictures[choose].src;
        rnImg.innerHTML = ''; //to delete previous image
        rnImg.appendChild(img);
        // var img = []; //useless lines of code

        // for(var i = 0; i< pictures.length; i++) {
        //     var dodaj = img[i];
        //     img.push(dodaj);
        // }

        //ekran.src = 'slike/' + slike[izbor] + '.jpg';
    }
}
