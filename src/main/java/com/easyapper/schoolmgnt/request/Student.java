package com.easyapper.schoolmgnt.request;

import java.util.*;

public class Student {
    private Long srNo;
    private Long admNo;
    private String recNo;
    private String nameOfStudent;
    private Date admDate;
    private String sPackage;
    private String offer;
    private String subject;
    private String feeStatus;
    private Double balPynt;
    private Long aadharNo;
    private String schoolName;
    private String schoolAddress;
    private String organisationName;
    private String oganisationAddress;
    private String hyperLink;
    private Long dayTime;
    private Date startDate;
    private Date dueDate;
    private String pastRenewals;
    private String contact1;
    private String contact2;
    private String landline;
    private String address;
    private String emailAddress;
    private Date dateofBirth;
    private String fatherName;
    private String fatherOccupation;
    private String spouseName;
    private String motherName;
    private String motherOccupation;
    private String orgnisationName;
    private String remark;

    public Student() {
    }

    public Long getSrNo() {
        return srNo;
    }

    public void setSrNo(Long srNo) {
        this.srNo = srNo;
    }

    public Long getAdmNo() {
        return admNo;
    }

    public void setAdmNo(Long admNo) {
        this.admNo = admNo;
    }

    public String getRecNo() {
        return recNo;
    }

    public void setRecNo(String recNo) {
        this.recNo = recNo;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public Date getAdmDate() {
        return admDate;
    }

    public void setAdmDate(Date admDate) {
        this.admDate = admDate;
    }

    public String getsPackage() {
        return sPackage;
    }

    public void setsPackage(String sPackage) {
        this.sPackage = sPackage;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFeeStatus() {
        return feeStatus;
    }

    public void setFeeStatus(String feeStatus) {
        this.feeStatus = feeStatus;
    }

    public Double getBalPynt() {
        return balPynt;
    }

    public void setBalPynt(Double balPynt) {
        this.balPynt = balPynt;
    }

    public Long getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(Long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public String getOganisationAddress() {
        return oganisationAddress;
    }

    public void setOganisationAddress(String oganisationAddress) {
        this.oganisationAddress = oganisationAddress;
    }

    public String getHyperLink() {
        return hyperLink;
    }

    public void setHyperLink(String hyperLink) {
        this.hyperLink = hyperLink;
    }

    public Long getDayTime() {
        return dayTime;
    }

    public void setDayTime(Long dayTime) {
        this.dayTime = dayTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getPastRenewals() {
        return pastRenewals;
    }

    public void setPastRenewals(String pastRenewals) {
        this.pastRenewals = pastRenewals;
    }

    public String getContact1() {
        return contact1;
    }

    public void setContact1(String contact1) {
        this.contact1 = contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherOccupation() {
        return fatherOccupation;
    }

    public void setFatherOccupation(String fatherOccupation) {
        this.fatherOccupation = fatherOccupation;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherOccupation() {
        return motherOccupation;
    }

    public void setMotherOccupation(String motherOccupation) {
        this.motherOccupation = motherOccupation;
    }

    public String getOrgnisationName() {
        return orgnisationName;
    }

    public void setOrgnisationName(String orgnisationName) {
        this.orgnisationName = orgnisationName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "srNo=" + srNo +
                ", admNo=" + admNo +
                ", recNo='" + recNo + '\'' +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                '}';
    }
}
