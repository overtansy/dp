package net.chenlin.dp.modules.cmformula.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public class CmFormulaEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private Integer formulaId;
	
	/**
	 * 方名
	 */
	private String formulaName;
	
	/**
	 * 来源
	 */
	private String source;
	
	/**
	 * 剂型
	 */
	private String type;
	
	/**
	 * 处方
	 */
	private String prescription;
	
	/**
	 * 备注
	 */
	private String remark;
	
    /**
     * CmFormulaEntity constructor
     */
	public CmFormulaEntity() {
		super();
	}

    /**
     * setter for formulaId
     * @param formulaId
     */
	public void setFormulaId(Integer formulaId) {
		this.formulaId = formulaId;
	}

    /**
     * getter for formulaId
     */
	public Integer getFormulaId() {
		return formulaId;
	}

    /**
     * setter for formulaName
     * @param formulaName
     */
	public void setFormulaName(String formulaName) {
		this.formulaName = formulaName;
	}

    /**
     * getter for formulaName
     */
	public String getFormulaName() {
		return formulaName;
	}

    /**
     * setter for source
     * @param source
     */
	public void setSource(String source) {
		this.source = source;
	}

    /**
     * getter for source
     */
	public String getSource() {
		return source;
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
     * setter for prescription
     * @param prescription
     */
	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

    /**
     * getter for prescription
     */
	public String getPrescription() {
		return prescription;
	}

    /**
     * setter for remark
     * @param remark
     */
	public void setRemark(String remark) {
		this.remark = remark;
	}

    /**
     * getter for remark
     */
	public String getRemark() {
		return remark;
	}

    /**
     * CmFormulaEntity.toString()
     */
    @Override
    public String toString() {
        return "CmFormulaEntity{" +
               "formulaId='" + formulaId + '\'' +
               ", formulaName='" + formulaName + '\'' +
               ", source='" + source + '\'' +
               ", type='" + type + '\'' +
               ", prescription='" + prescription + '\'' +
               ", remark='" + remark + '\'' +
               '}';
    }

}
