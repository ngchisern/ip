public class ExitCommand implements Command{
    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        ui.sayGoodBye();
    }

    @Override
    public boolean isExit() {
        return true;
    }
}
