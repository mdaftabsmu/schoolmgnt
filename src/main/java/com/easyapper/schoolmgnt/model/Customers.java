package com.easyapper.schoolmgnt.model;

import com.easyapper.schoolmgnt.request.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "customers")
public class Customers{
        @Id
        @GeneratedValue(strategy =  GenerationType.IDENTITY)
        private Long id;
        @Column
        private String registration_no;
        @Column
        private int store_owner_id;
        @Column
        private int instructor_id;
        @Column
        private String first_name;
        @Column
        private String last_name;
        @Column
        private String email;
        @Column
        private String password;
        @Column
        private String phone;
        @Column
        private String image;
        @Column
        private String description;
        @Column
        private String source;
        @Column
        private String custom_customer_link;
        @Column
        private String health;
        @Column
        private int alt_contact;
        @Column
        private String contact_name;
        @Column
        private Date dob;
        @Column
        private String address;
        @Column
        private String city;
        @Column
        private String state;
        @Column
        private String zip_code;
        @Column
        private String country;
        @Column
        private Date registration_date;
        @Column
        private String reference_no;
        @Column
        private String school_name;
        @Column
        private String father_name;
        @Column
        private String mother_name;
        @Column
        private String father_mob;
        @Column
        private String mother_mob;
        @Column
        private String id_proof;
        @Column
        private String address_proof;

        public Customers(Student st) {
                this.registration_no=st.getRecNo();
                this.first_name=st.getNameOfStudent();
                this.email=st.getEmailAddress();
                this.phone=st.getContact1();
                this.image=st.getHyperLink();// to be discuss
                this.description=st.getRemark();
                this.custom_customer_link=st.getHyperLink(); // to be discuss
                this.contact_name=st.getFatherName();
                this.dob = st.getDateofBirth();
                this.address=st.getAddress();
                this.school_name=st.getSchoolName();
                this.father_name=st.getFatherName();
                this.mother_name=st.getMotherName();
                this.father_mob=st.getContact1();
        }

        public String getRegistration_no(){
                return registration_no;
        }

        public void setRegistration_no(String registration_no){
                this.registration_no=registration_no;
        }

        public int getStore_owner_id(){
                return store_owner_id;
        }

        public void setStore_owner_id(int store_owner_id){
                this.store_owner_id=store_owner_id;
        }

        public int getInstructor_id(){
                return instructor_id;
        }

        public void setInstructor_id(int instructor_id){
                this.instructor_id=instructor_id;
        }

        public String getFirst_name(){
                return first_name;
        }

        public void setFirst_name(String first_name){
                this.first_name=first_name;
        }

        public String getLast_name(){
                return last_name;
        }

        public void setLast_name(String last_name){
                this.last_name=last_name;
        }

        public String getEmail(){
                return email;
        }

        public void setEmail(String email){
                this.email=email;
        }

        public String getPassword(){
                return password;
        }

        public void setPassword(String password){
                this.password=password;
        }

        public String getPhone(){
                return phone;
        }

        public void setPhone(String phone){
                this.phone=phone;
        }

        public String getImage(){
                return image;
        }

        public void setImage(String image){
                this.image=image;
        }

        public String getDescription(){
                return description;
        }

        public void setDescription(String description){
                this.description=description;
        }

        public String getSource(){
                return source;
        }

        public void setSource(String source){
                this.source=source;
        }

        public String getCustom_customer_link(){
                return custom_customer_link;
        }

        public void setCustom_customer_link(String custom_customer_link){
                this.custom_customer_link=custom_customer_link;
        }

        public String getHealth(){
                return health;
        }

        public void setHealth(String health){
                this.health=health;
        }

        public int getAlt_contact(){
                return alt_contact;
        }

        public void setAlt_contact(int alt_contact){
                this.alt_contact=alt_contact;
        }

        public String getContact_name(){
                return contact_name;
        }

        public void setContact_name(String contact_name){
                this.contact_name=contact_name;
        }

        public java.util.Date getDob(){
                return dob;
        }

        public void setDob(java.util.Date dob){
                this.dob=dob;
        }

        public String getAddress(){
                return address;
        }

        public void setAddress(String address){
                this.address=address;
        }

        public String getCity(){
                return city;
        }

        public void setCity(String city){
                this.city=city;
        }

        public String getState(){
                return state;
        }

        public void setState(String state){
                this.state=state;
        }

        public String getZip_code(){
                return zip_code;
        }

        public void setZip_code(String zip_code){
                this.zip_code=zip_code;
        }

        public String getCountry(){
                return country;
        }

        public void setCountry(String country){
                this.country=country;
        }

        public java.util.Date getRegistration_date(){
                return registration_date;
        }

        public void setRegistration_date(java.util.Date registration_date){
                this.registration_date=registration_date;
        }

        public String getReference_no(){
                return reference_no;
        }

        public void setReference_no(String reference_no){
                this.reference_no=reference_no;
        }

        public String getSchool_name(){
                return school_name;
        }

        public void setSchool_name(String school_name){
                this.school_name=school_name;
        }

        public String getFather_name(){
                return father_name;
        }

        public void setFather_name(String father_name){
                this.father_name=father_name;
        }

        public String getMother_name(){
                return mother_name;
        }

        public void setMother_name(String mother_name){
                this.mother_name=mother_name;
        }

        public String getFather_mob(){
                return father_mob;
        }

        public void setFather_mob(String father_mob){
                this.father_mob=father_mob;
        }

        public String getMother_mob(){
                return mother_mob;
        }

        public void setMother_mob(String mother_mob){
                this.mother_mob=mother_mob;
        }

        public String getId_proof(){
                return id_proof;
        }

        public void setId_proof(String id_proof){
                this.id_proof=id_proof;
        }

        public String getAddress_proof(){
                return address_proof;
        }

        public void setAddress_proof(String address_proof){
                this.address_proof=address_proof;
        }
}
