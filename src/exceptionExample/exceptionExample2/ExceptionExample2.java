package exceptionExample.exceptionExample2;

public class ExceptionExample2 {

    public static class Dog {
        String name;
        boolean isCollarPutOn;
        boolean isLeashPutOn;
        boolean isMuzzlePutOn;

        public Dog(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Dog dog = new Dog("Oscar");
            dog.putCollar();
            dog.putLeash();
            try {
                dog.walk(); // Unhandled exception: DogIsNotReadyException
            } catch (DogIsNotReadyException e) {
                System.out.println(e.getMessage());
                System.out.println("Checking your equipment! " +
                        "\n Is the collar on? " + dog.isCollarPutOn
                        + "\n Is the leash on? "
                        + dog.isLeashPutOn + "\n Dog wearing a muzzle? " + dog.isMuzzlePutOn);
            }
        }

        public void putCollar() {

            System.out.println("The collar is on!");
            this.isCollarPutOn = true;
        }

        public void putLeash() {

            System.out.println("The leash is on!");
            this.isLeashPutOn = true;
        }

        public void putMuzzle() {
            System.out.println("The muzzle is on!");
            this.isMuzzlePutOn = true;
        }

        public void walk() throws DogIsNotReadyException {

            System.out.println("Let's go for a walk!");
            if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn) {
                System.out.println("Hurray, let's go for a walk! " + name + " very glad!");
            } else {
                throw new DogIsNotReadyException("Dog " + name +
                        " not ready for a walk! Check your outfit!");
            }
        }
    }
}
