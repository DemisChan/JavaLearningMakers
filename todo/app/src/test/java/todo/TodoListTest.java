/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package todo;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class TodoListTest {
    @Test public void emptyTodo() {
        TodoList todo = new TodoList();
        ArrayList<String> result = new ArrayList<String>();
        assertEquals(result, todo.get());
    }


    @Test public void addTask() {
        TodoList todo = new TodoList();
        String todos = "Study Java";
        ArrayList<String> result = new ArrayList<String>();
        result.add(todos);
        todo.addTodo(todos);

        assertEquals(result, todo.get());
    }

}