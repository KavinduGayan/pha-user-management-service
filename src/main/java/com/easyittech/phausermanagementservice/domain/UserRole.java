package com.easyittech.phausermanagementservice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "user_role")
@Getter
@Setter
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleId;
    private String description;
    private String status;
    @Column(name = "inserted_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertedDate;
    @ManyToMany
    @JoinTable(
            name = "user_role_privilege",
            joinColumns = @JoinColumn(name = "role_id" ),
            inverseJoinColumns = @JoinColumn(name = "privilege_id")
    )
    Set<UserPrivilege> user_privileges;
}
