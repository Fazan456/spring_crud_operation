package com.crud.demo.taskservice;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.demo.taskentity.taskentity;
import com.crud.demo.taskrepository.taskrepository;

public class TaskServiceImpl implements taskservice {
	
	@Autowired
	private taskrepository taskRepository;
	
	@Override
	public taskentity addTask(taskentity taskentity) {
        return taskRepository.save(taskentity);
    }
	
	@Override
	public List<taskentity> getTask() {
        return (List<taskentity>) taskRepository.findAll();
    }
	
	@Override
	public taskentity getTaskByid(long id) {
        return  taskRepository.findById(id).get();
    }
	
	@Override
    public taskentity updateTask(long id, taskentity taskentity) {
        taskentity task1 = taskRepository.findById(id).get();
        task1.setTitle(taskentity.getTitle());
        task1.setDescription(taskentity.getDescription());
        task1.setDuedate(taskentity.getDuedate());
        task1.setStatus(taskentity.getDuedate());
        return taskRepository.save(task1);
    }

    @Override
    public void deleteTask(long id) {
        taskRepository.deleteById(id);
    }
}
