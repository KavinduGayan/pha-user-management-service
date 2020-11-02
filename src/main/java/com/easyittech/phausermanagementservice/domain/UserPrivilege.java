package com.easyittech.phausermanagementservice.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "user_privilege")
@Getter@Setter
public class UserPrivilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "privilege_id")
    private Long privilegeId;
    private String description;
    private String status;
    @Column(name = "inserted_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date insertedDate;
    @ManyToMany(mappedBy = "user_privileges")
    Set<UserRole> roles;
}
