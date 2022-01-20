<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.84.0">
    <title>ZOO FARM</title>

    <!-- Bootstrap core CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <meta name="theme-color" content="#525cb3">


</head>
<body>


<main>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">ANIMALS</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">ALL HABITAT </a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="album py-5 bg-light">
        <div class="container">

            <i><h1 class="text-center mt-4">ZOO FARM</h1></i>

            <div class="row row-cols-1 row-cols-sm-2 row-cols-md-1 g-3 mt-2">
                <#list habitats as habit>
                    <div class="col">
                        <div class="card shadow-sm">
                            <div class="card">
                                <h5 class="card-header">Habitat: ${habit.getName()}</h5>
                                <div class="card-body">
                                    <h5 class="card-title">Spaces available: ${habit.getSize()}</h5>
                                    <p class="card-text">
                                        <span>Animal name:</span>
                                        <#list habit.animals as animal>
                                            <strong>${animal.getName()}, ${animal.getComfortableSpace()}</strong>
                                        </#list>
                                    </p>
                                    <a class="btn btn-primary" href="/animal/${habit.getId()}">Create new animal</a>
                                </div>
                            </div>
<#--                            <div class="card-body">-->
<#--                                <strong><p class="card-text">Habitat: ${habit.getName()}</p></strong>-->
<#--                                <span class="text-muted">Animal name:</span>-->
<#--                                <#list habit.animals as animal>-->
<#--                                    <span class="text-muted">${animal.getName()}, ${animal.getComfortableSpace()}</span>-->
<#--                                </#list>-->
<#--                                <div class="d-flex justify-content-between align-items-center">-->
<#--                                    <span >Comfortable space: ${habit.getSize()}</span>-->
<#--                                </div>-->
<#--                                <button type="button" class="text-center btn btn-link">-->
<#--                                    <a class="btn btn-primary" href="/animal/${habit.getId()}">Create new animal</a>-->
<#--                                </button>-->
<#--                            </div>-->
                        </div>
                    </div>
                </#list>
            </div>

                <a href="/habitat" class="btn text-center btn-success">Create new habitat for animal</a>

        </div>
    </div>

</main>
<footer class="text-muted py-5">
    <div class="container">
        <p class="mb-1">MADE BY AMANGELDI ASYLZHAN</p>
    </div>
</footer>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

</body>
</html>
