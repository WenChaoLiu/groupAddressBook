/**
 * AdcSiRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cmcc.zysoft.groupaddressbook.webservice.client;

public class AdcSiRequest implements java.io.Serializable {
	
	private static final long serialVersionUID = 3092390868598031338L;
	
    private java.lang.String SIAppID;

    private int actionCode;

    private java.lang.String bizCode;

    private int dealkind;

    private int priority;

    private java.lang.String svcCont;

    private int testFlag;

    private java.lang.String timeStamp;

    private java.lang.String transID;

    private java.lang.String version;

    public AdcSiRequest() {
    }

	public AdcSiRequest(java.lang.String SIAppID, int actionCode,
			java.lang.String bizCode, int dealkind, int priority,
			java.lang.String svcCont, int testFlag, java.lang.String timeStamp,
			java.lang.String transID, java.lang.String version) {
		this.SIAppID = SIAppID;
		this.actionCode = actionCode;
		this.bizCode = bizCode;
		this.dealkind = dealkind;
		this.priority = priority;
		this.svcCont = svcCont;
		this.testFlag = testFlag;
		this.timeStamp = timeStamp;
		this.transID = transID;
		this.version = version;
	}


    /**
     * Gets the SIAppID value for this AdcSiRequest.
     * 
     * @return SIAppID
     */
    public java.lang.String getSIAppID() {
        return SIAppID;
    }


    /**
     * Sets the SIAppID value for this AdcSiRequest.
     * 
     * @param SIAppID
     */
    public void setSIAppID(java.lang.String SIAppID) {
        this.SIAppID = SIAppID;
    }


    /**
     * Gets the actionCode value for this AdcSiRequest.
     * 
     * @return actionCode
     */
    public int getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this AdcSiRequest.
     * 
     * @param actionCode
     */
    public void setActionCode(int actionCode) {
        this.actionCode = actionCode;
    }


    /**
     * Gets the bizCode value for this AdcSiRequest.
     * 
     * @return bizCode
     */
    public java.lang.String getBizCode() {
        return bizCode;
    }


    /**
     * Sets the bizCode value for this AdcSiRequest.
     * 
     * @param bizCode
     */
    public void setBizCode(java.lang.String bizCode) {
        this.bizCode = bizCode;
    }


    /**
     * Gets the dealkind value for this AdcSiRequest.
     * 
     * @return dealkind
     */
    public int getDealkind() {
        return dealkind;
    }


    /**
     * Sets the dealkind value for this AdcSiRequest.
     * 
     * @param dealkind
     */
    public void setDealkind(int dealkind) {
        this.dealkind = dealkind;
    }


    /**
     * Gets the priority value for this AdcSiRequest.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this AdcSiRequest.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the svcCont value for this AdcSiRequest.
     * 
     * @return svcCont
     */
    public java.lang.String getSvcCont() {
        return svcCont;
    }


    /**
     * Sets the svcCont value for this AdcSiRequest.
     * 
     * @param svcCont
     */
    public void setSvcCont(java.lang.String svcCont) {
        this.svcCont = svcCont;
    }


    /**
     * Gets the testFlag value for this AdcSiRequest.
     * 
     * @return testFlag
     */
    public int getTestFlag() {
        return testFlag;
    }


    /**
     * Sets the testFlag value for this AdcSiRequest.
     * 
     * @param testFlag
     */
    public void setTestFlag(int testFlag) {
        this.testFlag = testFlag;
    }


    /**
     * Gets the timeStamp value for this AdcSiRequest.
     * 
     * @return timeStamp
     */
    public java.lang.String getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this AdcSiRequest.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.lang.String timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the transID value for this AdcSiRequest.
     * 
     * @return transID
     */
    public java.lang.String getTransID() {
        return transID;
    }


    /**
     * Sets the transID value for this AdcSiRequest.
     * 
     * @param transID
     */
    public void setTransID(java.lang.String transID) {
        this.transID = transID;
    }


    /**
     * Gets the version value for this AdcSiRequest.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this AdcSiRequest.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdcSiRequest)) return false;
        AdcSiRequest other = (AdcSiRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SIAppID==null && other.getSIAppID()==null) || 
             (this.SIAppID!=null &&
              this.SIAppID.equals(other.getSIAppID()))) &&
            this.actionCode == other.getActionCode() &&
            ((this.bizCode==null && other.getBizCode()==null) || 
             (this.bizCode!=null &&
              this.bizCode.equals(other.getBizCode()))) &&
            this.dealkind == other.getDealkind() &&
            this.priority == other.getPriority() &&
            ((this.svcCont==null && other.getSvcCont()==null) || 
             (this.svcCont!=null &&
              this.svcCont.equals(other.getSvcCont()))) &&
            this.testFlag == other.getTestFlag() &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.transID==null && other.getTransID()==null) || 
             (this.transID!=null &&
              this.transID.equals(other.getTransID()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSIAppID() != null) {
            _hashCode += getSIAppID().hashCode();
        }
        _hashCode += getActionCode();
        if (getBizCode() != null) {
            _hashCode += getBizCode().hashCode();
        }
        _hashCode += getDealkind();
        _hashCode += getPriority();
        if (getSvcCont() != null) {
            _hashCode += getSvcCont().hashCode();
        }
        _hashCode += getTestFlag();
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getTransID() != null) {
            _hashCode += getTransID().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdcSiRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://adc.siinterface.com/", "AdcSiRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIAppID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SIAppID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bizCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bizCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealkind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dealkind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcCont");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcCont"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "testFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
