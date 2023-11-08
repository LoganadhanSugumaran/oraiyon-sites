package com.oraiyan.siteservice.Controller;


import com.oraiyan.siteservice.Model.Area;
import com.oraiyan.siteservice.Model.Dealer;
import com.oraiyan.siteservice.Model.Site;
import com.oraiyan.siteservice.Repository.AreaRepository;
import com.oraiyan.siteservice.Repository.DealerRepository;
import com.oraiyan.siteservice.Repository.SiteRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestAPIController {

    Logger logger = LoggerFactory.getLogger(RestAPIController.class);

    @Autowired
    private AreaRepository areaRepository;

    @Autowired
    private DealerRepository dealerRepository;

    @Autowired
    private SiteRepository siteRepository;

    @GetMapping(path = "/getSites")
    public List<Site> getSites(@RequestParam(name = "areaid") Optional<Integer> areaId){
        logger.info("Calling getSites API");
        if(areaId.isPresent()) {
            return siteRepository.findByPincode(areaId.get());
        }
        else {
            return siteRepository.findAll();
        }
    }

    @GetMapping(path = "/getSites/{SiteId}")
    public Optional<Site> getSites(@PathVariable("SiteId") Integer SiteId){
        logger.info("Calling getSites/{SiteId} API");
        return siteRepository.findById(SiteId);
    }

    @GetMapping(path = "/getAreas")
    public List<Area> getArea(){
        logger.info("Calling getArea API");
        return areaRepository.findAll();
    }

    @GetMapping(path = "/getAreas/{Pincode}")
    public Optional<Area> getArea(@PathVariable("Pincode") Integer Pincode) {
        logger.info("Calling getArea/{Pincode} API");
        return areaRepository.findById(Pincode);
    }

    @GetMapping(path = "/getDealers")
    public List<Dealer> getdealers(){
        logger.info("Calling getDealers API");
        return dealerRepository.findAll();
    }

    @GetMapping(path = "/getDealers/{DealerId}")
    public Optional<Dealer> getDealers(@PathVariable("DealerId") Integer DealerId) {
        logger.info("Calling getDealers/{DealerId} API");
        return dealerRepository.findById(DealerId);
    }

}
