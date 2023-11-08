package com.oraiyan.siteservice.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "site")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Site {
    @Id
    @Column(name = "siteid")
    private Integer siteId;
    @Column(name = "pincode")
    private Integer pincode;
    @Column(name = "length")
    private String length;
    @Column(name = "width")
    private String width;
    @Column(name = "area")
    private String area;
}
