<DOCK TYPE html>
<html>
<head>
<link type=text/css href="/newPasswordGeneratorStyle.css" rel="stylesheet">
<meta charset="utf-8">
</head>
<body>
<header>
<h1>Генератор паролей на основе ваших символов</h1>
</header>
<form method="post">
<div class="headForm">
Генератор паролей на основе ваших символов
</div>
<div class="input">
<label><input type="text" name="chars" required value="${chars}" placeholder="Введите символы"/></label><br><br>
<label><input type="number" name="passwordLength"  value="${passwordLength}" required max="32" placeholder="Введите длину пароля"/></label><br><br>
</div>
<label><input type="submit" value="Сгенерировать пароль"/></label><br>
<a href="/password-generator">Главная страница</a>
<#if str == "true">
<div class="results">
Ваши сгенерированные пароли:
</div>
<#list results as el>
<div class="el">
-${el}
</div>
</#list>
</#if>
</form>
</body>
</html>