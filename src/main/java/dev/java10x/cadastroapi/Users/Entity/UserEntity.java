package dev.java10x.cadastroapi.Users.Entity;

import dev.java10x.cadastroapi.Tasks.Entity.TaskEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//JPA -> Java Persistence API
@Entity // Turns a Class into a DB Entity
@Table(name = "tb_users")
@NoArgsConstructor
@Getter
@Setter
public class UserEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int age;

    // @ManyToOne - a user have only one task
    @ManyToOne
    @JoinColumn(name = "task_id") // Foreign Key
    private TaskEntity task;





}
