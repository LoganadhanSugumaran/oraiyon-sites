package com.oraiyan.siteservice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "area")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Area {
    @Id
    @Column(name = "pincode")
    private Integer pincode;
    @Column(name = "name")
    private String name;
    @Column(name = "dealerid")
    private Integer dealerId;

}
