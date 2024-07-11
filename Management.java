import java.util.Scanner;

interface student {
    String studentName();

    String branch();

    String rollNumber();

    int roomNumber();

    int section();
}

interface teacher {
    String teacherName();

    String subject();

    String departmentName();

    int cabinNumber();
}

class manage implements student, teacher {
    public String branch() {
        Scanner s = new Scanner(System.in);
        System.out.println("Department Names :-");
        System.out.print("1. Computer Science, ");
        System.out.print("2. Information Technology, ");
        System.out.print("3. Internet of Thing, ");
        System.out.print("4. Data Science, ");
        System.out.print("5. AIML, ");
        System.out.print("6. CSIT, ");
        System.out.print("7. Civil, ");
        System.out.print("8. Methanical, ");
        System.out.println("9. Electrical.");
        System.out.print("Enter department number ");
        int ch = s.nextInt();
        switch (ch) {
            case 1:
                return "Computer Science";
            case 2:
                return "Information Technology";
            case 3:
                return "Internet of Thing";
            case 4:
                return "Data Science";
            case 5:
                return "AIML";
            case 6:
                return "CSIT";
            case 7:
                return "Civil";
            case 8:
                return "Mechanical";
            case 9:
                return "Electrical";
            default:
                System.out.println("Wrong choice try again");
                branch();
        }

        String branchName = s.nextLine();
        return branchName;
    }

    public String studentName() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter student name = ");
        String stuName = s.nextLine();
        return stuName;
    }

    public String rollNumber() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter roll number = ");
        String rollnum = s.nextLine();
        return rollnum;
    }

    public int roomNumber() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter room number = ");
        int roomNum = s.nextInt();
        return roomNum;
    }

    public int section() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter section number = ");
        int secNum = s.nextInt();
        return secNum;
    }

    public String teacherName() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter teacher name = ");
        String teaName = s.nextLine();
        return teaName;
    }

    public String subject() {
        Scanner s = new Scanner(System.in);
        System.out.print("what subject they teach = ");
        String sub = s.nextLine();
        return sub;
    }

    public String departmentName() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter department name = ");
        String dep = s.nextLine();
        return dep;
    }

    public int cabinNumber() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter cabin number = ");
        int cabNum = s.nextInt();
        return cabNum;
    }
}

class department extends manage {
    public String stuName, branchName, rollNum;
    public int roomNum, sec;
}

class management {
    public static void main(String gg[]) {
        // String studentName();
        // String branch();
        // String rollNumber();
        // int roomNumber();
        // int section();
        System.out.print("Enter number of students = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        department obj[] = new department[n];

        for (int i = 0; i < n; i++) {
            department stu1 = new department();
            String stuName = stu1.studentName();
            String branchName = stu1.branch();
            String rollNum = stu1.rollNumber();
            int roomNum = stu1.roomNumber();
            int sec = stu1.section();

            stu1.stuName = stuName;

            stu1.branchName = branchName;
            stu1.rollNum = rollNum;
            stu1.roomNum = roomNum;
            stu1.sec = sec;

            obj[i] = stu1;
            // System.out.println("Name of the student is = " + stuName);
            // System.out.println("Student belongs to branch = " + branchName);
            // System.out.println("Student roll number is = " + rollNum);
            // System.out.println("Allocated class number is = " + roomNum);
            // System.out.println("student section is = " + sec);
        }

        for (int i = 0; i < obj.length; i++) {
            System.out.println("Name of the student is = " + obj[i].stuName);
            System.out.println("Student belongs to branch = " + obj[i].branchName);
            System.out.println("Student roll number is = " + obj[i].rollNum);
            System.out.println("Allocated class number is = " + obj[i].roomNum);
            System.out.println("student section is = " + obj[i].sec);
        }

        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------");
        System.out.println(
                "----------------------------------------------------------------------------------------------------------------------------");
        // String teacherName();
        // String subject();
        // String departmentName();
        // int cabinNumber();

        String teaName, sub, departName;
        int cabinNum;
        department tea1 = new department();
        teaName = tea1.teacherName();
        sub = tea1.subject();
        departName = tea1.departmentName();
        cabinNum = tea1.cabinNumber();

        System.out.println("Name of teacher is = " + teaName);
        System.out.println("Name of subject is = " + sub);
        System.out.println("Name of department is = " + departName);
        System.out.println("Allocated cabin number is = " + cabinNum);
    }

}