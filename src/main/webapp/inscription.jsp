<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>SportFlow - Inscription</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">

    <style>

        .hero {
            position: relative;
            height: 100vh;
            background: url('bckg.jpeg') no-repeat center center/cover;
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
                <li class="nav-item"><a class="nav-link" href="home.jsp">ACCUEIL</a></li>
                <li class="nav-item"><a class="nav-link" href="services.jsp">SERVICES</a></li>
                <li class="nav-item"><a class="nav-link active" href="inscription.jsp">INSCRIPTION</a></li>
                <li class="nav-item"><a class="nav-link" href="connexion.jsp">CONNEXION</a></li>
            </ul>
        </div>
    </div>
</nav>


<section class="hero">
    <div class="container">
        <h1 class="text-white fw-bold">Inscrivez-vous à <span class="text-warning">SPORTFLOW</span></h1>
        <p class="text-light lead">Remplissez ce formulaire pour rejoindre notre club !</p>

        <div class="row justify-content-center">
            <div class="col-md-6">
                <form class="bg-dark text-light p-4 rounded">
                    <div class="mb-3">
                        <label class="form-label">Nom</label>
                        <input type="text" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Prénom</label>
                        <input type="text" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Email</label>
                        <input type="email" class="form-control" required>
                    </div>
                    <div class="mb-3">
                        <label class="form-label">Mot de passe</label>
                        <input type="password" class="form-control" required>
                    </div>
                    <button type="submit" class="btn btn-warning w-100">S'inscrire</button>
                </form>
            </div>
        </div>
    </div>
</section>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
