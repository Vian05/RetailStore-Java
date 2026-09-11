# RetailStore-Java

Aplikasi Konsol Java untuk Sistem Manajemen Toko Retail (TR) – COSC6047 Introduction to Programming for Business.

## Tujuan
Membangun aplikasi console Java yang menerapkan konsep dasar Java, OOP, control flow, collection, dan exception handling untuk mendukung:

- Manajemen produk
- Pemrosesan transaksi penjualan
- Laporan dan analitik penjualan

## Struktur Proyek

```text
src/
├── Main.java
├── Product.java
├── Transaction.java
├── TransactionItem.java
├── PaymentMethod.java
├── Discount.java
├── Receipt.java
├── Store.java
├── ProductService.java
├── TransactionService.java
├── ReportService.java
└── InputValidator.java
```

## Pembagian Tim

| Anggota | Tanggung Jawab |
|---|---|
| Member 1 | Product Management |
| Member 2 | Transaction |
| Member 3 | Payment, Discount & Receipt |
| Member 4 | Report & Analytics |
| Member 5 | Main, Integration, Validation & Testing |

## Git Workflow

- `main` = branch stabil/integrasi
- Setiap anggota bekerja pada branch `feature/<nama-fitur>`
- Jangan langsung push ke `main`
- Perubahan masuk melalui Pull Request
- Pull Request harus dicek sebelum merge

Contoh:

```bash
git checkout -b feature/product-management
# coding...
git add .
git commit -m "Add product management"
git push -u origin feature/product-management
```

## Fitur Wajib

1. Manajemen Produk
2. Pemrosesan Transaksi
3. Laporan & Analitik
4. Exception Handling
5. Dokumentasi dan Test Case

## Status

Project setup awal.
