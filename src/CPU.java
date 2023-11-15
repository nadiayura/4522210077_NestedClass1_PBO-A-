import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }

    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public class HardDisk {
        int kapasitas;
        String manufacturer;

        HardDisk(int kapasitas, String manufacturer) {
            this.kapasitas = kapasitas;
            this.manufacturer = manufacturer;
        }

        public void getInfoHardDisk() {
            System.out.println("Kapasitas HardDisk: " + this.kapasitas);
            System.out.println("Pabrik HardDisk: " + this.manufacturer);
        }
    }

    public class VGA {
        String namaVGA;
        int memory;

        VGA(String namaVGA, int memory) {
            this.namaVGA = namaVGA;
            this.memory = memory;
        }

        public void getInfoVGA() {
            System.out.println("Nama VGA: " + this.namaVGA);
            System.out.println("Memory VGA: " + this.memory);
        }
    }

    public class Motherboard {
        String namaMotherboard;
        String chipset;

        Motherboard(String namaMotherboard, String chipset) {
            this.namaMotherboard = namaMotherboard;
            this.chipset = chipset;
        }

        public void getInfoMotherboard() {
            System.out.println("Nama Motherboard: " + this.namaMotherboard);
            System.out.println("Chipset Motherboard: " + this.chipset);
        }
    }

    public class PowerSupply {
        int wattage;
        String manufacturerPowerSupply;

        PowerSupply(int wattage, String manufacturerPowerSupply) {
            this.wattage = wattage;
            this.manufacturerPowerSupply = manufacturerPowerSupply;
        }

        public void getInfoPowerSupply() {
            System.out.println("Wattage: " + this.wattage);
            System.out.println("Pabrik PowerSupply: " + this.manufacturerPowerSupply);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }
}
