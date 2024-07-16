<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Select Condiments</title>
</head>
<body>
<h1>Select Condiments</h1>
<form action="/sandwichs/list" method="post">
    <label><input type="checkbox" name="lettuce" value="lettuce"> Lettuce</label>
    <label><input type="checkbox" name="tomato" value="tomato"> Tomato</label>
    <label><input type="checkbox" name="mustard" value="mustard"> Mustard</label>
    <label><input type="checkbox" name="sprouts" value="sprouts"> Sprouts</label>
    <input type="submit" value="Submit">
</form>
</body>
</html>
