public class Main {
    public static void main(String[] args) {
        // buat object CPU
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");

        // buat objek HardDisk
        CPU.HardDisk hdd1TB = myKomputer.new HardDisk(1000, "Seagate");

        // buat objek VGA
        CPU.VGA gtx1080 = myKomputer.new VGA("GeForce GTX 1080", 8);

        // buat objek Motherboard
        CPU.Motherboard asusZ390 = myKomputer.new Motherboard("Asus Z390-A Gaming", "Z390");

        // buat objek PowerSupply
        CPU.PowerSupply corsairRM850x = myKomputer.new PowerSupply(850, "Corsair");

        // tampilkan informasi CPU
        myKomputer.getCPUInfo();

        // tampilkan informasi Processor
        i7.getProcessorInfo();

        // tampilkan informasi RAM
        rs32GB.getInfoRAM();

        // tampilkan informasi HardDisk
        hdd1TB.getInfoHardDisk();

        // tampilkan informasi VGA
        gtx1080.getInfoVGA();

        // tampilkan informasi Motherboard
        asusZ390.getInfoMotherboard();

        // tampilkan informasi PowerSupply
        corsairRM850x.getInfoPowerSupply();
    }
}