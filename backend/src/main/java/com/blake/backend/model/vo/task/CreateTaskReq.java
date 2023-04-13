package com.blake.backend.model.vo.task;

import com.blake.backend.model.vo.BaseRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class CreateTaskReq implements BaseRequest {

    @NotNull
    private Integer calendarId;
    @NotBlank
    private String taskName;
    private String description;
    private Integer status;
    private List<Integer> tags;
    private String startDate;
    private String dueDate;
    @Valid
    private List<SubTaskReq> subTaskReqs;


    @Data
    public static final class SubTaskReq {

        @NotBlank
        private String name;
        private String description;
        private Integer status;
        private List<Integer> tags;
        private String startDate;
        private String dueDate;
    }
}
