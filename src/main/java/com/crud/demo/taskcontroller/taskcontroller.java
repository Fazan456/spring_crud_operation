package com.crud.demo.taskcontroller;
import com.crud.demo.taskservice.taskservice;
import com.crud.demo.taskentity.taskentity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("tasks")
public class taskcontroller {

	@Autowired
    private taskservice TaskService;

    @PostMapping("/tasks/create")
    public String addtask(@RequestBody taskentity taskentity){
        TaskService.addTask(taskentity);
        return "Task Added Successfully...";
    }

    @GetMapping("")
    public List<taskentity> getTasks(){
        System.out.println("Tasks..");
        return TaskService.getTask();
    }

    @GetMapping("/tasks/{id}")
    public taskentity getTaskById(@PathVariable("id") long id){
        return TaskService.getTaskByid(id);
    }

    @PutMapping("/tasks/update/{id}")
    public String updateTask(@PathVariable("id") long id, @RequestBody taskentity taskentity){
        TaskService.updateTask(id, taskentity);
        return "Task Updated Successfully...";
    }

    @DeleteMapping("/tasks/delete/{id}")
    public String deleteTask(@PathVariable("id") long id){
        TaskService.deleteTask(id);
        return "Task Deleted Successfully...";
    }

}
