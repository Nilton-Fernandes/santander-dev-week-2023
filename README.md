# Santander-Dev-Week-2023
Java RESTful API criada para santander dev week 2023

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        - String name
    }

    class Account {
        - String number
        - String agency
        - double balance
        - double limit
    }

    class Feature {
        - String icon
        - String description
    }

    class Card {
        - String number
        - double limit
    }

    class News {
        - String icon
        - String description
    }

    User --> Account : has
    User --> Card : has
    User --> Feature : has many
    User --> News : has many

```
