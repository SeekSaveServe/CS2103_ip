
package duke.commands;

import duke.enums.Messages;

/**
 * Greets the user
 */
public class GreetCommand extends DisplayCommand {

    public GreetCommand() {

    }

    /**
     * Prints the greeting message
     */
    @Override
    public void execute() {
        wrapWithLines(Messages.GREET.toString(), Messages.LOGO.toString());
    }
}
