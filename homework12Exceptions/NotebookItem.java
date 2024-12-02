package homework12Exceptions;

public class NotebookItem extends Item{
    public NotebookItem() {
        super("Notebook", 800000.0, new Gift(new SmartphoneItem()));
    }

}
