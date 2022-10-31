package Programs;

public class Encrypt_Decrypt {
    public static void main(String[] args) {
        // Encrypting the grade
        char grade = 'F';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
}
