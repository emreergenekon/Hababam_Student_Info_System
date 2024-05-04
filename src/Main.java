
public class Main {
    public static void main(String[] args) {

        // Courses are created
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course tarih = new Course("Tarih", "TRH101", "TRH");
        Course vmat = new Course("Matematik Sözlü", "MAT102", "MAT");
        Course vfizik = new Course("Fizik Sözlü", "FZK102", "FZK");
        Course vkimya = new Course("Kimya Sözlü", "KMY102", "KMY");
        // Teachers are created
        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        // Teachers are assigned to courses
        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        // Students are created
        Student s1 = new Student("İnek Şaban", 4, "1231123", mat, fizik, kimya, vmat, vfizik, vkimya);
        // Exam and oral grades are added
        s1.addBulkExamNote(50, 20, 40, 50, 20, 70);
        // Passing status is checked
        s1.isPass();

        // Other students are created and the process is repeated
        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya, vmat, vfizik, vkimya);
        s2.addBulkExamNote(100, 50, 40, 10, 50, 100);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya, vmat, vfizik, vkimya);
        s3.addBulkExamNote(100, 90, 70, 80, 50, 75);
        s3.isPass();
    }
}