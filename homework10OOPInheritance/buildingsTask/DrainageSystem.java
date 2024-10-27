package homework10OOPInheritance.buildingsTask;

public class DrainageSystem {
    private int drainageSystemOuts;

    public DrainageSystem(int drainageSystemOuts) {
        setDrainageSystemOuts(drainageSystemOuts);
    }

    public int getDrainageSystemOuts() {
        return drainageSystemOuts;
    }

    private void setDrainageSystemOuts(int drainageSystemOuts) {
        if (drainageSystemOuts > 0) {
            this.drainageSystemOuts = drainageSystemOuts;
        } else {
            System.out.println("Drainage System Outs' count can't be less 1");
        }
    }
}
