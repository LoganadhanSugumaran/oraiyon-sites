package com.oraiyan.siteservice.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "dealer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dealer {
    @Id
    @Column(name = "dealerid")
    private Integer dealerId;
    @Column(name = "dealername")
    private String dealerName;
    @Column(name = "phoneno")
    private String phoneNo;
    @Column(name = "email")
    private String email;

}
