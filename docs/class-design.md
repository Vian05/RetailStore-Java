# Class Design – RetailStore-Java

Dokumen ini menjadi kontrak desain antar anggota sebelum implementasi. Tujuannya agar class, field, tipe data, dan method yang dipakai antar fitur konsisten.

## 1. Product

Tanggung jawab: merepresentasikan produk toko.

Fields:
- `String id`
- `String name`
- `String category`
- `double price`
- `int stock`

Methods utama:
- constructor
- getter/setter
- `updateStock(int quantity)`
- `toString()`

## 2. ProductService

Tanggung jawab: mengelola koleksi produk.

Fields:
- `ArrayList<Product> products`

Methods utama:
- `addProduct(Product product)`
- `displayProducts()`
- `searchByName(String keyword)`
- `searchByCategory(String category)`
- `findById(String id)`
- `updateStock(String productId, int quantity)`

## 3. TransactionItem

Tanggung jawab: satu baris item di dalam transaksi.

Fields:
- `Product product`
- `int quantity`

Methods utama:
- constructor
- getter/setter
- `getSubtotal()`

## 4. Transaction

Tanggung jawab: merepresentasikan satu transaksi penjualan.

Fields:
- `String transactionId`
- `ArrayList<TransactionItem> items`
- `double discount`
- `PaymentMethod paymentMethod`
- `double subtotal`
- `double total`
- `LocalDateTime dateTime`

Methods utama:
- constructor
- `addItem(TransactionItem item)`
- `calculateSubtotal()`
- `calculateTotal()`
- getter/setter

## 5. TransactionService

Tanggung jawab: menjalankan proses transaksi dan menyimpan riwayat transaksi.

Fields:
- `ArrayList<Transaction> transactions`

Methods utama:
- `createTransaction(...)`
- `addTransaction(Transaction transaction)`
- `getTransactions()`

Catatan integrasi: proses ini harus menggunakan `ProductService.findById()` dan memastikan stok mencukupi sebelum stok dikurangi.

## 6. PaymentMethod

Gunakan enum sederhana:

```java
public enum PaymentMethod {
    CASH,
    TRANSFER
}
```

## 7. Discount

Tanggung jawab: perhitungan diskon terpisah dari transaksi.

Metode utama:
- `calculate(double subtotal)`

Catatan: threshold dan persentase diskon belum ditentukan oleh soal. Kelompok harus menetapkan business assumption dan menuliskannya di README/laporan.

## 8. Receipt

Tanggung jawab: format nota transaksi di console.

Methods utama:
- `print(Transaction transaction)`

Receipt minimal menampilkan:
- transaction ID
- item dan quantity
- subtotal
- discount
- total
- payment method

## 9. ReportService

Tanggung jawab: laporan dan analitik.

Methods utama:
- `showDailySales(...)`
- `showLowStock(...)`
- `showTopThreeBestSelling(...)`

Data laporan berasal dari koleksi produk dan transaksi yang sudah ada.

## 10. Store

Tanggung jawab: menjadi penghubung antar service.

Fields:
- `ProductService productService`
- `TransactionService transactionService`
- `ReportService reportService`

Store tidak seharusnya berisi seluruh business logic; gunakan service yang sesuai.

## 11. InputValidator

Tanggung jawab: validasi input console dan membantu exception handling.

Methods utama dapat mencakup:
- `readInt(...)`
- `readDouble(...)`
- `readNonEmptyString(...)`

## 12. Main

Tanggung jawab: user interface console.

Implementasi wajib:
- `Scanner`
- `System.out.println`
- `while` loop untuk menu berulang
- `switch` atau `if-else`
- `try-catch` untuk input yang tidak valid

Main hanya mengatur alur menu dan memanggil `Store`/service; business logic utama tetap berada di class terkait.

## Relasi Antar-Class

```text
Main
  -> Store
      -> ProductService -> Product
      -> TransactionService -> Transaction -> TransactionItem -> Product
      -> ReportService -> Product / Transaction

Transaction -> PaymentMethod
Transaction -> Discount
Transaction -> Receipt
```

## Kontrak Integrasi

1. Gunakan nama field dan method yang konsisten dengan dokumen ini.
2. Semua field model dibuat `private` dan diakses melalui getter/setter bila diperlukan.
3. Hindari menaruh seluruh logic di `Main.java`.
4. Perubahan terhadap signature method yang dipakai class lain harus dikomunikasikan sebelum merge.
5. Setiap anggota bekerja di branch masing-masing dan membuat Pull Request ke `main`.
