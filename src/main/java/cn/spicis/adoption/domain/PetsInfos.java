package cn.spicis.adoption.domain;

import org.springframework.web.multipart.MultipartFile;

import java.sql.Timestamp;
import java.util.Date;

public class PetsInfos {
    private Integer id;

    private String name;

    private String nameEn;

    private Integer sex;

    private String age;

    private Integer neuter;

    private Integer vaccination;

    private Integer helminthic;

    private String info;

    private Timestamp insertTime;

    private Integer status;

    private MultipartFile[] file;

    public MultipartFile[] getFile() {
        return file;
    }

    public void setFile(MultipartFile[] file) {
        this.file = file;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getNeuter() {
        return neuter;
    }

    public void setNeuter(Integer neuter) {
        this.neuter = neuter;
    }

    public Integer getVaccination() {
        return vaccination;
    }

    public void setVaccination(Integer vaccination) {
        this.vaccination = vaccination;
    }

    public Integer getHelminthic() {
        return helminthic;
    }

    public void setHelminthic(Integer helminthic) {
        this.helminthic = helminthic;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
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