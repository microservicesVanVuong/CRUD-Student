package com.example.crud_sinhvien.VO;

import com.example.crud_sinhvien.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Student student;
    private Department department;
}
