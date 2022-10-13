package net.chenlin.dp.modules.cmdata.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public class CmIngredientEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private Integer ingredientId;
	
	/**
	 * 分子名
	 */
	private String moleculeName;
	
	/**
	 * pubchemId
	 */
	private String pubchemCid;
	
	/**
	 * 分子结构
	 */
	private String moleculeStructure;
	
	/**
	 * 分子式
	 */
	private String moleculeFormula;
	
	/**
	 * 分子量
	 */
	private Double moleculeWeight;
	
	/**
	 * ob值
	 */
	private String obScore;
	
	/**
	 * casId
	 */
	private String casId;
	
	/**
	 * tcmidId
	 */
	private String tcmidId;
	
	/**
	 * tcmIdId
	 */
	private String tcmIdId;
	
	/**
	 * tcmspId
	 */
	private String tcmspId;
	
	/**
	 * 分子类型
	 */
	private String type;
	
	/**
	 * 关联分子id
	 */
	private String linkIngredientId;
	
    /**
     * CmIngredientEntity constructor
     */
	public CmIngredientEntity() {
		super();
	}

    /**
     * setter for ingredientId
     * @param ingredientId
     */
	public void setIngredientId(Integer ingredientId) {
		this.ingredientId = ingredientId;
	}

    /**
     * getter for ingredientId
     */
	public Integer getIngredientId() {
		return ingredientId;
	}

    /**
     * setter for moleculeName
     * @param moleculeName
     */
	public void setMoleculeName(String moleculeName) {
		this.moleculeName = moleculeName;
	}

    /**
     * getter for moleculeName
     */
	public String getMoleculeName() {
		return moleculeName;
	}

    /**
     * setter for pubchemCid
     * @param pubchemCid
     */
	public void setPubchemCid(String pubchemCid) {
		this.pubchemCid = pubchemCid;
	}

    /**
     * getter for pubchemCid
     */
	public String getPubchemCid() {
		return pubchemCid;
	}

    /**
     * setter for moleculeStructure
     * @param moleculeStructure
     */
	public void setMoleculeStructure(String moleculeStructure) {
		this.moleculeStructure = moleculeStructure;
	}

    /**
     * getter for moleculeStructure
     */
	public String getMoleculeStructure() {
		return moleculeStructure;
	}

    /**
     * setter for moleculeFormula
     * @param moleculeFormula
     */
	public void setMoleculeFormula(String moleculeFormula) {
		this.moleculeFormula = moleculeFormula;
	}

    /**
     * getter for moleculeFormula
     */
	public String getMoleculeFormula() {
		return moleculeFormula;
	}

    /**
     * setter for moleculeWeight
     * @param moleculeWeight
     */
	public void setMoleculeWeight(Double moleculeWeight) {
		this.moleculeWeight = moleculeWeight;
	}

    /**
     * getter for moleculeWeight
     */
	public Double getMoleculeWeight() {
		return moleculeWeight;
	}

    /**
     * setter for obScore
     * @param obScore
     */
	public void setObScore(String obScore) {
		this.obScore = obScore;
	}

    /**
     * getter for obScore
     */
	public String getObScore() {
		return obScore;
	}

    /**
     * setter for casId
     * @param casId
     */
	public void setCasId(String casId) {
		this.casId = casId;
	}

    /**
     * getter for casId
     */
	public String getCasId() {
		return casId;
	}

    /**
     * setter for tcmidId
     * @param tcmidId
     */
	public void setTcmidId(String tcmidId) {
		this.tcmidId = tcmidId;
	}

    /**
     * getter for tcmidId
     */
	public String getTcmidId() {
		return tcmidId;
	}

    /**
     * setter for tcmIdId
     * @param tcmIdId
     */
	public void setTcmIdId(String tcmIdId) {
		this.tcmIdId = tcmIdId;
	}

    /**
     * getter for tcmIdId
     */
	public String getTcmIdId() {
		return tcmIdId;
	}

    /**
     * setter for tcmspId
     * @param tcmspId
     */
	public void setTcmspId(String tcmspId) {
		this.tcmspId = tcmspId;
	}

    /**
     * getter for tcmspId
     */
	public String getTcmspId() {
		return tcmspId;
	}

    /**
     * setter for type
     * @param type
     */
	public void setType(String type) {
		this.type = type;
	}

    /**
     * getter for type
     */
	public String getType() {
		return type;
	}

    /**
     * setter for linkIngredientId
     * @param linkIngredientId
     */
	public void setLinkIngredientId(String linkIngredientId) {
		this.linkIngredientId = linkIngredientId;
	}

    /**
     * getter for linkIngredientId
     */
	public String getLinkIngredientId() {
		return linkIngredientId;
	}

    /**
     * CmIngredientEntity.toString()
     */
    @Override
    public String toString() {
        return "CmIngredientEntity{" +
               "ingredientId='" + ingredientId + '\'' +
               ", moleculeName='" + moleculeName + '\'' +
               ", pubchemCid='" + pubchemCid + '\'' +
               ", moleculeStructure='" + moleculeStructure + '\'' +
               ", moleculeFormula='" + moleculeFormula + '\'' +
               ", moleculeWeight='" + moleculeWeight + '\'' +
               ", obScore='" + obScore + '\'' +
               ", casId='" + casId + '\'' +
               ", tcmidId='" + tcmidId + '\'' +
               ", tcmIdId='" + tcmIdId + '\'' +
               ", tcmspId='" + tcmspId + '\'' +
               ", type='" + type + '\'' +
               ", linkIngredientId='" + linkIngredientId + '\'' +
               '}';
    }

}
