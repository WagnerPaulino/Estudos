function cadastrar(){
    var pessoa = '';
   pessoa = 
       {
           nome: document.getElementById('innome').value,
           tipo: document.getElementById('intipo').value,
       };
    var json = JSON.stringify(pessoa);
    req = new XMLHttpRequest();
    req.open("POST","http://localhost:8092/crud-rest-spring-boot/api/pessoas",true);
    req.setRequestHeader("Content-type", "application/json");
    req.send(json);
    alert(json);
}