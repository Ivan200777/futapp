# Contributing to FutApp

## Branching strategy

- `main`: stable code. We never commit directly to it.
- `feature/<name>`: new features or documentation (e.g. `feature/code-documentation`).
- `fix/<name>`: small fixes (e.g. `fix/readme-improvements`).

Create your branch from an up-to-date `main`:

```bash
git checkout main
git pull
git checkout -b feature/your-task
```

## Commit conventions

We use Conventional Commits, in English and with a short message:

- `feat:` a new feature
- `fix:` a bug fix
- `docs:` changes in documentation or comments
- `chore:` setup and maintenance

Example: `docs: add Javadoc to Jugador and Main`

## Code style

Every class and method must have Javadoc, including `@param` and `@return`. Before opening a PR, check that the project compiles:

```bash
javac -d out src/*.java
```

## Pull request guidelines

1. Push your branch and open a Pull Request to `main`.
2. Write a clear title and explain what you changed and why.
3. Someone other than the author should review it, and it must be approved before merging.
4. If a PR is rejected, the reviewer must write a comment explaining the reason.
