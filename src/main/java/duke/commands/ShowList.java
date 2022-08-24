package duke.commands;

import java.io.IOException;

import duke.exceptions.DukeException;
import duke.lists.TaskList;

public class ShowList extends Display {
    protected TaskList tasks;

    public ShowList(TaskList list) {
        tasks = list;
    }

    /**
     * Prints the current taskings
     * 
     * @throws DukeException
     * @throws IOException
     */
    @Override
    public void execute() throws DukeException, IOException {
        wrapWithLines(tasks.toString());
    }
}
