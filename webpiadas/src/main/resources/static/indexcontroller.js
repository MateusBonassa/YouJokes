function ver_piada()
{
    const URL_TO_FETCH = '/apis/testar-acesso';
    fetch(URL_TO_FETCH, {method: 'POST',
       headers:{'Authorization':`${localStorage.getItem("token")}`,}})
    .then(response=> response.text())
    .then(result=>{ alert(result); })
    .catch(err=> console.error(err));

    
    // usar a fetch API para recuperar uma piada aleatória do banco
    // para isso termos que executar o serviço/rota a ser
    // definida no backend
    //alert("Sua Piada solicitada!");
}
function logar() {
    const URL_TO_FETCH = '/security/autenticar';
    const data = new URLSearchParams();
    for (const pair of new FormData(document.getElementById('fdados'))) {
     data.append(pair[0], pair[1]);
    }
    
    fetch(URL_TO_FETCH, {method: 'post', body: data })
     .then(response=>{ if(response.ok) return response.text(); else throw Error("erro") })
     .then(text => {alert(text); localStorage.setItem("token", text);})
     .catch(err => alert(err.message)) 
}
