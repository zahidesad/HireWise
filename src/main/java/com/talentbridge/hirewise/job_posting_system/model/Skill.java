/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.model;

import com.talentbridge.hirewise.job_posting_system.dao.CVDAO;

/**
 *
 * @author Lenovo
 */
public class Skill {
    private int skillId;
    private int cvId;
    private String skillName;
    private String skillArea;
    
    
    
    public CV getCV() {
        
        if (this.cvId <= 0) {
            return null;
        }
        CVDAO dao = new CVDAO();
        return dao.findById(this.cvId);
    }
    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public int getCvId() {
        return cvId;
    }

    public void setCvId(int cvId) {
        this.cvId = cvId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getSkillArea() {
        return skillArea;
    }

    public void setSkillArea(String skillArea) {
        this.skillArea = skillArea;
    }
}
