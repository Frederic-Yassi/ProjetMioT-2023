from selenium import webdriver
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.support import expected_conditions as EC
import unittest
import pytest
import HtmlTestRunner
from selenium.webdriver.support.ui import Select
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
import csv,time




users_mails=[]
users_pwd=[]
csvfile=open('csv_file.csv','r',encoding='utf8')

ligne=1

for rows in csv.DictReader(csvfile,delimiter=";"):
    if rows['\ufeffMail']!=" "and rows['PWD']!=" " :
        users_mails.append(rows["\ufeffMail"])
        users_pwd.append(rows["PWD"])
      
    else:
        raise ValueError("tous les champs doivent être remplis")
    
ligne+=1

csvfile.close()

        
        

users_list=[users_mails,users_pwd]


#ACTION
print("-------------TEST DE CONNEXION UTILISATEUR--------------------")



#Config driver chrome

options = Options()
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=options)
webdriver.ChromeOptions().add_argument('headless')
webdriver.ChromeOptions().add_argument('window-size=1920*1080')
webdriver.ChromeOptions().add_experimental_option('excludeSwitches', ['enable-logging'])
print(len(users_list))
print(len(users_mails))
print(len(users_pwd))   

print(users_list)
print(users_mails)
print(users_pwd)     

class Testlogin(unittest.TestCase):
     
    def test_connexion(self):
        
        for u in range (len(users_mails)):
            with self.subTest(u):
                self.driver=driver
                current_mail=users_list[0][u]
                current_pwd=users_list[1][u]
                # ouverture du navigateur
                self.driver.get('http://localhost:8080/ProjetMiot/index')
                #agrandir la fenetre
                self.driver.maximize_window()
                time.sleep(2)
                
                #_______________________________________ETAPE 1: Connexion______________________________________________
                
                
                #saisir le mail de l'utilisateur
                search_box = self.driver.find_element(By.ID,"log_username")
                search_box.send_keys(current_mail)
                
                                
                #Saisir le mot de pass 
                search_box = self.driver.find_element(By.ID,"log_password")
                search_box.send_keys(current_pwd)
                
                time.sleep(2)
                
                # Wait for the button to be visible and clickable
                wait = WebDriverWait(self.driver, 10)
                time.sleep(1)
                # Cliquer sur un bouton
                
                button = wait.until(EC.element_to_be_clickable((By.ID, "login-button")))
                button.click()
                
                time.sleep(2)
                
                #verifier la bonne authentification avec les bons champs: mail et mot de pass
                
                if (self.driver.current_url=="http://localhost:8080/ProjetMiot/etat_poubelle"):
                
                        print("_____________success with user:{}__________".format(current_mail))
                        time.sleep(3)
                       # wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#accordionSidebar > li:nth-child(3) > a"))).click()
                 
                        #______________Admin functionnalities_____________________
                        if(current_mail=="admin"):
                            #cliquer pour ajouter une poubelle
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#accordionSidebar > li:nth-child(2) > a > span"))).click()
                            #Verifier qu'on est bien sur la page d'ajout de poubelle
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/ajout_poubelle"
                            #On reseigne une poubelle 
                            search_box = self.driver.find_element(By.CSS_SELECTOR,"#adresse_poubelle")
                            search_box.send_keys("ESIR")
                            
                            search_box = self.driver.find_element(By.CSS_SELECTOR,"#etat_poubelle")
                            search_box.send_keys("on")
                            time.sleep(1)
                            
                            #Ajouter la poubelle
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#content > div > div > div.col-lg-8 > div:nth-child(2) > div > div > div.card-body > form > a"))).click()
                            #Verifier qu'on arrive bien sur le dashboard des poubelles
                            time.sleep(3)
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/liste_poubelles"
                            
                            #Verifier qu'on peut supprimer une poubelle
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#dataTable > tbody > tr:nth-child(4) > td:nth-child(6) > i.fa.fa-times"))).click()
                            
                           # Visualiser la liste des poubelles 
                           
                            time.sleep(5)
                            #On verifie qu'on est bien sur la page de la liste des poubelles 
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/liste_poubelles"
                            #Verifier qu'on peut modifier
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#dataTable > tbody > tr:nth-child(3) > td:nth-child(6) > i.fa.fa-pencil"))).click()
                            #Renseigner les chhamps de la poubelle qu'on souhaite enregistrer
                                #Effacer les champs existants
                            
                            newpou= self.driver.find_element(By.CSS_SELECTOR,"#adresse_poubelle")
                            newpou.clear()
                            newpou.send_keys("RENNES")
                            
                            newstate = self.driver.find_element(By.CSS_SELECTOR,"#etat_poubelle")
                            newstate.clear()
                            newstate.send_keys("off")
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR,"#content > div > div > div.col-lg-8 > div:nth-child(2) > div > div > div.card-body > form > a"))).click()
                            
                            time.sleep(5)
                            
                            #Inscrire un user
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#accordionSidebar > li:nth-child(4) > a > span"))).click()
                           
                            
                            #Renseiggner le nom 
                            name = self.driver.find_element(By.CSS_SELECTOR,"#first_name")
                            name.send_keys("Theo")
                            
                             #Renseigner le prenom
                            lastname = self.driver.find_element(By.CSS_SELECTOR,"#last_name")
                            lastname.send_keys("Sarah")
                        
                            
                            #Renseiggner le username
                            username = self.driver.find_element(By.CSS_SELECTOR,"#username")
                            username.send_keys("Sarah")
                            
                            #renseigner mdp 
                            mdp = self.driver.find_element(By.CSS_SELECTOR,"#password")
                            mdp.send_keys("1234")
                            
                            
                            #renseigner mail
                            mail= self.driver.find_element(By.CSS_SELECTOR,"#email")
                            mail.send_keys("theo.sarah@esir.fr")
                            
                            #renseigner adresse
                            adresse= self.driver.find_element(By.CSS_SELECTOR,"#adresse")
                            adresse.send_keys("D428")
                            
                            #Selectionner son role 
                            
                            role=self.driver.find_element(By.CSS_SELECTOR,"#role")
                            
                            select = Select(role)
                            select.select_by_value("Locataire")
                            
                            #Numero
                            adresse= self.driver.find_element(By.CSS_SELECTOR,"#tel")
                            adresse.send_keys("D428")
                            
                            #Ajouter le user 
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#content > div > div.row.mb-3 > div.col-lg-8 > div:nth-child(2) > div > div > div.card-body > form > a"))).click()
                            time.sleep(3)
                            #On verifier que c'est bienb renseigné
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/liste_utilisateurs"
                            time.sleep(1)
                            
                            #se deconnecter 
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#content > nav > div > ul > li.nav-item.dropdown.no-arrow.mx-1 > div > a > i"))).click()

                            #On verifie qu'on est bie deconnecté 
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/logout"
                            time.sleep(1)
                            

                     #______________locataire functionnalities_____________________
                        if(current_mail=="locataire"):
                            #On verifie qu'on est bien sur la page ou on voit l'etat des poubelle
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/etat_poubelle"
                
                            #Verifie qu'on voit bien locataire à gauche de l'ecran 
                            locataire=self.driver.find_element(By.CSS_SELECTOR,"#content > nav > div > ul > li:nth-child(4) > div > a > span")
                            locataire.text=="locataire locataire"
                            
                            #On clic sur le bouton profit 
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#accordionSidebar > li:nth-child(2) > a > span")))
                            #time.sleep(5)
                            #assert self.driver.current_url=="http://localhost:8080/ProjetMiot/profil"
                            
                            
                             #se deconnecter 
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#content > nav > div > ul > li.nav-item.dropdown.no-arrow.mx-1 > div > a > i"))).click()

                            #On verifie qu'on est bie deconnecté 
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/logout"
                            time.sleep(1)
                            
                            
                     #______________eboueur functionnalities_____________________
                        if(current_mail=="eboueur"):
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/etat_poubelle"
                            
                        #Cliquer sur le bouton "profit" 
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#accordionSidebar > li:nth-child(1) > a > span")))
                        #On verifie qu'il voit bien son profit
                            #time.sleep(5)
                           # assert self.driver.current_url=="http://localhost:8080/ProjetMiot/profil"
                                 
                        #on clic sur la liste des poubelle 
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#accordionSidebar > li:nth-child(2) > a > span")))
                        #On verifie qu'on a la liste des poubelle
                            #assert self.driver.current_url=="http://localhost:8080/ProjetMiot/liste_poubelles"
                            
                         #se deconnecter 
                            wait.until(EC.element_to_be_clickable((By.CSS_SELECTOR, "#content > nav > div > ul > li.nav-item.dropdown.no-arrow.mx-1 > div > a > i"))).click()

                        #On verifie qu'on est bie deconnecté 
                            assert self.driver.current_url=="http://localhost:8080/ProjetMiot/logout"
                            time.sleep(1)
                      
                            
                                   
                else:
                        print("_____________KO with user:{}__________".format(current_mail))
                         
              
            
        self.driver.close()            
           
                
if __name__=='__main__':
    unittest.main()
    #unittest.main(testRunner=HtmlTestRunner.HTMLTestRunner(output='rapport.junitxml'))
    
