package projektowanieObiektowe1;

public class Cabrio {
    String name;
    String make;
    boolean isMoving;
    boolean isRoofOpen;

    public Cabrio(String name, String make, boolean isMoving, boolean isRoofOpen) {
        this.name = name;
        this.make = make;
        this.isMoving = isMoving;
        this.isRoofOpen = isRoofOpen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public boolean isRoofOpen() {
        return isRoofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        isRoofOpen = roofOpen;
    }

    public void changeRoofPosition(boolean isRoofOpen) {
        if (isMoving) {
            System.out.println("Auto porusza sie nie mozna zmienic pozycji dachu.");
        } else {
            if (isRoofOpen) {
                isRoofOpen = false;
                System.out.println("Dach został zamkniety");
            } else {
                    isRoofOpen = true;
                    System.out.println("Dach zostal otwarty");
                }
            }

        }
    }

