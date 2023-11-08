package com.oraiyan.siteservice.Repository;


import com.oraiyan.siteservice.Model.Site;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SiteRepository extends JpaRepository<Site,Integer> {
    List<Site> findByPincode(Integer pincode);

}
