public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    Course vmat;
    Course vfizik;
    Course vkimya;
    double average;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya,Course vmat, Course vfizik, Course vkimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.vmat = vmat;
        this.vfizik = vfizik;
        this.vkimya = vkimya;
        this.average = 0.0; // Başlangıçta ortalama 0 olarak atanıyor
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int vmat, int vfizik, int vkimya) {
        // Sınav notlarını ekleme
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        // Sözlü notlarını ekleme
        if (vmat >= 0 && vmat <= 100) {
            this.vmat.vnote = vmat;
        }
        if (vfizik >= 0 && vfizik <= 100) {
            this.vfizik.vnote = vfizik;
        }
        if (vkimya >= 0 && vkimya <= 100) {
            this.vkimya.vnote = vkimya;

        }
    }

    public void isPass() {
        // Notların tam olarak girilip girilmediği kontrol ediliyor
        if (this.mat.note == 0 || this.vmat.vnote == 0 || this.fizik.note == 0 || this.vfizik.vnote == 0 || this.kimya.note == 0 || this.vkimya.vnote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            // Ortalama hesaplanıyor
            this.average = calculateAverage();
            printNote();
            System.out.println("Ortalama : " + this.average);
            if (this.average > 55) {
                System.out.println("Sınıfı Geçti.");
                isPass = true;
            } else {
                System.out.println("Sınıfta Kaldı.");
                isPass = false;
            }
        }
    }

    public double calculateAverage() {

        double matAverage = (this.vmat.vnote * 0.2) + (this.mat.note * 0.8);
        double fizikAverage = (this.vfizik.vnote * 0.2) + (this.fizik.note * 0.8);
        double kimyaAverage = (this.vkimya.vnote * 0.2) + (this.kimya.note * 0.8);
        return (matAverage + fizikAverage + kimyaAverage) / 3;
    }

    public void printNote() {

        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.vmat.vnote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.vfizik.vnote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.vkimya.vnote);
    }
}