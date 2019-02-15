package cn.spicis.adoption.domain;

import java.sql.Timestamp;
import java.util.Date;

public class Applications {
    private Integer id;

    private Integer petType;

    private Integer experience;

    private String exPetType;

    private Integer exCatAge;

    private Integer exDogAge;

    private Integer exYears;

    private String exFood;

    private String exStapleFoodBrand;

    private Integer currPets;

    private Integer affordabilityCat;

    private Integer affordabilityDog;

    private Integer masterAge;

    private Integer masterSex;

    private Integer masterMarriage;

    private Integer masterKids;

    private Integer masterSalary;

    private String masterJobType;

    private Integer housingSituation;

    private Integer rentingSituation;

    private Integer futurePlan;

    private Integer roommate;

    private Integer roomateSituation;

    private Integer roommateAgreement;

    private Integer familyAgreement;

    private Integer catWindowProtection;

    private Integer setCatWindowProtection;

    private Integer dogIdentification;

    private Integer dogString;

    private Integer masterProtocolAgreement;

    private Integer masterIdentification;

    private String masterWechat;

    private Timestamp insertTime;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPetType() {
        return petType;
    }

    public void setPetType(Integer petType) {
        this.petType = petType;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getExPetType() {
        return exPetType;
    }

    public void setExPetType(String exPetType) {
        this.exPetType = exPetType == null ? null : exPetType.trim();
    }

    public Integer getExCatAge() {
        return exCatAge;
    }

    public void setExCatAge(Integer exCatAge) {
        this.exCatAge = exCatAge;
    }

    public Integer getExDogAge() {
        return exDogAge;
    }

    public void setExDogAge(Integer exDogAge) {
        this.exDogAge = exDogAge;
    }

    public Integer getExYears() {
        return exYears;
    }

    public void setExYears(Integer exYears) {
        this.exYears = exYears;
    }

    public String getExFood() {
        return exFood;
    }

    public void setExFood(String exFood) {
        this.exFood = exFood == null ? null : exFood.trim();
    }

    public String getExStapleFoodBrand() {
        return exStapleFoodBrand;
    }

    public void setExStapleFoodBrand(String exStapleFoodBrand) {
        this.exStapleFoodBrand = exStapleFoodBrand == null ? null : exStapleFoodBrand.trim();
    }

    public Integer getCurrPets() {
        return currPets;
    }

    public void setCurrPets(Integer currPets) {
        this.currPets = currPets;
    }

    public Integer getAffordabilityCat() {
        return affordabilityCat;
    }

    public void setAffordabilityCat(Integer affordabilityCat) {
        this.affordabilityCat = affordabilityCat;
    }

    public Integer getAffordabilityDog() {
        return affordabilityDog;
    }

    public void setAffordabilityDog(Integer affordabilityDog) {
        this.affordabilityDog = affordabilityDog;
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

    public Integer getMasterMarriage() {
        return masterMarriage;
    }

    public void setMasterMarriage(Integer masterMarriage) {
        this.masterMarriage = masterMarriage;
    }

    public Integer getMasterKids() {
        return masterKids;
    }

    public void setMasterKids(Integer masterKids) {
        this.masterKids = masterKids;
    }

    public Integer getMasterSalary() {
        return masterSalary;
    }

    public void setMasterSalary(Integer masterSalary) {
        this.masterSalary = masterSalary;
    }

    public String getMasterJobType() {
        return masterJobType;
    }

    public void setMasterJobType(String masterJobType) {
        this.masterJobType = masterJobType == null ? null : masterJobType.trim();
    }

    public Integer getHousingSituation() {
        return housingSituation;
    }

    public void setHousingSituation(Integer housingSituation) {
        this.housingSituation = housingSituation;
    }

    public Integer getRentingSituation() {
        return rentingSituation;
    }

    public void setRentingSituation(Integer rentingSituation) {
        this.rentingSituation = rentingSituation;
    }

    public Integer getFuturePlan() {
        return futurePlan;
    }

    public void setFuturePlan(Integer futurePlan) {
        this.futurePlan = futurePlan;
    }

    public Integer getRoommate() {
        return roommate;
    }

    public void setRoommate(Integer roommate) {
        this.roommate = roommate;
    }

    public Integer getRoomateSituation() {
        return roomateSituation;
    }

    public void setRoomateSituation(Integer roomateSituation) {
        this.roomateSituation = roomateSituation;
    }

    public Integer getRoommateAgreement() {
        return roommateAgreement;
    }

    public void setRoommateAgreement(Integer roommateAgreement) {
        this.roommateAgreement = roommateAgreement;
    }

    public Integer getFamilyAgreement() {
        return familyAgreement;
    }

    public void setFamilyAgreement(Integer familyAgreement) {
        this.familyAgreement = familyAgreement;
    }

    public Integer getCatWindowProtection() {
        return catWindowProtection;
    }

    public void setCatWindowProtection(Integer catWindowProtection) {
        this.catWindowProtection = catWindowProtection;
    }

    public Integer getSetCatWindowProtection() {
        return setCatWindowProtection;
    }

    public void setSetCatWindowProtection(Integer setCatWindowProtection) {
        this.setCatWindowProtection = setCatWindowProtection;
    }

    public Integer getDogIdentification() {
        return dogIdentification;
    }

    public void setDogIdentification(Integer dogIdentification) {
        this.dogIdentification = dogIdentification;
    }

    public Integer getDogString() {
        return dogString;
    }

    public void setDogString(Integer dogString) {
        this.dogString = dogString;
    }

    public Integer getMasterProtocolAgreement() {
        return masterProtocolAgreement;
    }

    public void setMasterProtocolAgreement(Integer masterProtocolAgreement) {
        this.masterProtocolAgreement = masterProtocolAgreement;
    }

    public Integer getMasterIdentification() {
        return masterIdentification;
    }

    public void setMasterIdentification(Integer masterIdentification) {
        this.masterIdentification = masterIdentification;
    }

    public String getMasterWechat() {
        return masterWechat;
    }

    public void setMasterWechat(String masterWechat) {
        this.masterWechat = masterWechat == null ? null : masterWechat.trim();
    }

    public Timestamp getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Timestamp insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}