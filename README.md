# Java Full-Stack Web Application

## Description

Cette application web Java Full-Stack utilise Spring Boot, Spring Security, Thymeleaf, et intègre des fonctionnalités comme la vérification par email, la réinitialisation de mot de passe (avec vérification par token) et les opérations CRUD complètes (création, lecture, mise à jour, suppression).

## Fonctionnalités

- **Authentification et autorisation** avec Spring Security
- **Vérification par email** lors de l'inscription
- **Réinitialisation de mot de passe** avec envoi de token par email
- **CRUD complet** pour gérer les entités de l'application (édition et suppression incluses)
- **Frontend** utilisant Thymeleaf pour le rendu des vues

## Prérequis

- Java 17
- Maven 3.6.0 ou plus récent
- MySQL ou tout autre base de données relationnelle supportée par Spring Data JPA

## Installation

1. Clonez le repository :


2. Configurez la base de données dans `src/main/resources/application.properties` :

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/votre_db
    spring.datasource.username=your_db_user
    spring.datasource.password=your_db_password

    spring.jpa.hibernate.ddl-auto=update
    ```

3. Compilez et démarrez l'application :

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Utilisation

### Home Page
<img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Home.png" width="350" height="200"> 

### Inscription et Vérification par Email

L'utilisateur s'inscrit avec son email, et un email de vérification est envoyé. Une fois l'email vérifié, l'utilisateur peut se connecter.

<img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Registration%20Page.png" width="350" height="200"> <img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Email%20Verification%20Registrtion.png" width="350" height="200">

### Login et Réinitialisation de Mot de Passe

Si l'utilisateur oublie son mot de passe, il peut demander une réinitialisation. Un email avec un token de réinitialisation est envoyé, permettant de définir un nouveau mot de passe.
<img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Login%20Page.png" width="350" height="200"> 

![Mot de passe oublié]<img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Forgot%20Password.png" width="350" height="200">
![Email de réinitialisation]<img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Email%20Verification%20Reset%20password.png" width="350" height="200">
![Réinitialisation de mot de passe]<img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Reset%20Paswword.png" width="350" height="200">

### Gestion des Entités (CRUD)

L'application permet la création, la lecture, la mise à jour et la suppression des entités.

- **Liste des entités** :
    ![Liste des entités]<img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Users.png" width="350" height="200">

- **Édition d'une entité** :
    ![Édition d'une entité]<img src="https://github.com/MohamedAmineHammi/spring-mvc-web-app-with-thymeleaf/blob/master/templates/Update%20Page.png" width="350" height="200">


## Technologies

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- Thymeleaf
- MySQL

## Contribuer

Les contributions sont les bienvenues ! Merci de suivre ces étapes :

1. Fork le projet
2. Créez votre branche de fonctionnalité (`git checkout -b feature/AmazingFeature`)
3. Commitez vos modifications (`git commit -m 'Add some AmazingFeature'`)
4. Poussez votre branche (`git push origin feature/AmazingFeature`)
5. Ouvrez une Pull Request

## Licence

Distribué sous la licence MIT. Voir `LICENSE` pour plus d'informations.

## Contact

Mohamed Amine Hammi - eminehammi@gmail.com

