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

### Inscription et Vérification par Email

L'utilisateur s'inscrit avec son email, et un email de vérification est envoyé. Une fois l'email vérifié, l'utilisateur peut se connecter.

![Inscription](captures/inscription.png)
![Email de vérification](captures/email_verification.png)

### Réinitialisation de Mot de Passe

Si l'utilisateur oublie son mot de passe, il peut demander une réinitialisation. Un email avec un token de réinitialisation est envoyé, permettant de définir un nouveau mot de passe.

![Mot de passe oublié](captures/forgot_password.png)
![Email de réinitialisation](captures/reset_email.png)
![Réinitialisation de mot de passe](captures/reset_password.png)

### Gestion des Entités (CRUD)

L'application permet la création, la lecture, la mise à jour et la suppression des entités.

- **Liste des entités** :
    ![Liste des entités](captures/list.png)
- **Création d'une entité** :
    ![Création d'une entité](captures/create.png)
- **Édition d'une entité** :
    ![Édition d'une entité](captures/edit.png)
- **Suppression d'une entité** :
    ![Suppression d'une entité](captures/delete.png)

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

Votre Nom - [Votre Email](mailto:votre-email@example.com)

Lien du projet : [https://github.com/votre-utilisateur/votre-repo](https://github.com/votre-utilisateur/votre-repo)
