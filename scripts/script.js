var infData = new Date()
var hora = infData.getHours()
var teste = window.document.querySelector('h1#titulo')
window.document.body.addEventListener('load', carregar)

var fundo = document.body.style

function carregar() {
    if (hora > 6 && hora < 18) {
        fundo.backgroundImage = 'url(../pictures/dia.png)'
    }
}