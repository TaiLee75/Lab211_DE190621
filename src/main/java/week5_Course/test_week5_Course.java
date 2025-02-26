
package week5_Course;

public class test_week5_Course {
   
    
    public static void main(String[] args) {
        CourseListView course = new CourseListView();
        
        
        String[] options = {
            "Add online course/ offline course",
            "Update courses",
            "Delete course",
            "Print all / online course / offline course",
            "Search information base on course name",
            "Exit"
        };
        
        
        Menu menu = new Menu("*** Course Management ***", options) {
            @Override
            public void execute(int n) {
                switch (n) {
                    case 1:
                        course.addCourse();
                        break;
                    case 2:
                       course.updateCourse();
                        break;
                    case 3:
                        course.deleteCourse();
                        break;
                    case 4:
                        course.printCourse();
                        break;
                    case 5:
                        course.findByID();
                        break;
                    case 6:
                        System.exit(0);
                }
            }

        };

        menu.run();
        
        
    }
    
    
    
}
