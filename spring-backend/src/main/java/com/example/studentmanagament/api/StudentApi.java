package com.example.studentmanagament.api;

import com.example.studentmanagament.entity.Students;
import com.example.studentmanagament.service.impl.StudentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("http://localhost:8100")
public class StudentApi {

    private final StudentServiceImpl studentService;

    public StudentApi(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }


    @PostMapping
    public ResponseEntity<Students> createStudents(@RequestBody Students students) {
        return ResponseEntity.ok(studentService.studentCreate(students));
    }
    @GetMapping("/{created_id}")
    public ResponseEntity<List<Students>> listStudents(@PathVariable("created_id") Long createdId) {
        return ResponseEntity.ok(studentService.getAll(createdId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteStudent(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(studentService.deleteStudent(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Students> editStudents( @PathVariable("id") Long id,@Valid @RequestBody Students students) {

        return ResponseEntity.ok(studentService.editStudent(id,students));
    }



}
