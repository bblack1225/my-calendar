package com.blake.backend.controller;

import com.blake.backend.model.vo.task.CreateTaskReq;
import com.blake.backend.model.vo.task.CreateTaskRes;
import com.blake.backend.service.task.CreateTaskService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/task")
@RestController
@Tag(name = "Task", description = "Task API")
@RequiredArgsConstructor
public class TaskController {

    private final CreateTaskService createTaskService;

//    @GetMapping
//    public QueryTaskRes getTasks(){
//        return taskService.getTasks();
//    }

    @PostMapping
    public CreateTaskRes createTask(@Valid @RequestBody CreateTaskReq createTaskReq){
        return createTaskService.execute(createTaskReq);
    }
}
