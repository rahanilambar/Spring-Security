/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antech.springsecurity.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nilambar
 */
@Entity
@Table(name = "user_role_map")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserRoleMap.findAll", query = "SELECT u FROM UserRoleMap u")})
public class UserRoleMap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_role_map_id")
    private Integer userRoleMapId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private UserMaster userId;
    @JoinColumn(name = "user_role_id", referencedColumnName = "user_role_id")
    @ManyToOne(optional = false)
    private UserRoles userRoleId;

    public UserRoleMap() {
    }

    public UserRoleMap(Integer userRoleMapId) {
        this.userRoleMapId = userRoleMapId;
    }

    public Integer getUserRoleMapId() {
        return userRoleMapId;
    }

    public void setUserRoleMapId(Integer userRoleMapId) {
        this.userRoleMapId = userRoleMapId;
    }

    public UserMaster getUserId() {
        return userId;
    }

    public void setUserId(UserMaster userId) {
        this.userId = userId;
    }

    public UserRoles getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(UserRoles userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userRoleMapId != null ? userRoleMapId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRoleMap)) {
            return false;
        }
        UserRoleMap other = (UserRoleMap) object;
        if ((this.userRoleMapId == null && other.userRoleMapId != null) || (this.userRoleMapId != null && !this.userRoleMapId.equals(other.userRoleMapId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antech.springsecurity.models.UserRoleMap[ userRoleMapId=" + userRoleMapId + " ]";
    }
    
}
