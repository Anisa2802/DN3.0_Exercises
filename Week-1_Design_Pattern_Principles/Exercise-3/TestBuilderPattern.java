public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder("Intel i7", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA GTX 1660")
                .operatingSystem("Windows 10")
                .build();

        Computer computer2 = new Computer.Builder("AMD Ryzen 5", "8GB")
                .storage("512GB SSD")
                .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}
