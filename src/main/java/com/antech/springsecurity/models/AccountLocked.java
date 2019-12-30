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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nilambar
 */
@Entity
@Table(name = "account_locked")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountLocked.findAll", query = "SELECT a FROM AccountLocked a")})
public class AccountLocked implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "account_locked_id")
    private Integer accountLockedId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_locked")
    private boolean isLocked;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private UserMaster userId;

    public AccountLocked() {
    }

    public AccountLocked(Integer accountLockedId) {
        this.accountLockedId = accountLockedId;
    }

    public AccountLocked(Integer accountLockedId, boolean isLocked) {
        this.accountLockedId = accountLockedId;
        this.isLocked = isLocked;
    }

    public Integer getAccountLockedId() {
        return accountLockedId;
    }

    public void setAccountLockedId(Integer accountLockedId) {
        this.accountLockedId = accountLockedId;
    }

    public boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    public UserMaster getUserId() {
        return userId;
    }

    public void setUserId(UserMaster userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountLockedId != null ? accountLockedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountLocked)) {
            return false;
        }
        AccountLocked other = (AccountLocked) object;
        if ((this.accountLockedId == null && other.accountLockedId != null) || (this.accountLockedId != null && !this.accountLockedId.equals(other.accountLockedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.antech.springsecurity.models.AccountLocked[ accountLockedId=" + accountLockedId + " ]";
    }
    
}
