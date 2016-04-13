/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coarkpro.asotilp.swinnrestful.entity.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author asotilp
 */
@javax.ws.rs.ApplicationPath("wr")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.coarkpro.asotilp.swinnrestful.entity.NewCrossOriginResourceSharingFilter.class);
        resources.add(com.coarkpro.asotilp.swinnrestful.entity.service.AccessFacadeREST.class);
        resources.add(com.coarkpro.asotilp.swinnrestful.entity.service.ModuleFacadeREST.class);
        resources.add(com.coarkpro.asotilp.swinnrestful.entity.service.ProfileFacadeREST.class);
        resources.add(com.coarkpro.asotilp.swinnrestful.entity.service.StateFacadeREST.class);
        resources.add(com.coarkpro.asotilp.swinnrestful.entity.service.TypeFacadeREST.class);
        resources.add(com.coarkpro.asotilp.swinnrestful.entity.service.UserFacadeREST.class);
    }
    
}
