
# Final Project




## Functional Test

Untuk Functional Test ini, saya menggunakan Web Bro.co dan Aplikasinya untuk melaksanakan Testing Web dan Mobile menggunakan Katalon Studio.

#### Profiles
Saya membuat Profiles Global Execution atas nama saya untuk mengeksekusi Test Suite Nanti.

#### Test Cases
Penamaan Test Cases disusun dengan TC diikuti angka lalu nama Test yang dilakukan untuk memudahkan dalam pengerjaan. Folder TC dibuat menjadi dua, Mobile Testing dan Web Testing sehingga lebih mudah untuk navigasi.

#### Object Repository
Penyimpanan object yang ditangkap juga dibedakan jadi Mobile Testing Brodo dan Web Testing Brodo untuk memudahkan pengerjaan.

#### Test Suites
Menggunakan dua Test Suites masing-masing untuk Mobile dan Web Testing yang kemudian kedua Test Suites tersebut dilakukan eksekusi pada Test Suites Collection Bernama Brodo Testing.

#### Test data
Menggunakan Test Data untuk melakukan Login.

## Performance Test

GET Contact List, mengambil data kontak yang ada pada https://thinking-tester-contact-list.herokuapp.com/contacts.
POST Add Contact, menambah data kontak pada https://thinking-tester-contact-list.herokuapp.com/contacts

Untuk thread properties, digunakan 10 Treads(user) dan Ramp-up period(seconds) 60, sehingga RPS=10/60=1/6 

​Jadi, total Requests per Second (RPS) adalah 1/6 atau sekitar 0.1667 RPS. Artinya, ada sekitar 0.1667 permintaan yang dikirim ke server setiap detik.






## Dokumentasi 


[Video Run Functional Test](https://drive.google.com/file/d/10GKmnsvyvKfsRRLUtTQD5gI7cS63SLcX/view?usp=sharing)

[Test Result Report](https://drive.google.com/file/d/1RhsfjKTQs6qGFLWYGAP9VEGUxNVy4fMR/view?usp=drive_link)

