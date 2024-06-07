<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create new Tutorial</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h2>Employee affectation</h2>
    <form action="saveTutorial" method="post">
        <div class="form-group">
            <label for="name">Employee Name</label>
            <input type="text" class="form-control" id="name" name="name" placeholder="Name">
        </div>

        <div class="form-group">
            <label for="pname">Project Name</label>
            <select class="form-control" id="pname" name="pname">
                <option value="1">adidas</option>
                <option value="2">CTM</option>
                <option value="3">stell</option>
                <option value="4">Nestle</option>
            </select>
        </div>

        <button type="submit" class="btn btn-primary">affecter le projet</button>

    </form>
</div>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
