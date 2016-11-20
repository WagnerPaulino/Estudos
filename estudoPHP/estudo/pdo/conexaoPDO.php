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
?>
