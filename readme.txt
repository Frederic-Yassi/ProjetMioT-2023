PROJET POUBELLE CONNECTEE 

** Pour run le projet , il faut disposer de docker et de docker-compose 

Dans la racine du projet , faire :

	sudo docker-compose build

	sudo docker-compose up 

** une fois que les services ont bien demarré , pour inserer des données faire :

	sh scripts/createBdd.sh


Vous pouvez consulter le fichier mydb.sql pour ajouter des données à votre guise avant de run le script createBdd.sh


