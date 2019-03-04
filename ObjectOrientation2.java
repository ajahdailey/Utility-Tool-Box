public class ObjectOrientation2 {

    //Animal Interface
    public interface Animal {
        String move();
        int getSpeed();
        String color();
    }

    //Bird Class
    public abstract class Bird implements Animal {
        public String move() {
            return "fly";
        }

        public void setMigrationMonth(String expected) {

        }

        public String getMigrationMonth() {
            return null;
        }

    }

    //BlueJay Class
    public class BlueJay extends Bird {
        @Override
        public int getSpeed() {
            return 13;
        }

        @Override
        public String color() {
            return "blue";
        }
    }

    //Horse Class
    public class Horse implements Animal{
        @Override
        public String move() {
            return "gallop";
        }

        @Override
        public int getSpeed() {
            return 40;
        }

        @Override
        public String color() {
            return "brown";
        }
    }

    //RedRobin Class
    public class RedRobin extends Bird {
        private String migrationMonth;

        @Override
        public int getSpeed() {
            return 10;
        }

        @Override
        public String color() {
            return "red";
        }

        @Override
        public String getMigrationMonth() {
            return migrationMonth;
        }

        @Override
        public void setMigrationMonth(String migrationMonth) {
            this.migrationMonth = migrationMonth;
        }
    }

    //Speed Comparator Class
    //import java.util.Comparator;
    public class SpeedComparator implements Comparator<Animal> {

        @Override
        public int compare(Animal animal1, Animal animal2) {
            Integer animal1Speed = animal1.getSpeed();
            Integer animal2Speed = animal2.getSpeed();

            if (animal1Speed == animal2Speed) {
                return 0;
            } else if (animal1Speed > animal2Speed) {
                return -1;
            } else {
                return 1;
            }

            //Another way to answer this without the if statement
            //would be to return o2Speed.compareTo(o1Speed);
        }
    }



}
