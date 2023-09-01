<!DOC TYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Калькулятор ккал</title>
    <link type=text/css href="/calorieCalculatorStyle.css" rel="stylesheet">
</head>
<body>
<header><a class="headerA" href="/calorie-calculator">Калькулятор калорий</a></header>
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
На этой странице вы сможете рассчитать свою суточную норму калорийности исходя из вашей активности, веса, возраста, роста
и пола. Просто заполните форму и нажмите кнопку "Рассчитать". Программа рассчитает вашу норму калорий и выведет таблицу
в зависимости от выбранного вами пола.
</div>
</div>
<div class="hint">Для расчета калорийности заполните форму ниже.</div>
    <form method="post">
        Введите ваш возраст:<br><input type="number" value="${age}" name="age" required min="1" max="100" placeholder="Возраст" size="5"/><br><br>
        Введите ваш вес в киллограммах:<br><input type="number" value="${weight}" required min="1" max="200" placeholder="Вес" name="weight" size="5"/><br><br>
        Введите ваш рост в сантиметрах:<br><input type="number" value="${height}" required min="1" max="250" placeholder="Рост" name="height" size="5"/><br><br>
        <#if sex="">
        Выберите ваш пол:<br><select name="floor">
                            <option value="man">Мужской</option>
                            <option value="women">Женский</option>
                          </select><br>
        <#elseif sex="women">
        Выберите ваш пол:<br><select name="floor">
                                    <option value="women">Женский</option>
                                    <option value="man">Мужской</option>
                                  </select><br>
        <#elseif sex="man">
        Выберите ваш пол:<br><select name="floor">
                                            <option value="man">Мужской</option>
                                            <option value="women">Женский</option>
                                          </select><br>
        </#if>
        <center><input type="submit" value="Рассчитать"/></center>
    </form>
<#if sex == "man">
    <table border="1" cellpadding="5">
        <tr>
            <th>Активность</th>
            <#list ratio as el>
                <th>${el}</th>
                </#list>
        </tr>
        <tr>
            <th>Поддержание веса</th>
            <#list maintenanceManActivity as el>
                <th>${el}Ккал</th>
                </#list>
            </tr>
            <tr>
            <th>Набор веса</th>
                <#list setManActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
            </tr>
            <tr>
            <th>Сброс веса</th>
                <#list dialManActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
            </tr>
    </table>
    </#if>
<#if sex == "women">
       <table border="1" cellpadding="5">
            <tr>
                <th>Активность</th>
                <#list ratio as el>
                    <th>${el}</th>
                    </#list>
            </tr>
            <tr>
                <th>Поддержание веса</th>
                <#list maintenanceWomenActivity as el>
                    <th>${el}Ккал</th>
                    </#list>
                </tr>
                <tr>
                <th>Набор веса</th>
                    <#list setWomen as el>
                        <th>${el}Ккал</th>
                        </#list>
                </tr>
                <tr>
                <th>Сброс веса</th>
                    <#list dialWomen as el>
                        <th>${el}Ккал</th>
                        </#list>
                </tr>
        </table>
</#if>
</body>
</html>