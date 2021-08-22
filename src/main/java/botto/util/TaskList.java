package botto.util;

import botto.BottoException;
import botto.task.Task;

import java.util.List;

/**
 * This class contains the task list and handles operations like add/delete tasks in the list
 */
public class TaskList {

    private List<Task> tasks;

    /**
     * Constructor for a task list
     *
     * @param tasks list of the user's tasks
     */
    public TaskList(List<Task> tasks) {
        this.tasks = tasks;
    }

    /**
     * get the user's tasks in the form of a list
     *
     * @return list of the user's tasks
     */
    public List<Task> getTasks() {
        return this.tasks;
    }

    /**
     * get the total number of the user's task
     *
     * @return size of the user's task
     */
    public int getSize() {
        return this.tasks.size();
    }

    /**
     * add the new task to the user's task list
     *
     * @param task new task to be added
     */
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    /**
     * mark the task at the specific position as done
     *
     * @param index index of the task to be marked as done
     * @return task at the specific position
     * @throws BottoException whenever there is no task in that position.
     */
    public Task markAsDone(int index) throws BottoException {
        try {
            Task subject = this.tasks.get(index);
            subject.markAsDone();

            return subject;
        } catch (Exception e) {
            throw new BottoException("☹ OOPS!!! The task does not exist.");
        }
    }


    /**
     * delete the task at the specific position
     *
     * @param index index of the task to be deleted
     * @return task at the specific position
     * @throws BottoException whenever there is no task in that position
     */
    public Task deleteTask(int index) throws BottoException {
        try {
            Task task = this.tasks.get(index);
            this.tasks.remove(index);
            return task;
        } catch (Exception e) {
            throw new BottoException("☹ OOPS!!! The task does not exist.");
        }
    }
}
