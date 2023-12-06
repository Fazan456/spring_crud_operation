package com.crud.demo.taskservice;
import org.springframework.stereotype.Service;
import com.crud.demo.taskentity.taskentity;
import com.crud.demo.taskservice.taskservice;
import java.util.List;
@Service
public interface taskservice {
	public taskentity addTask(taskentity taskentity);
	public List<taskentity> getTask();
	public taskentity getTaskByid(long id);
	public taskentity updateTask(long id, taskentity taskentity);
	public void deleteTask(long id);

}
