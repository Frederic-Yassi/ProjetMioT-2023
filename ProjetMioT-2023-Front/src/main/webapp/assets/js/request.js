
function testApi() {
    $.ajax({
        url : 'http://backend:8084/api/testApi',
        type : 'GET',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code testApi ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function testBdd() {
    $.ajax({
        url : 'http://backend:8084/api/testBdd',
        type : 'GET',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code testBdd ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function getUserId() {
    $.ajax({
        url : '',
        type : 'GET',
        dataType : '',//json text
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code getUserId ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function getUsers() {
    $.ajax({
        url : 'http://backend:8084/api/user/get/all',
        type : 'GET',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code getUsers ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function getUserInfo(id) {
    $.ajax({
        url : 'http://backend:8084/api/user/get/data?id='+id,
        type : 'GET',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code getUserInfo ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function addUser() {
    $.ajax({
        url : 'http://backend:8084/api/user/add?email=heyhey@gd.fr&name=heyhey&pwd=pouuupouu&role=eboueur&num=00000000&address=Asie',
        type : 'POST',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code addUser ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function deleteUser() {
    $.ajax({
        url : 'http://backend:8084/api/testApi',
        type : 'DELETE',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code deleteUser ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyUserEmail() {
    $.ajax({
        url : '',
        type : 'PUT',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code  ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyUserName() {
    $.ajax({
        url : 'http://backend:8084/api/user/modify/pwd?id=2&pwd=pwdtest',
        type : 'PUT',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyUserName ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyUserPwd() {
    $.ajax({
        url : 'http://backend:8084/api/user/modify/pwd?id=2&pwd=pwdtest',
        type : 'PUT',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyUserPwd ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyUserRole() {
    $.ajax({
        url : '',
        type : 'PUT',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyUserRole ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyUserNum() {
    $.ajax({
        url : 'http://backend:8084/api/user/modify/num?id=2&num=54600',
        type : 'PUT',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyUserNum ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyUserAddress() {
    $.ajax({
        url : 'http://localhost:8084/api/user/modify/address?id=2&address=Port-Bouet',
        type : 'PUT',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyUserAddress ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function authendificate() {
    $.ajax({
        url : '',
        type : 'GET',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code  ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function authendification() {
    var login_user = $('#login_user').val();
    var login_pwd = $('#login_pwd').val();
    console.log(login_user + " -> " + login_pwd);
    $.ajax({
        url : 'http://localhost:8084/api/auth?name='+login_user+'&pwd='+login_pwd,
        type : 'GET',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            if("resultat trouve"=="vrai"){
                var process = "recuperer l'id de la variable se connecte en fonction de la personne mettre un champ hidden recceuillant l'id qu on va utilise sur ";
                handleLogin();
            }
            console.log(result);
           
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code authendification ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function handleLogin() {
    // Vérifiez les informations d'identification de l'utilisateur ici
    var userType = "admin"; // Par exemple, si l'utilisateur est un administrateur
    var redirectUrl;
    if (userType === "admin") {
      redirectUrl = "/profile.html";
    } else {
      redirectUrl = "/profile.html";
    }
    window.location.replace(redirectUrl);
}

function getTrashInfo() {
    $.ajax({
        url : 'http://localhost:8084/api/trash/get/data?address=9 Rue louis arretche',
        type : 'GET',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code getTrashInfo ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function getTrashes() {
    $.ajax({
        url : 'http://localhost:8084/api/trash/get/all',
        type : 'GET',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code getTrashes ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function xxxxxx () {
    $.ajax({
        url : '',
        type : 'GET',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code  ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function deleteTrash() {
    $.ajax({
        url : 'http://localhost:8084/api/trash/delete?address=13 Rue louis arretche',
        type : 'DELETE',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code deleteTrash ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyTrashLevel() {
    $.ajax({
        url : 'http://localhost:8084/api/trash/modify/level?address=9 Rue Louis arretche&level=70',
        type : 'PUT',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashLevel ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyTrashAddress() {
    $.ajax({
        url : 'http://localhost:8084/api/testApi',
        type : 'PUT',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashAddress ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function modifyTrashState() {
    $.ajax({
        url : 'http://localhost:8084/api/testApi',
        type : 'PUT',
        dataType : 'json',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            console.log(result);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashState ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function editUsers(id){
	window.location.href = "inscription?id="+id;	
}
function editTrash(adresse){
	console.log(adresse)
	window.location.href = "ajout_poubelle?adresse="+adresse;	
}

function suprimerTrash(adresse){
	$.ajax({
        url : 'http://localhost:8084/api/trash/delete?address='+adresse,
        type : 'DELETE',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            window.location.href = "liste_poubelles";
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashState ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function suprimerUser(id){
	$.ajax({
        url : 'http://localhost:8084/api/user/delete?id='+id,
        type : 'DELETE',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            window.location.href = "liste_utilisateurs";
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashState ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function save_modification_user(id){
	$.ajax({
        url : 'http://localhost:8084/api/user/delete?id='+id,
        type : 'DELETE',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
        	var first_name =$("#first_name").val();
			var last_name =$("#last_name").val();
			var username =$("#username").val();
			var password =$("#password").val();
			var email =$("#email").val();
			var adresse =$("#adresse").val();
			var role =$("#role").val();
			var tel =$("#tel").val();
			var url = var url = 'http://localhost:8084/api/user/add?email='+email+'&name='+username+'&pwd='+password+'&role='+role+'&num='+tel+'&address='+adresse
			console.log(url)
			$.ajax({
		        url : url,
		        type : 'POST',
		        dataType : 'text',//json
		        contentType : 'application/json; charset=utf-8',
		        traditional : true,
		        data : { },
		        success : function (result) {
		            window.location.href = "liste_utilisateurs";
		        },
		        error: function (jqXHR, textStatus, errorThrown) {
		            console.log('Le code modifyTrashState ne fonctionne pas');
		            console.log(jqXHR);
		            console.log(textStatus);
		            console.log(errorThrown);
		        }
		    });
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashState ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}
function save_modification_trash(adresse){
	$.ajax({
        url : 'http://localhost:8084/api/trash/delete?address='+adresse,
        type : 'DELETE',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
			var adresse_poubelle =$("#adresse_poubelle").val();
			var etat_poubelle =$("#etat_poubelle").val();
			
			var url = 'http://localhost:8084/api/trash/add?address='+adresse_poubelle+'&level=0&state='+etat_poubelle
			console.log(url)
			$.ajax({
		        url : url,
		        type : 'POST',
		        dataType : 'text',//json
		        contentType : 'application/json; charset=utf-8',
		        traditional : true,
		        data : { },
		        success : function (result) {
		            window.location.href = "liste_poubelles";
		        },
		        error: function (jqXHR, textStatus, errorThrown) {
		            console.log('Le code modifyTrashState ne fonctionne pas');
		            console.log(jqXHR);
		            console.log(textStatus);
		            console.log(errorThrown);
		        }
		    });
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashState ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function save_new_trash(id){
	var adresse_poubelle =$("#adresse_poubelle").val();
	var etat_poubelle =$("#etat_poubelle").val();
	
	var url = 'http://localhost:8084/api/trash/add?address='+adresse_poubelle+'&level=0&state='+etat_poubelle
	console.log(url)
	$.ajax({
        url : url,
        type : 'POST',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            window.location.href = "liste_poubelles";
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashState ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
}

function save_new_user(){
	
	var first_name =$("#first_name").val();
	var last_name =$("#last_name").val();
	var username =$("#username").val();
	var password =$("#password").val();
	var email =$("#email").val();
	var adresse =$("#adresse").val();
	var role =$("#role").val();
	var tel =$("#tel").val();
	var url = 'http://localhost:8084/api/user/add?email='+email+'&username='+username+'&pwd='+password+'&role='+role+'&num='+tel+'&address='+adresse
	//'http://localhost:8084/api/user/add?email='+email+'&name='+username+'&nom='+first_name+'&prenom='+last_name+'&pwd='+password+'&role='+role+'&num='+tel+'&address='+adresse
	console.log(url)
	$.ajax({
        url : url,
        type : 'POST',
        dataType : 'text',//json
        contentType : 'application/json; charset=utf-8',
        traditional : true,
        data : { },
        success : function (result) {
            window.location.href = "liste_utilisateurs";
        },
        error: function (jqXHR, textStatus, errorThrown) {
            console.log('Le code modifyTrashState ne fonctionne pas');
            console.log(jqXHR);
            console.log(textStatus);
            console.log(errorThrown);
        }
    });
	
}


function logOutUser(){
	window.location.href = "logout";
}



