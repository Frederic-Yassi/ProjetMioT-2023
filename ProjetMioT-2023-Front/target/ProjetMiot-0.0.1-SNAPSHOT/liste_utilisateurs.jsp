<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Table - Brand</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
    <link rel="stylesheet" href="assets/css/-Login-form-Page-BS4-.css">
</head>

<body id="page-top">
    <div id="wrapper">
        <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion p-0" style="background-color: rgb(0,101,46);">
            <div class="container-fluid d-flex flex-column p-0">
                <a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                    <div class="sidebar-brand-icon rotate-n-15"><i class="fas fa-recycle"></i></div>
                    <div class="sidebar-brand-text mx-3"><span>Poubelle 2.0</span></div>
                </a>
                <hr class="sidebar-divider my-0">
                <ul class="nav navbar-nav text-light" id="accordionSidebar">
                   <c:if test="${utilisateur.getRole()==\"Locataire\" || utilisateur.getRole()==\"Proprietaire\" }">
                    	<li class="nav-item" role="presentation"><a class="nav-link active" href="etat_poubelle"><i class="fas fa-tachometer-alt"></i><span>Etat des poubelles</span></a></li>
                    </c:if>
                    <c:if test="${utilisateur.getRole()==\"Locataire\" || utilisateur.getRole()==\"Proprietaire\" || utilisateur.getRole()==\"Eboueur\" || utilisateur.getRole()==\"Admin\"}">
                    	<li class="nav-item" role="presentation"><a class="nav-link" href="profil"><i class="fas fa-user"></i><span>Profil</span></a></li>
                    </c:if>
                    <c:if test="${utilisateur.getRole()==\"Admin\" }">
                    	<li class="nav-item" role="presentation"><a class="nav-link" href="ajout_poubelle"><i class="fas fa-user-circle"></i><span>Ajouter une poubelle</span></a></li>
                    </c:if>
                    <c:if test="${utilisateur.getRole()==\"Eboueur\" || utilisateur.getRole()==\"Admin\"}">
                    	<li class="nav-item" role="presentation"><a class="nav-link" href="liste_poubelles"><i class="fas fa-table"></i><span>Listes des poubelles</span></a></li>
                    </c:if>
                    <c:if test="${utilisateur.getRole()==\"Admin\" }">
                    	<li class="nav-item" role="presentation"><a class="nav-link" href="inscription"><i class="fas fa-user-circle"></i><span>Inscription</span></a></li>
                    </c:if>
                    <c:if test="${utilisateur.getRole()==\"Admin\"}">
                    	<li class="nav-item" role="presentation"><a class="nav-link" href="liste_utilisateurs"><i class="fas fa-user"></i><span>Listes des utilisateurs</span></a></li>
                    </c:if>
                </ul>
                <div class="text-center d-none d-md-inline"><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button></div>
            </div>
        </nav>
        <div class="d-flex flex-column" id="content-wrapper">
            <div id="content">
                <nav class="navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top">
                    <div class="container-fluid"><button class="btn btn-link d-md-none rounded-circle mr-3" id="sidebarToggleTop" type="button"><i class="fas fa-bars"></i></button>
                        <ul class="nav navbar-nav flex-nowrap ml-auto">
                            <li class="nav-item dropdown d-sm-none no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><i class="fas fa-search"></i></a>
                                <div class="dropdown-menu dropdown-menu-right p-3 animated--grow-in" role="menu" aria-labelledby="searchDropdown">
                                    <form class="form-inline mr-auto navbar-search w-100">
                                        <div class="input-group"><input class="bg-light form-control border-0 small" type="text" placeholder="Search for ...">
                                            <div class="input-group-append"><button class="btn btn-primary py-0" type="button"><i class="fas fa-search"></i></button></div>
                                        </div>
                                    </form>
                                </div>
                            </li>
                            <li class="nav-item dropdown no-arrow mx-1" role="presentation">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false"><i class="fas fa-sign-out-alt fa-fw" onclick="logOutUser()" style="font-size: 21px;color: rgb(255,15,0);"></i></a>
                                    <div class="dropdown-menu dropdown-menu-right dropdown-list dropdown-menu-right animated--grow-in"
                                        role="menu"></div>
                                </div>
                            </li>
                            <div class="d-none d-sm-block topbar-divider"></div>
                            <li class="nav-item dropdown no-arrow" role="presentation">
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="#"><span class="d-none d-lg-inline mr-2 text-gray-600 small"><c:out value="${utilisateur.getFirst_name()}"/> <c:out value="${utilisateur.getLast_name()}"/></span><img class="border rounded-circle img-profile" src="assets/img/2ab3d48d13328872.jpg"></a>
                                    <div
                                        class="dropdown-menu shadow dropdown-menu-right animated--grow-in" role="menu"><a class="dropdown-item" role="presentation" href="#"><i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Profile</a><a class="dropdown-item" role="presentation" href="#"><i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Settings</a>
                                        <a
                                            class="dropdown-item" role="presentation" href="#"><i class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Activity log</a>
                                            <div class="dropdown-divider"></div><a class="dropdown-item" role="presentation" href="#"><i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>&nbsp;Logout</a></div>
                    </div>
                    </li>
                    </ul>
            </div>
            </nav>
            <div class="container-fluid">
                <h3 class="text-dark mb-4">Liste des utilisateurs&nbsp;</h3>
                <div class="card shadow">
                    <div class="card-header py-3">
                        <p class="m-0 font-weight-bold" style="color: rgb(0,101,46);">&nbsp;Info utilisateurs</p>
                    </div>
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-6 text-nowrap">
                                <div id="dataTable_length" class="dataTables_length" aria-controls="dataTable"><label>Show&nbsp;<select class="form-control form-control-sm custom-select custom-select-sm"><option value="10" selected="">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select>&nbsp;</label></div>
                            </div>
                            <div class="col-md-6">
                                <form>
                                    <div class="text-md-right dataTables_filter" id="dataTable_filter"><label><input class="form-control form-control form-control-sm" type="search" aria-controls="dataTable" placeholder="Search"></label><button class="btn btn-primary" type="button" style="background-color: rgb(0,101,46);">search</button></div>
                                </form>
                            </div>
                        </div>
                        <div class="table-responsive table mt-2" id="dataTable" role="grid" aria-describedby="dataTable_info">
                            <table class="table dataTable my-0" id="dataTable">
                                <thead>
                                    <tr>
                                        <th>username&nbsp; &nbsp;<i class="fa fa-arrows-v"></i></th>
                                        <th>Nom &amp; Prenoms&nbsp;&nbsp;<i class="fa fa-arrows-v"></i></th>
                                        <th>mail&nbsp;&nbsp;<i class="fa fa-arrows-v"></i></th>
                                        <th>role&nbsp;<i class="fa fa-arrows-v"></i></th>
                                        <th>Adresse&nbsp;&nbsp;<i class="fa fa-arrows-v"></i></th>
                                        <th>Editer</th>
                                    </tr>
                                </thead>
                                <tbody>
                                <%-- <c:out value="${listOfUsers}"/> --%>
                                	<c:forEach items="${listOfUsers}" var="user">
	                                    <tr>
	                                        <td>${user.first_name}</td>
	                                        <td>${user.first_name}</td>
	                                        <td>${user.mail}</td>
	                                        <td>${user.role}</td>
	                                        <td>${user.adresse}</td>
	                                        <td><i class="fa fa-pencil" onclick="editUsers(${user.id}, '${user.first_name}')" style="color: rgb(1,102,36);"></i>&nbsp; &nbsp;&nbsp;<i class="fa fa-times" onclick="suprimerUser(${user.id})" style="color: rgb(255,0,0);"></i></td>
	                                    </tr>
                                    </c:forEach> 
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <td><strong>Name</strong></td>
                                        <td><strong>Position</strong></td>
                                        <td><strong>%</strong></td>
                                        <td><strong>%</strong></td>
                                        <td><strong>%</strong></td>
                                        <td><strong>%</strong></td>
                                    </tr>
                                </tfoot>
                            </table>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
        <footer class="bg-white sticky-footer">
            <div class="container my-auto">
                <div class="text-center my-auto copyright"><span>Copyright © ESIR 2023</span></div>
            </div>
        </footer>
    </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a></div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
    <script src="assets/js/image.js"></script>
    <script src="assets/js/request.js"></script>
    <script src="assets/js/theme.js"></script>
</body>

</html>