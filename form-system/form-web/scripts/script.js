var infData = new Date()
var hora = infData.getHours()
var teste = window.document.querySelector('h1#titulo')
window.document.body.addEventListener('load', carregar())
var noturno = document.head
var conta = window.matchMedia('(prefers-color-scheme: dark)')? 0: 1
if(conta%2 != 0){
    Numsei.href = 'style-dia.css'
} else {
    Numsei.href = ''
} 
function troca() {
    var Numsei = document.head.getElementsByClassName('css-dia')[0]
    if(conta%2 != 0){
        Numsei.href = 'style-dia.css'
    } else {
        Numsei.href = ''
    } 
    conta++ 
}


function carregar() {
    var fundo = document.body
    
    if (hora > 5 && hora < 18) {
        //mudar o css do fundo e das cores do form, .entrar, .legenda e h1
    }
}