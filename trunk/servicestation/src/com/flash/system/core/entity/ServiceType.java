package com.flash.system.core.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author shan
 */
@Entity
public class ServiceType implements Serializable {

    private long serviceTypeId;
    private String serviceTypeCode;
    private String serviceTypeFullName;

    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public String getServiceTypeFullName() {
        return serviceTypeFullName;
    }

    public void setServiceTypeFullName(String serviceTypeFullName) {
        this.serviceTypeFullName = serviceTypeFullName;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public long getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }
    
}
