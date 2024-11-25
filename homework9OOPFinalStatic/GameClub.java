package homework9OOPFinalStatic;

public class GameClub {
    public static void main(String[] args) {
        long firstPcMemorySize = 32L*1024*1024*1024;
        long firstPcRomSize = 512L*1024*1024*1024;

        Computer firstPc = new Computer(firstPcMemorySize, firstPcRomSize);

        long pcToBreakLimitsMemorySize = 128L*1024*1024*1024;
        long pcToBreakLimitsRomSize = 5L*1024*1024*1024*1024;

        Computer pc_to_break_limits = Computer.generateMegaComputer(pcToBreakLimitsMemorySize, pcToBreakLimitsRomSize);
    }
}
