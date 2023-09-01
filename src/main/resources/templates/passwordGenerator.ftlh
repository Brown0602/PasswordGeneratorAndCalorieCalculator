<!DOC TYPE html>
<html>
<head>
<meta http-equiv="Cache-Control" content="private" charset="utf-8">
<title>Генератор паролей</title>
<link type=text/css href="/passwordGeneratorStyle.css" rel="stylesheet">
</head>
<body>

<header><a class="headerA" href="/password-generator">Password Generator</a></header>

<div class="hint">Для генерации пароля заполните форму ниже и нажмите кнопку "Сгенерировать пароль".<br>
Программа придумает пароли на основе выбранных и введенных параметров.</div>

<div class="navigation">

<div class="navigationText">
Навигация по сайту:
</div>


<a class="a1" href="/password-generator">Генератор паролей</a><br>
<!-- <a class="a2" href="/new-password-generator">Новый генератор паролей</a><br> -->
<!-- <a class="a3" href="/guess-the-number">Угадай число</a><br> -->
<a class="a4" href="/calorie-calculator">Калькулятор калорий</a>


<div class="aboutTheSite">
О странице:
</div>
<div class="description">
На этой странице вы сможете сгенерировать себе безопасный пароль из предложенных параметров.
Максимальная длина пароля 32 символа. Программа после запуска генератора выдаст 16 сгенерированных паролей.
Если вам не понравились сгенерированные пароли, то вы можете снова выполнить запуск программы с сохранностью ваших
параметров.
</div>
</div>
<br>
<div class="formGeneratedPassword">
<div class="PasswordGenerator">Генератор паролей</div><br>
<form method="post">
    Параметры генератора:<br><br>
        Введите длину пароля:<br><input class="password_length" placeholder="Длина пароля" type="number" value="${password_length}" required min="1" max="32" name="password_length"/><br>
        Введите количество паролей:<br><input class="number_passwords" placeholder="Количество паролей" type="number" value="${number_passwords}" required min="1" max="16" name="number_passwords"/><br><br>
<#if numbers == "">
    <label><input type="checkbox" name="numbers" value="numbers"/>Цифры</label><br>
    <#else>
    <label><input type="checkbox" ${checked} name="numbers" value="numbers"/>Цифры</label><br>
    </#if>
<#if uppercase == "">
    <label><input type="checkbox" name="uppercase" value="uppercase"/>Прописные буквы</label><br>
    <#else>
    <label><input type="checkbox" ${checked} name="uppercase" value="uppercase"/>Прописные буквы</label><br>
    </#if>
<#if lowercase == "">
    <label><input type="checkbox" name="lowercase" value="lowercase"/>Строчные буквы</label><br>
    <#else>
    <label><input type="checkbox" ${checked} name="lowercase" value="lowercase"/>Строчные буквы</label><br>
    </#if>
<#if special_characters == "">
    <label><input type="checkbox" name="special_characters" value="special_characters"/>Спецсимволы: %, *, ), ?, @, #, $, ~</label><br><br>
    <#else>
    <label><input type="checkbox" ${checked} name="special_characters" value="special_characters"/>Спецсимволы: %, *, ), ?, @, #, $, ~</label><br><br>
    </#if>
    <center><input type="submit" value="Сгенерировать пароль"/></center>
    </form>
    </div>
<#if numbers == "" && uppercase == "" && lowercase == "" && special_characters == "">
<div class="error">${error}</div>
<#else>
<div class="generatedPasswords">
Ваши сгенерированные пароли:<br>
<#list results as el>
<div class="el">
${el}
</div>
</#list>
</div>
</#if>
</body>
</html>