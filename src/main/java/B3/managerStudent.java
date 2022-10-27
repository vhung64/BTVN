package B3;

public class managerStudent {
    // 1. Sắp xếp học sinh theo fullName, nếu giống fullName thì ai nhiều tuổi hơn thì đứng trước.
    public static void sortbyfullName(Student[] listStudent) {
        for (int i = 0; i < listStudent.length - 1; i++) {
            for (int j = 0; j < listStudent.length - i - 1; j++) {
                if (listStudent[j].getFullName().compareTo(listStudent[j + 1].getFullName()) > 0 ||
                        ((listStudent[j].getFullName().compareTo(listStudent[j + 1].getFullName()) == 0) &&
                                (listStudent[j].getAge() < listStudent[j + 1].getAge()))) {
                    Student std = listStudent[j];
                    listStudent[j] = listStudent[j + 1];
                    listStudent[j + 1] = std;
                }
            }
        }
    }

    // Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần
    public static void sortbyAge(Student[] listStudent) {
        for (int i = 0; i < listStudent.length - 1; i++) {
            for (int j = 0; j < listStudent.length - i - 1; j++) {
                if (listStudent[j].getAge() > listStudent[j + 1].getAge() ||
                        ((listStudent[j].getAge() == listStudent[j + 1].getAge()) &&
                                (listStudent[j].getGPA() < listStudent[j + 1].getGPA()))) {
                    Student std = listStudent[j];
                    listStudent[j] = listStudent[j + 1];
                    listStudent[j + 1] = std;

                }
            }
        }
    }

    // Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A thôi)
    public static String getName(String fullName) {
        String[] str = fullName.split(" ");
        return str[str.length - 1].trim();
    }
    public static void sortbyName(Student[] listStudent) {
        for (int i = 0; i < listStudent.length - 1; i++) {
            for (int j = 0; j < listStudent.length - i - 1; j++) {
                if (getName(listStudent[j].getFullName()).compareTo(getName(listStudent[j+1].getFullName())) > 0){
                    Student std = listStudent[j];
                    listStudent[j] = listStudent[j + 1];
                    listStudent[j + 1] = std;
                }
            }
        }
    }

    public static void main(String[] args) {
        Student std1 = new Student("Mac Van B", 21, 3);
        Student std2 = new Student("Nguyen Van A", 20, 4);
        Student std3 = new Student("Le Van C", 21, 5);
        Student[] listStudent = { std1, std2, std3 };
        // sortbyfullName(listStudent);
        // sortbyAge(listStudent);
        sortbyName(listStudent);
        for (Student student : listStudent) {
            System.out.println(student.toString());
        }
    }
}

