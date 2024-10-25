package homework9OOPFinalStatic;

public class GameClub {
    public static void main(String[] args) {
        long first_pc_memory_size = 32L*1024*1024*1024;
        long first_pc_rom_size = 512L*1024*1024*1024;

        Computer firstPc = new Computer(first_pc_memory_size, first_pc_rom_size);

        long pc_to_break_limits_memory_size = 128L*1024*1024*1024;
        long pc_to_break_limits_rom_size = 5L*1024*1024*1024*1024;

        Computer pc_to_break_limits = Computer.generateMegaComputer(pc_to_break_limits_memory_size, pc_to_break_limits_rom_size);
    }
}
