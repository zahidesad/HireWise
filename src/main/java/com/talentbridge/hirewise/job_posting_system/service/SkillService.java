/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.talentbridge.hirewise.job_posting_system.service;
import com.talentbridge.hirewise.job_posting_system.dao.SkillDAO;
import com.talentbridge.hirewise.job_posting_system.model.Skill;
/**
 *
 * @author PC
 */
public class SkillService {
    private SkillDAO skillDAO = new SkillDAO();

    // Get all skills
    public List<Skill> getAllSkills() {
        return skillDAO.findAll();
    }

    // Get all skills for a specific CV
    public List<Skill> getSkillsByCvId(int cvId) {
        return skillDAO.findByCvId(cvId);
    }

    // Add a new skill
    public void addSkill(int cvId, String skillName, String skillArea) {
        // Validate mandatory fields
        if (cvId > 0 && skillName != null && !skillName.trim().isEmpty()) {
            Skill skill = new Skill();
            skill.setCvId(cvId);
            skill.setSkillName(skillName);
            skill.setSkillArea(skillArea);
            skillDAO.insert(skill);
        } else {
            System.out.println("Invalid CV ID or skill name!");
        }
    }

    // Update an existing skill
    public void updateSkill(int skillId, String newSkillName, String newSkillArea) {
        Skill skill = skillDAO.findById(skillId);
        if (skill != null) {
            skill.setSkillName(newSkillName);
            skill.setSkillArea(newSkillArea);
            skillDAO.update(skill);
        } else {
            System.out.println("Skill not found with ID: " + skillId);
        }
    }

    // Delete a skill by ID
    public void deleteSkill(int skillId) {
        if (skillDAO.findById(skillId) != null) {
            skillDAO.delete(skillId);
        } else {
            System.out.println("Skill not found with ID: " + skillId);
        }
    }

    // Delete all skills for a specific CV
    public void deleteSkillsByCvId(int cvId) {
        List<Skill> skills = skillDAO.findByCvId(cvId);
        if (!skills.isEmpty()) {
            skillDAO.deleteByCvId(cvId);
        } else {
            System.out.println("No skills found for CV ID: " + cvId);
        }
    }
}
