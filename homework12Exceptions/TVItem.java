package homework12Exceptions;

public class TVItem extends Item{
    public TVItem() {
        super("TV", 300000.0, new Gift(new HairdryerItem()));
    }

}
