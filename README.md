# LAB-1-HelloToast-Manipuler-les-composants-et-les-v-nements
**Auteur :** Zaynab Bellafrikh (4IIR-G2)  
**Institution :** EMSI - École Marocaine des Sciences de l'Ingénieur 

## Description
HelloToast1 est une application Android simple et interactive qui illustre les concepts fondamentaux du développement mobile : l'interface utilisateur (UI) avec `LinearLayout`, la gestion des ressources et l'interaction avec l'utilisateur via des boutons.

L'application permet à l'utilisateur :
1. D'afficher un message bref à l'écran (**Toast**).
2. D'incrémenter un compteur numérique affiché de manière proéminente au centre de l'écran.

## Aperçu de l'Interface
L'interface est construite de manière verticale et optimisée pour occuper tout l'écran :
- **Bouton TOAST** : Situé en haut, il déclenche une notification contextuelle.
- **Zone de Compteur** : Un `TextView` central sur fond jaune, utilisant un système de poids (`layout_weight`) pour occuper l'espace disponible.
- **Bouton COUNT** : Situé en bas, il augmente la valeur affichée au centre.

## Caractéristiques Techniques
- **Layout principal** : `LinearLayout` (orientation verticale).
- **Composants Material Design** : Utilisation de `backgroundTint` pour une intégration moderne.
- **Adaptabilité** : Le compteur utilise `0dp` de hauteur avec un poids de `1` pour garantir un affichage équilibré sur tous les types d'écrans.

## Structure du Projet
- `activity_main.xml` : Définit la structure visuelle (Boutons et TextView).
- `MainActivity.java` : Gère la logique d'incrémentation et l'affichage des messages Toast.
- `res/values/` : Contient les définitions de couleurs et de textes (strings) pour une meilleure maintenabilité.

## Installation
1. Clonez ce dépôt ou téléchargez le projet.
2. Ouvrez le projet dans **Android Studio**.
3. Assurez-vous d'avoir les dépendances suivantes installées (via `build.gradle`) :
   - `androidx.appcompat:appcompat:1.7.1`
   - `com.google.android.material:material:1.13.0`
4. Connectez un appareil Android ou lancez l'émulateur.
5. Cliquez sur **Run** (Exécuter).

## Langages utilisés
* **Java** : Logique de l'application.
* **XML** : Design de l'interface utilisateur.

<img width="278" height="597" alt="image" src="https://github.com/user-attachments/assets/a1169fc4-4084-4973-beb2-9fe69a01b521" />

---
Projet réalisé dans le cadre de l'apprentissage du développement Android.
