/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coarkpro.asotilp.swinnrestful.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author asotilp
 */
@Entity
@Table(name = "module")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Module.findAll", query = "SELECT m FROM Module m"),
    @NamedQuery(name = "Module.findById", query = "SELECT m FROM Module m WHERE m.id = :id"),
    @NamedQuery(name = "Module.findByIconfa", query = "SELECT m FROM Module m WHERE m.iconfa = :iconfa"),
    @NamedQuery(name = "Module.findByLabel", query = "SELECT m FROM Module m WHERE m.label = :label"),
    @NamedQuery(name = "Module.findByDescription", query = "SELECT m FROM Module m WHERE m.description = :description"),
    @NamedQuery(name = "Module.findByController", query = "SELECT m FROM Module m WHERE m.controller = :controller"),
    @NamedQuery(name = "Module.findByActive", query = "SELECT m FROM Module m WHERE m.active = :active"),
    @NamedQuery(name = "Module.findByTypeId", query = "SELECT m FROM Module m WHERE m.typeId = :typeId")})
public class Module implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "iconfa")
    private String iconfa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "label")
    private String label;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "controller")
    private String controller;
    @Basic(optional = false)
    @NotNull
    @Column(name = "active")
    private boolean active;
    @Basic(optional = false)
    @NotNull
    @Column(name = "type_id")
    private int typeId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "moduleId")
    private Collection<Access> accessCollection;

    public Module() {
    }

    public Module(Integer id) {
        this.id = id;
    }

    public Module(Integer id, String label, String description, String controller, boolean active, int typeId) {
        this.id = id;
        this.label = label;
        this.description = description;
        this.controller = controller;
        this.active = active;
        this.typeId = typeId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIconfa() {
        return iconfa;
    }

    public void setIconfa(String iconfa) {
        this.iconfa = iconfa;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @XmlTransient
    public Collection<Access> getAccessCollection() {
        return accessCollection;
    }

    public void setAccessCollection(Collection<Access> accessCollection) {
        this.accessCollection = accessCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Module)) {
            return false;
        }
        Module other = (Module) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.coarkpro.asotilp.swinnrestful.entity.Module[ id=" + id + " ]";
    }
    
}
