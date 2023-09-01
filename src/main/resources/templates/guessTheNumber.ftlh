<DOCK TYPE html>
<html>
<head>
<link type=text/css href="/guessTheNumberStyle.css" rel="stylesheet">
<meta charset="utf-8">
</head>
<body>
<header>
Игра "Угадай число"
</header>
<form method="post">
Правила:<br>
-Введите число "2", "3", "5" или "50".<br>
Если введенное вами число и число которое загадал компьютер из этих четырех чисел совпадет, то вы выиграли, если нет, то проиграли.<br>
<input type="number" value="${number}" placeholder="Введите число" required name="number"/><br>
<input type="submit" value="Угадать"/><br>
<#if number == "2" || number == "3" || number == "5" || number == "50">
Число которое загад компьютер: ${indexNumber}<br>
Ваше число: ${number}<br>
${win}<br>
<#else>
${errorNumber}<br>
</#if>
<a href="/password-generator">Главная страница</a><br>
</form>
</body>
</html>