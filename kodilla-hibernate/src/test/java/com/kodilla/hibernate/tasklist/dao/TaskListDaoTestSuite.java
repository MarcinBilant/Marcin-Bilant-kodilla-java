package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Learn module no. 17.2";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("To do",DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);
        String listName2 = readTasksList.get(0).getListName();
        String description2 = readTasksList.get(0).getDescription();


        //Then
        Assert.assertEquals(1, readTasksList.size());
        Assert.assertEquals("To do",listName2);
        Assert.assertEquals(DESCRIPTION,description2);


        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);

    }
}
