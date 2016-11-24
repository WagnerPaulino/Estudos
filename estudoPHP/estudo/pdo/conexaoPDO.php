<?php

$host = "localhost";
	$user = "root";
	$pass = "wps";
	$dbname = "teste";
	try{
	$con = new PDO("mysql:host=$host;dbname=$dbname",$user,$pass);
	if ($con){
		echo "conectado com sucesso";
	}
	
	}catch (PDOException $e){
		var_dump($e);/*retorna a extrutura da variavel que contém o erro*/
		echo $e->getMessage();/*Retorna a mensagem do erro*/
		echo $e->getCode();/*Retorna o codigo do erro*/
	}

	$nome=$_GET["nome"];
	$idade=$_GET["idade"];
	$sql="insert into cliente(nome, idade) values(:nome, :idade)";
	$busca=$con->prepare($sql);/*prepara o comando sql*/
	$busca->bindValue(":nome",$nome);/*define os valores*/ 
	$busca->bindValue(":idade",$idade);
	
	$validar=$con->prepare("select * from cliente where nome=?");
	$validar->execute(array($nome));/*pode passar os parametro assim tambem*/

	if($validar->rowCount() == 0){
	$busca->execute();
	echo "Cadastro efeituado";
	}else{
	echo "valor já existe";
	}

?>