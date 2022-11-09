<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Cadastro</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript">
  
  	$(document).ready(function() {
		$("#btnEnviar").click(function() {
			var frmData = $("#frmCadastro").serialize();
			$("#msg").html("Enviou:" + frmData);
			$.ajax({
				url: "respondedorCadastro.jsp",
				data: frmData,
				type: "POST",
				success: function( data ) {
					$("#msg").html( $("#msg").html()+"<br>Retornou:" + data);
				}
			});
		});
	});
  
  </script>
</head>
<body>

<div class="container">
  <h2>Cadastrar novo usuário</h2>
  <form  id="frmCadastro">
  	<div class="form-group">
      <label for="nome">Nome:</label>
      <input type="nome" class="form-control" id="nome" placeholder="Digite seu  Nome" name="nome">
    </div>
    <div class="form-group">
    <label class="visually-hidden" for="inlineFormSelectPref">Nível</label>
    <select class="select" id="nivel" name="nivel">
      <option value="1" default>Um</option>
      <option value="2">Dois</option>
      <option value="3">Três</option>
    </select>
  </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Digite seu  email" name="email" required>
    </div>
    <div class="form-group">
      <label for="cpf">CPF:</label>
      <input type="cpf" class="form-control" id="senha" placeholder="Digite seu CPF:" name="cpf" required>
    </div>
    <div class="form-group">
      <label for="end">Endereço:</label>
      <input type="end" class="form-control" id="end" placeholder="Digite seu Endereço:" name="end">
    </div>
    <div class="form-group">
      <label for="bairro">Bairro:</label>
      <input type="bairro" class="form-control" id="bairro" placeholder="Digite seu Bairro:" name="bairro">
    </div>
    <div class="form-group">
      <label for="cidade">Cidade:</label>
      <input type="cidade" class="form-control" id="cidade" placeholder="Digite sua Cidade:" name="cidade">
    </div>
    <div class="form-group">
    <label class="visually-hidden" for="inlineFormSelectPref">UF:</label>
    <select class="select" id="uf" name="uf">
      <option value="RO" default>RO</option>
      <option value="AC">AC</option>
      <option value="AM">AM</option>
      <option value="RR">RR</option>
      <option value="PA">PA</option>
      <option value="AP">AP</option>
      <option value="TO">TO</option>
      <option value="MA">MA</option>
      <option value="PI">PI</option>
      <option value="CE">CE</option>
      <option value="RN">RN</option>
      <option value="PB">PB</option>
      <option value="PE">PE</option>
      <option value="AL">AL</option>
      <option value="SE">SE</option>
      <option value="BA">BA</option>
      <option value="MG">MG</option>
      <option value="ES">ES</option>
      <option value="RJ">RJ</option>
      <option value="SP">SP</option>
      <option value="PR">PR</option>
      <option value="SC">SC</option>
      <option value="RS">RS</option>
      <option value="MS">MS</option>
      <option value="MT">MT</option>
      <option value="GO">GO</option>
      <option value="DF">DF</option>
    </select>
  </div>
  <div class="form-group">
      <label for="CEP">CEP:</label>
      <input type="cidade" class="form-control" id="cidade" placeholder="Digite seu CEP:" name="CEP">
    </div>
  <div class="form-group">
      <label for="telefone">Telefone:</label>
      <input type="telefone" class="form-control" id="telefone" placeholder="Digite seu telefone" name="telefone">
    </div>
    <button type="button"  id="btnEnviar"class="btn btn-primary">Enviar</button>
    
  </form>
  <div id="msg"></div>
  
</div>

</body>
</html>
