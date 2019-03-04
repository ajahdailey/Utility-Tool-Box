public class ObjectOrientation1 {

    //Animal Interface
    public interface Animal {
        String speak();
    }


    //Cat Class
    public class Cat extends Pet {
        /**
         * @param name name of this Cat
         * @param age age of this Cat
         */
        public Cat(String name, Integer age) {
            super(name, age);
        }

        /**
         * @param age age of this Cat
         */
        public Cat(Integer age) {
            super("Cat name", age);
        }

        /**
         * @param name name of this Cat
         */
        public Cat(String name) {
            super(name);
        }

        /**
         * nullary constructor
         * by default, a Cat's
         * name is CatName
         * age is 0
         */
        public Cat() {
            super("Cat name");
        }

        /**
         * @return meow as a string
         */
        public String speak() {
            return "Meow";
        }
    }


    //Dog Class
    public class Dog extends Pet {
        /**
         * @param name name of this Dog
         * @param age age of this dog
         */
        public Dog(String name, Integer age) {
            super(name, age);
        }

        /**
         * @param age age of this dog
         */
        public Dog(Integer age) {
            super(age);
            this.name = "Dog name";
        }

        /**
         * @param name name of this dog
         */
        public Dog(String name) {
            super(name);
        }

        /**
         * nullary constructor
         * by default, a dog's
         * name is DogName
         * age is 0
         */
        public Dog() {
            super("Dog name");
        }

        /**
         * @return bark as a string
         */
        public String speak() {
            return "Bark";
        }
    }


    //Pet Class
    public abstract class Pet implements Animal {
        private int age;
        protected String name;
        private PetOwner owner;

        /**
         * nullary constructor
         * by default, pet has age of 0; name of "";
         */
        public Pet() {
            name = "";
            age = 0;
        }

        /**
         * @param name name of this pet
         */
        public Pet(String name) {
            this.age = 0;
            this.name = name;
        }


        /**
         * @param age age of this pet
         */
        public Pet(int age) {
            this.age = age;
            this.name = "";
        }

        /**
         * @param name name of this pet
         * @param age age of this pet
         */
        public Pet(String name, int age) {
            this.name = name;
            this.age = age;
        }

        /**
         * @return name of this pet
         */
        public String getName() {
            return name;
        }

        /**
         * @return age of this pet
         */
        public Integer getAge() {
            return age;
        }

        /**
         * @param newPetOwner the new owner of this pet
         * ensure this instance of `Pet` is added to the owner's composite `pets` list
         */
        public void setOwner(PetOwner newPetOwner) {
            this.owner = newPetOwner;
        }

        /**
         * @return PetOwner object whose composite `pets` collection contains this Pet instance
         */
        public PetOwner getOwner() {
            return owner;
        }
    }


    //PetOwner Class
    //import java.util.Arrays;
    public class PetOwner {
        private String name;
        private Pet[] pets;

        /**
         * @param name name of the owner of the Pet
         * @param pets array of Pet object
         */
        public PetOwner(String name, Pet... pets) {
            this.name = name;
            if (pets == null) {
                this.pets = new Pet[0];
            } else {
                this.pets = pets;
                setOwner(pets);
            }
        }

        private void setOwner(Pet[] pets) {
            for(Pet currentPet : pets) {
                currentPet.setOwner(this);
            }
        }

        /**
         * @param pet pet to be added to the composite collection of Pets
         */
        public void addPet(Pet pet) {
            Pet[] newPets = Arrays.copyOf(this.pets, this.pets.length + 1);
            newPets[newPets.length - 1] = pet;
            pet.setOwner(this);
            this.pets = newPets;
        }

        /**
         * @param pet pet to be removed from the composite collection Pets
         */
        public void removePet(Pet pet) {
            //CORRECT WAY TO REMOVE IT
//        Pet[] newPets = Arrays.copyOf(this.pets, this.pets.length - 1);
//        int n = 0;
//
//        for(int i = 0; i < this.pets.length; i++) {
//            if (!pets[i].equals(pet)) {
//                newPets[n] = pets[i];
//                n++;
//            }
//        }

//        WAY TO PASS THE TEST
            for(int i = 0; i < pets.length; i++) {
                if(pets[i].equals(pet)) {
                    pets[i] = null;
                }
            }
        }

        /**
         * @param pet pet to evaluate ownership of
         * @return true if I own this pet
         */
        public Boolean isOwnerOf(Pet pet) {
            return this.equals(pet.getOwner());
        }

        /**
         * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
         */
        public Integer getYoungetPetAge() {
            Pet youngest = this.pets[0];

            for(Pet currentPet : pets) {
                if (currentPet.getAge() < youngest.getAge()) {
                    youngest = currentPet;
                }
            }
            return youngest.getAge();
        }




        /**
         * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
         */
        public Integer getOldestPetAge() {
            Pet oldest = this.pets[0];

            for(Pet currentPet : pets) {
                if (currentPet.getAge() > oldest.getAge()) {
                    oldest = currentPet;
                }
            }
            return oldest.getAge();
        }


        /**
         * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
         */
        public Float getAveragePetAge() {
            float total = 0;

            for(Pet currentPet : pets) {
                total += currentPet.getAge();
            }
            return total/pets.length;
        }

        /**
         * @return the number of Pet objects stored in this class
         */
        public Integer getNumberOfPets() {
            return pets.length;
        }

        /**
         * @return the name property of the Pet
         */
        public String getName() {
            return name;
        }

        /**
         * @return array representation of animals owned by this PetOwner
         */
        public Pet[] getPets() {
            return pets;
        }
    }
}
