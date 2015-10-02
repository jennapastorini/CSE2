public class HomeworkTests {
        public static void main(String args[]) {
        int x = 0;
        int y = 0;
        while (x < 3)
        {
            switch (x + y)
            {
                case 0:
                    x++;
                case 1:
                case 2:
                    y++;
                    break;
                case 3:
                    x++;
                    break;
                default:
                    y = 0;
                    break;
            }
            System.out.print(y);
        }
        } 
    }