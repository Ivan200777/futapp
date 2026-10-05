# FutApp

A small Java project that represents a football player and checks whether he counts as a starter.

## Description

FutApp has two classes:

- `Jugador`: stores a player's name and shirt number (`dorsal`). It also has a method, `esTitular`, that returns `true` if the player has played 60 minutes or more.
- `Main`: a short example that creates a player ("Lucas", number 9) and prints his name, his number and whether he is a starter.

All the code is documented with Javadoc.

## Prerequisites

- JDK 17
- Git

## Setup

1. Clone the repository and go into the folder:

```bash
   git clone https://github.com/Ivan200777/futapp.git
   cd futapp
```

2. Compile the code:

```bash
   javac -d out src/*.java
```

3. Run the program:

```bash
   java -cp out Main
```

   Expected output:

```text
   Lucas (#9)
   ¿Titular? true
```

4. (Optional) Generate the Javadoc documentation and open `docs/index.html`:

```bash
   javadoc -d docs src/*.java
```

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) before making changes.