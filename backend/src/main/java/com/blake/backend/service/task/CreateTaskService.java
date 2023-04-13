package com.blake.backend.service.task;

import com.blake.backend.enums.ErrorType;
import com.blake.backend.exception.ServiceException;
import com.blake.backend.model.entity.Tasks;
import com.blake.backend.model.vo.task.CreateTaskReq;
import com.blake.backend.model.vo.task.CreateTaskRes;
import com.blake.backend.repository.CalendarsRepository;
import com.blake.backend.repository.TasksRepository;
import com.blake.backend.service.BaseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class CreateTaskService implements BaseService<CreateTaskReq, CreateTaskRes>  {

    private final TasksRepository tasksRepository;

    private final CalendarsRepository calendarsRepository;

    @Override
    public CreateTaskRes execute(CreateTaskReq request) {

        if(calendarsRepository.existsById(request.getCalendarId())){
            throw new ServiceException(ErrorType.CALENDAR_NOT_FOUND);
        }

        Tasks tasks = new Tasks();
//        tasks.setTaskName(request.getName());
//        tasks.setTaskId();
        return new CreateTaskRes();
    }
}
