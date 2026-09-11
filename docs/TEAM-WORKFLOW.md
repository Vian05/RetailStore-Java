# Team Workflow

## Branch Convention

Use one feature branch per member:

- `feature/product-management`
- `feature/transaction`
- `feature/payment-discount`
- `feature/report-analytics`
- `feature/integration-testing`

## Rules

1. Do not develop directly on `main`.
2. Pull the latest `main` before starting work.
3. Keep commits focused and descriptive.
4. Push the feature branch and open a Pull Request.
5. Review the PR before merging.
6. Resolve merge conflicts in the feature branch.

## Commit Convention

Use simple prefixes:

- `feat:` new functionality
- `fix:` bug fix
- `refactor:` code restructuring
- `docs:` documentation
- `test:` testing
- `chore:` project/configuration changes

Examples:

```text
feat: add product search
fix: validate insufficient stock
feat: add daily sales report
test: add transaction test cases
```

## Development Sequence

1. Agree on class design and business rules.
2. Build Product and core data models.
3. Build transaction and payment logic.
4. Build reporting logic.
5. Integrate through Main.
6. Test all required use cases.
7. Complete README, screenshots, and test evidence.
