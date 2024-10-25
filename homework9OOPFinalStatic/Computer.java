package homework9OOPFinalStatic;

public class Computer {
    private static int computersCount;

    // memory unit is bytes
    private long ram;
    private long rom;
    private int computerId;

    private static int getNewComputerId() {
        return computersCount++;
    }

    public static Computer generateMegaComputer(long ram, long rom) {
        return new Computer(ram, rom, true);
    }

    public Computer(long ram, long rom) {
        setComputerId(getNewComputerId());

        setRam(ram);
        setRom(rom);
    }

    private Computer(long ram, long rom, boolean breakLimits) {
        setComputerId(getNewComputerId());

        this.ram = ram;
        this.rom = rom;
    }

    public long getRam() {
        return ram;
    }

    public void setRam(long ram) {
        if (0<= ram && ram <= (64L*1024*1024*1024)){
            this.ram = ram;
        } else {
            System.out.println("Ram is out of accepted range: " + ram);
        }
    }

    public long getRom() {
        return rom;
    }

    public void setRom(long rom) {
        if (0<= rom && rom <= (2L*1024*1024*1024*1024)){
            this.rom = rom;
        } else {
            System.out.println("Rom is out of accepted range: " + rom);
        }
    }

    public int getComputerId() {
        return computerId;
    }

    private void setComputerId(int computerId) {
        this.computerId = computerId;
    }
}
