function chooseImage(myImageID, pourcentage, state) {
    // Get the image element
	console.log(pourcentage)
    var img = document.getElementById(myImageID);
    // Set the src of the image depending on the value
    if(state=="on"){
		if(myImageID=="poubelleBleu"){
	        if (pourcentage ==0 ) {
	            img.src = "assets/img/bleu1.png";
	        } else if (pourcentage < 20 && pourcentage >0) {
	            img.src = "assets/img/bleu2.png";
	        }else if (pourcentage < 40 && pourcentage >= 20) {
	            img.src = "assets/img/bleu3.png";
	        } else if (pourcentage < 60 && pourcentage >= 40) {
	            img.src = "assets/img/bleu4.png";
	        } else if (pourcentage < 80 && pourcentage >= 60) {
	            img.src = "assets/img/bleu5.png";
	        } else if (pourcentage <= 100 && pourcentage >= 80) {
	            img.src = "assets/img/bleu6.png";
	        }else {
	            img.src = "assets/img/poubelleOff.jpg";
	        }
	    } else if(myImageID=="poubelleVert"){
	        if (pourcentage ==0 ) {
	            img.src = "assets/img/vert1.png";
	        } else if (pourcentage < 20 && pourcentage >0) {
	            img.src = "assets/img/vert2.png";
	        }else if (pourcentage < 40 && pourcentage >= 20) {
	            img.src = "assets/img/vert3.png";
	        } else if (pourcentage < 60 && pourcentage >= 40) {
	            img.src = "assets/img/vert4.png";
	        } else if (pourcentage < 80 && pourcentage >= 60) {
	            img.src = "assets/img/vert5.png";
	        } else if (pourcentage <= 100 && pourcentage >= 80) {
	            img.src = "assets/img/vert6.png";
	        }else {
	            img.src = "assets/img/poubelleOff.jpg";
	        }     
	    }else if(myImageID=="poubelleNoire"){
	              if (pourcentage ==0 ) {
	            img.src = "assets/img/noir1.png";
	        } else if (pourcentage < 20 && pourcentage >0) {
	            img.src = "assets/img/noir2.png";
	        }else if (pourcentage < 40 && pourcentage >= 20) {
	            img.src = "assets/img/noir3.png";
	        } else if (pourcentage < 60 && pourcentage >= 40) {
	            img.src = "assets/img/noir4.png";
	        } else if (pourcentage < 80 && pourcentage >= 60) {
	            img.src = "assets/img/noir5.png";
	        } else if (pourcentage <= 100 && pourcentage >= 80) {
	            img.src = "assets/img/noir6.png";
	        }else {
	            img.src = "assets/img/poubelleOff.jpg";
	        } 
	    }
	}else{
		 img.src = "assets/img/poubelleOff.jpg";
	}
    
    
}