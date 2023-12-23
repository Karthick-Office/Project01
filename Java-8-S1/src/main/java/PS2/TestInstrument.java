package PS2;

import java.util.Random;

// Problem Statement 1
interface Instrument {
    void play();
}

class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute implements Instrument {
    @Override
    public void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

public class TestInstrument {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[10];
        for (int i = 0; i < instruments.length; i++) {
            if (i % 3 == 0) {
                instruments[i] = new Piano();
            } else if (i % 3 == 1) {
                instruments[i] = new Flute();
            } else {
                instruments[i] = new Guitar();
            }
        }

        for (int i = 0; i < instruments.length; i++) {
            instruments[i].play();
            System.out.println("Object at index " + i + " is a " +
                    (instruments[i] instanceof Piano ? "Piano" :
                     instruments[i] instanceof Flute ? "Flute" :
                     instruments[i] instanceof Guitar ? "Guitar":"Unknown Instrument"));
        }
    }
}

// Problem Statement 2
interface MedicineInfo {
    void displayLabel();
}

class Tablet implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Tablet: Store in a cool dry place");
    }
}

class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Syrup: Shake well before use");
    }
}

class Ointment implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment: For external use only");
    }
}

class TestMedicine {
    public static void main(String[] args) {
        MedicineInfo[] medicines = new MedicineInfo[10];
        Random random = new Random();

        for (int i = 0; i < medicines.length; i++) {
            int randomMedicineType = random.nextInt(3) + 1;

            switch (randomMedicineType) {
                case 1:
                    medicines[i] = new Tablet();
                    break;
                case 2:
                    medicines[i] = new Syrup();
                    break;
                case 3:
                    medicines[i] = new Ointment();
                    break;
            }
        }

        for (int i = 0; i < medicines.length; i++) {
            medicines[i].displayLabel();
        }
    }
}
