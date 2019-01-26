package cn.spicis.adoption.domain;

import java.util.Date;

public class CatApplications {
    private Integer id;

    private Date createTime;

    private Integer exportFalg;

    private Integer verifyFlag;

    private String catColor;

    private Integer catAge;

    private String phoneNumber;

    private String wechat;

    private Integer masterAge;

    private Integer masterSex;

    private Integer married;

    private Integer salary;

    private String address;

    private Integer housing;

    private Integer tenement;

    private String hometown;

    private Integer cotenant;

    private Integer cotenantAgreement;

    private String pets;

    private String experience;

    private Integer window;

    private String food;

    private Integer agreeProtocol;

    private Integer identityCard;

    private Integer visit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getExportFalg() {
        return exportFalg;
    }

    public void setExportFalg(Integer exportFalg) {
        this.exportFalg = exportFalg;
    }

    public Integer getVerifyFlag() {
        return verifyFlag;
    }

    public void setVerifyFlag(Integer verifyFlag) {
        this.verifyFlag = verifyFlag;
    }

    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor == null ? null : catColor.trim();
    }

    public Integer getCatAge() {
        return catAge;
    }

    public void setCatAge(Integer catAge) {
        this.catAge = catAge;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public Integer getMasterAge() {
        return masterAge;
    }

    public void setMasterAge(Integer masterAge) {
        this.masterAge = masterAge;
    }

    public Integer getMasterSex() {
        return masterSex;
    }

    public void setMasterSex(Integer masterSex) {
        this.masterSex = masterSex;
    }

    public Integer getMarried() {
        return married;
    }

    public void setMarried(Integer married) {
        this.married = married;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getHousing() {
        return housing;
    }

    public void setHousing(Integer housing) {
        this.housing = housing;
    }

    public Integer getTenement() {
        return tenement;
    }

    public void setTenement(Integer tenement) {
        this.tenement = tenement;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public Integer getCotenant() {
        return cotenant;
    }

    public void setCotenant(Integer cotenant) {
        this.cotenant = cotenant;
    }

    public Integer getCotenantAgreement() {
        return cotenantAgreement;
    }

    public void setCotenantAgreement(Integer cotenantAgreement) {
        this.cotenantAgreement = cotenantAgreement;
    }

    public String getPets() {
        return pets;
    }

    public void setPets(String pets) {
        this.pets = pets == null ? null : pets.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public Integer getWindow() {
        return window;
    }

    public void setWindow(Integer window) {
        this.window = window;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food == null ? null : food.trim();
    }

    public Integer getAgreeProtocol() {
        return agreeProtocol;
    }

    public void setAgreeProtocol(Integer agreeProtocol) {
        this.agreeProtocol = agreeProtocol;
    }

    public Integer getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(Integer identityCard) {
        this.identityCard = identityCard;
    }

    public Integer getVisit() {
        return visit;
    }

    public void setVisit(Integer visit) {
        this.visit = visit;
    }
}