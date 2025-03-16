<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SportFlow - Accueil</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">

    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
        }

        .hero {
            position: relative;
            height: 100vh;
            background: url('add.jpg') no-repeat center center/cover;
            display: flex;
            align-items: center;
            justify-content: center;
            text-align: center;
        }

        .hero::before {
            content: "";
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            background: rgba(0, 0, 0, 0.5);
        }
        .hero .container {
            position: relative;
            z-index: 1;
        }
    </style>

</head>
<body>


<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
        <a class="navbar-brand" href="#">SportFlow</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active" href="home.jsp">ACCUEIL</a></li>
                <li class="nav-item"><a class="nav-link" href="services.jsp">SERVICES</a></li>
                <li class="nav-item"><a class="nav-link" href="inscription.jsp">INSCRIPTION</a></li>
                <li class="nav-item"><a class="nav-link" href="connexion.jsp">CONNEXION</a></li>
            </ul>
        </div>
    </div>
</nav>


<section class="hero d-flex align-items-center justify-content-center text-center">
    <div class="container">
        <h1 class="text-white fw-bold">Bienvenue dans votre club <span class="text-warning">SPORTFLOW</span></h1>
        <p class="text-light lead">Profitez avec nous de nombreux sports au sein du club, il suffit de vous inscrire.</p>
        <a href="inscription.jsp" class="btn btn-light btn-lg mt-3">Suivre >></a>
    </div>
</section>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>