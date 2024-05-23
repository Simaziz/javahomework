package homeWork;
public class Main {
    private final static  CourseService courseService = new CourseImplement();
    public static void main(String[] args) {

        while (true){
            switch (Menu.menu()){
                case 1 -> courseService.addNewCourse();
                case 2-> courseService.listCourse();
                case 3-> courseService.findCourseByID();
                case 4->courseService.findCourseByTitle();
                case 5->courseService.removeCourseByID();
                case 0 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            }
        }
    }
}
