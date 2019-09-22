<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; meta= UTF-8" >
<link rel="stylesheet" type="text/css" href="CSS/style.css" >
<title>Loja - Cadastro</title>
</head>
<body>
		<div class="container">
		<header>
			<div class=top> 
				<h1> Cadastro </h1>
			</div>
		</header>
		<main>

				<h3>Formulário de Cadastro:</h3>
				<form action="Cadastro" class="form" method="post">
					<label for="name">Nome:</label>
					<input type="text" name="name" id="name">
					<label for="email">Email:</label>
					<input type="email" name="email" id="email">
					<label for="endereco">Endereço:</label>
					<input type="text" name="endereco" id="endereco">
					<label for="dataNascimento">Data de Nascimento:</label>
					<input type="date" name="dataNascimento" id="date">
					<input type="submit" value="Gravar">
				</form>	
		</main>

		<aside>
			<div class="menu_lateral">
				<ul>
					<li><a href="index.jsp">HOME</a></li>
					<li><a href="contato.jsp">CONTATO</a></li>
					<li><a href="produtos.jsp">PRODUTOS</a></li>
					<li><a href="cadastro.jsp">CADASTRO</a></li>
				</ul>
			</div>
		</aside>

		<footer>
			<div class="rodape">
	            Todos os direitos reservados © 2019<br/>
	            Desenvolvido por Ricardo Ferreira
	        </div>
		</footer>
	</div>

	
</body>
</html>