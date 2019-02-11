package seedu.addressbook.commands;

/**
 * Returns the number of unique contacts in the address book.
 */
public class CountCommand extends Command {

    public static final String COMMAND_WORD = "count";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Returns the number of unique contacts in the address book. "
            + "Example: " + COMMAND_WORD;

    public static final String MESSAGE_SUCCESS = "Count: %1$s";

    public CountCommand() {}

    @Override
    public CommandResult execute() {
        int count = addressBook.getAllPersons().count();
        return new CommandResult(String.format(MESSAGE_SUCCESS, count));
    }

}
