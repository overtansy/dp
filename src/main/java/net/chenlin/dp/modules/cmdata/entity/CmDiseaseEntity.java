package net.chenlin.dp.modules.cmdata.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public class CmDiseaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private Integer diseaseId;
	
	/**
	 * 疾病名
	 */
	private String diseaseName;
	
	/**
	 * 疾病定义
	 */
	private String diseaseDefinition;
	
	/**
	 * umlsId
	 */
	private String umlsId;
	
	/**
	 * meshId
	 */
	private String meshId;
	
	/**
	 * omimId
	 */
	private String omimId;
	
	/**
	 * orphanetId
	 */
	private String orphanetId;
	
	/**
	 * icd10cmId
	 */
	private String icd10cmId;
	
	/**
	 * meddraId
	 */
	private String meddraId;
	
	/**
	 * 关联疾病id
	 */
	private String linkDiseaseId;
	
    /**
     * CmDiseaseEntity constructor
     */
	public CmDiseaseEntity() {
		super();
	}

    /**
     * setter for diseaseId
     * @param diseaseId
     */
	public void setDiseaseId(Integer diseaseId) {
		this.diseaseId = diseaseId;
	}

    /**
     * getter for diseaseId
     */
	public Integer getDiseaseId() {
		return diseaseId;
	}

    /**
     * setter for diseaseName
     * @param diseaseName
     */
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

    /**
     * getter for diseaseName
     */
	public String getDiseaseName() {
		return diseaseName;
	}

    /**
     * setter for diseaseDefinition
     * @param diseaseDefinition
     */
	public void setDiseaseDefinition(String diseaseDefinition) {
		this.diseaseDefinition = diseaseDefinition;
	}

    /**
     * getter for diseaseDefinition
     */
	public String getDiseaseDefinition() {
		return diseaseDefinition;
	}

    /**
     * setter for umlsId
     * @param umlsId
     */
	public void setUmlsId(String umlsId) {
		this.umlsId = umlsId;
	}

    /**
     * getter for umlsId
     */
	public String getUmlsId() {
		return umlsId;
	}

    /**
     * setter for meshId
     * @param meshId
     */
	public void setMeshId(String meshId) {
		this.meshId = meshId;
	}

    /**
     * getter for meshId
     */
	public String getMeshId() {
		return meshId;
	}

    /**
     * setter for omimId
     * @param omimId
     */
	public void setOmimId(String omimId) {
		this.omimId = omimId;
	}

    /**
     * getter for omimId
     */
	public String getOmimId() {
		return omimId;
	}

    /**
     * setter for orphanetId
     * @param orphanetId
     */
	public void setOrphanetId(String orphanetId) {
		this.orphanetId = orphanetId;
	}

    /**
     * getter for orphanetId
     */
	public String getOrphanetId() {
		return orphanetId;
	}

    /**
     * setter for icd10cmId
     * @param icd10cmId
     */
	public void setIcd10cmId(String icd10cmId) {
		this.icd10cmId = icd10cmId;
	}

    /**
     * getter for icd10cmId
     */
	public String getIcd10cmId() {
		return icd10cmId;
	}

    /**
     * setter for meddraId
     * @param meddraId
     */
	public void setMeddraId(String meddraId) {
		this.meddraId = meddraId;
	}

    /**
     * getter for meddraId
     */
	public String getMeddraId() {
		return meddraId;
	}

    /**
     * setter for linkDiseaseId
     * @param linkDiseaseId
     */
	public void setLinkDiseaseId(String linkDiseaseId) {
		this.linkDiseaseId = linkDiseaseId;
	}

    /**
     * getter for linkDiseaseId
     */
	public String getLinkDiseaseId() {
		return linkDiseaseId;
	}

    /**
     * CmDiseaseEntity.toString()
     */
    @Override
    public String toString() {
        return "CmDiseaseEntity{" +
               "diseaseId='" + diseaseId + '\'' +
               ", diseaseName='" + diseaseName + '\'' +
               ", diseaseDefinition='" + diseaseDefinition + '\'' +
               ", umlsId='" + umlsId + '\'' +
               ", meshId='" + meshId + '\'' +
               ", omimId='" + omimId + '\'' +
               ", orphanetId='" + orphanetId + '\'' +
               ", icd10cmId='" + icd10cmId + '\'' +
               ", meddraId='" + meddraId + '\'' +
               ", linkDiseaseId='" + linkDiseaseId + '\'' +
               '}';
    }

}
