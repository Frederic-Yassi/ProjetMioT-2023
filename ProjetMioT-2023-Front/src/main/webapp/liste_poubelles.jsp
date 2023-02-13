<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
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
                    <c:if test="${utilisateur.getRole()==\"Eboueur\" || utilisateur.getRole()==\"Admin\" }">
                    	<li class="nav-item" role="presentation"><a class="nav-link" href="liste_poubelles"><i class="fas fa-table"></i><span>Liste des poubelles</span></a></li>
                    </c:if>
                    <c:if test="${utilisateur.getRole()==\"Admin\" }">
                    	<li class="nav-item" role="presentation"><a class="nav-link" href="inscription"><i class="fas fa-user-circle"></i><span>Inscription</span></a></li>
                    </c:if>
                    <c:if test="${utilisateur.getRole()==\"Admin\"}">
                    	<li class="nav-item" role="presentation"><a class="nav-link" href="liste_utilisateurs"><i class="fas fa-user"></i><span>Liste des utilisateurs</span></a></li>
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
                                <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="logout"><i class="fas fa-sign-out-alt fa-fw" onclick="logOutUser()" style="font-size: 21px;color: rgb(255,15,0);"></i></a>
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
                <h3 class="text-dark mb-4">Liste des poubelles&nbsp;</h3>
                <div class="card shadow">
                    <div class="card-header py-3">
                        <p class="m-0 font-weight-bold" style="color: rgb(0,101,46);">&nbsp;Info poubelles</p>
                    </div>
                    <div class="card-body">
                        <div class="row">
                            <div class="col-md-6 text-nowrap">
                                <div id="dataTable_length" class="dataTables_length" aria-controls="dataTable"><label>Show&nbsp;<select class="form-control form-control-sm custom-select custom-select-sm"><option value="10" selected="">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select>&nbsp;</label></div>
                            </div>
                            <div class="col-md-6">
                                <div class="text-md-right dataTables_filter" id="dataTable_filter"><label><input type="search" class="form-control form-control-sm" aria-controls="dataTable" placeholder="Search"></label></div>
                            </div>
                        </div>
                        <div class="table-responsive table mt-2" id="dataTable" role="grid" aria-describedby="dataTable_info">
                            <table class="table dataTable my-0" id="dataTable">
                                <thead>
                                    <tr>
                                        <th>Adresse<i class="fa fa-arrows-v"></i></th>
                                        <th>P1&nbsp;&nbsp;<i class="fa fa-arrows-v"></i></th>
                                        <th>P2&nbsp;&nbsp;<i class="fa fa-arrows-v"></i></th>
                                        <th>P3&nbsp;&nbsp;<i class="fa fa-arrows-v"></i></th>
                                        <th>State<i class="fa fa-arrows-v"></i></th>
                                        <c:if test="${utilisateur.getRole()==\"Admin\" }">
                                        	<th>Editer</th>
                                        </c:if>
                                    </tr>
                                </thead>
                                <tbody>
                                	<c:forEach items="${listOfTrashes}" var="trash">
	                                    <tr>
	                                        <td>${trash.adresse}</td>
	                                        <td><img class="rounded-circle mr-2" width="30" height="30" src="assets/img/klein-yves_IKB_1960_immitation_pompidou.jpg">${trash.level}%
	                                        	<c:if test="${trash.level>=60}">
                                        			<i class="fa fa-bell" style="color: rgb(255,0,0);font-size: 20px;"></i>
                                        		</c:if>
                                        		<c:if test="${trash.state=='off'}">
                                        			<i class="fa fa-times" style="color: rgb(255,0,0);font-size: 20px;"></i>	
                                        		</c:if>
	                                        </td>
	                                        <td><img class="rounded-circle mr-2" width="30" height="30" src="assets/img/2ab3d48d13328872.jpg">30%</td>
	                                        <td><img class="rounded-circle mr-2" width="30" height="30" src="assets/img/Black-Color-1220-2440-18mm-High-Glossy-MDF-ZH-945-.jpg">60%<br></td>
	                                        <td>${trash.state}</td>
	                                        <c:if test="${utilisateur.getRole()==\"Admin\" }">
	                                        	<td><i class="fa fa-pencil" onclick="editTrash('${trash.adresse}')" style="color: rgb(1,102,36);"></i>&nbsp; &nbsp;&nbsp;<i class="fa fa-times" onclick="suprimerTrash('${trash.adresse}')" style="color: rgb(255,0,0);"></i></td>
	                                        </c:if>
	                                    </tr>
                                    </c:forEach> 
                                </tbody>
                                <tfoot>
                                    <tr>
                                        <td><strong>Position</strong></td>
                                        <td><strong>%</strong></td>
                                        <td><strong>%</strong></td>
                                        <td><strong>%</strong></td>
                                        <td><strong>on/off</strong></td>
                                        <c:if test="${utilisateur.getRole()==\"Admin\" }">
                                        	<td><strong>%</strong></td>
                                        </c:if>
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