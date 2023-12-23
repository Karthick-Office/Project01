package PS8;

import java.util.function.Consumer;

class Mobile {
    private int ram;
    private int storage;
    private int battery;
    private int camera;
    private String processor;
    private double screenSize;

    public Mobile(MobileBuilder builder) {
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.battery = builder.battery;
        this.camera = builder.camera;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
    }

    @Override
    public String toString() {
        return String.format("Specifications- RAM: %d Storage: %d Battery: %d\nCamera: %dMP Processor: %s Display: %f",
                ram, storage, battery, camera, processor, screenSize);
    }
}

class MobileBuilder {
    int ram;
    int storage;
    int battery;
    int camera;
    String processor;
    double screenSize;

    public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
        buildFields.accept(this);
        return this;
    }

    public Mobile createMobile() {
        return new Mobile(this);
    }
}

public class TestBuilderPattern {
    public static void main(String[] args) {
        Mobile mobile = new MobileBuilder()
                .with(builder -> {
                    builder.ram = 4;
                    builder.storage = 0;
                    builder.battery = 4000;
                    builder.camera = 0;
                    builder.processor = "A12 Bionic";
                    builder.screenSize = 0.000000;
                })
                .createMobile();

        System.out.println(mobile);
    }
}
