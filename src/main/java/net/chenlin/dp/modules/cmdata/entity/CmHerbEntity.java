package net.chenlin.dp.modules.cmdata.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public class CmHerbEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private Integer herbId;
	
	/**
	 * 中文名
	 */
	private String chineseName;
	
	/**
	 * 拼音名
	 */
	private String pinyinName;
	
	/**
	 * 拉丁名
	 */
	private String latinName;
	
	/**
	 * 英文名
	 */
	private String englishName;
	
	/**
	 * 别名
	 */
	private String alias;
	
	/**
	 * 药用部位
	 */
	private String usepart;
	
	/**
	 * 来源
	 */
	private String source;
	
	/**
	 * 类型
	 */
	private String type;
	
	/**
	 * 功效
	 */
	private String function;
	
	/**
	 * 主治症状
	 */
	private String symptom;
	
	/**
	 * 主治病证
	 */
	private String syndrome;
	
	/**
	 * 性味
	 */
	private String properties;
	
	/**
	 * 归经
	 */
	private String meridians;
	
	/**
	 * 药理作用
	 */
	private String pharmacology;
	
	/**
	 * 毒性
	 */
	private String toxic;
	
	/**
	 * 用法
	 */
	private String useMethod;
	
	/**
	 * 用量
	 */
	private String useAmount;
	
	/**
	 * 
	 */
	private String tcmidId;
	
	/**
	 * 
	 */
	private String tcmIdId;
	
	/**
	 * 
	 */
	private String tcmspId;
	
	/**
	 * 
	 */
	private String linkHerbId;
	
	/**
	 * 
	 */
	private String herbdbId;
	
    /**
     * CmHerbEntity constructor
     */
	public CmHerbEntity() {
		super();
	}

    /**
     * setter for herbId
     * @param herbId
     */
	public void setHerbId(Integer herbId) {
		this.herbId = herbId;
	}

    /**
     * getter for herbId
     */
	public Integer getHerbId() {
		return herbId;
	}

    /**
     * setter for chineseName
     * @param chineseName
     */
	public void setChineseName(String chineseName) {
		this.chineseName = chineseName;
	}

    /**
     * getter for chineseName
     */
	public String getChineseName() {
		return chineseName;
	}

    /**
     * setter for pinyinName
     * @param pinyinName
     */
	public void setPinyinName(String pinyinName) {
		this.pinyinName = pinyinName;
	}

    /**
     * getter for pinyinName
     */
	public String getPinyinName() {
		return pinyinName;
	}

    /**
     * setter for latinName
     * @param latinName
     */
	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}

    /**
     * getter for latinName
     */
	public String getLatinName() {
		return latinName;
	}

    /**
     * setter for englishName
     * @param englishName
     */
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

    /**
     * getter for englishName
     */
	public String getEnglishName() {
		return englishName;
	}

    /**
     * setter for alias
     * @param alias
     */
	public void setAlias(String alias) {
		this.alias = alias;
	}

    /**
     * getter for alias
     */
	public String getAlias() {
		return alias;
	}

    /**
     * setter for usepart
     * @param usepart
     */
	public void setUsepart(String usepart) {
		this.usepart = usepart;
	}

    /**
     * getter for usepart
     */
	public String getUsepart() {
		return usepart;
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
     * setter for function
     * @param function
     */
	public void setFunction(String function) {
		this.function = function;
	}

    /**
     * getter for function
     */
	public String getFunction() {
		return function;
	}

    /**
     * setter for symptom
     * @param symptom
     */
	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

    /**
     * getter for symptom
     */
	public String getSymptom() {
		return symptom;
	}

    /**
     * setter for syndrome
     * @param syndrome
     */
	public void setSyndrome(String syndrome) {
		this.syndrome = syndrome;
	}

    /**
     * getter for syndrome
     */
	public String getSyndrome() {
		return syndrome;
	}

    /**
     * setter for properties
     * @param properties
     */
	public void setProperties(String properties) {
		this.properties = properties;
	}

    /**
     * getter for properties
     */
	public String getProperties() {
		return properties;
	}

    /**
     * setter for meridians
     * @param meridians
     */
	public void setMeridians(String meridians) {
		this.meridians = meridians;
	}

    /**
     * getter for meridians
     */
	public String getMeridians() {
		return meridians;
	}

    /**
     * setter for pharmacology
     * @param pharmacology
     */
	public void setPharmacology(String pharmacology) {
		this.pharmacology = pharmacology;
	}

    /**
     * getter for pharmacology
     */
	public String getPharmacology() {
		return pharmacology;
	}

    /**
     * setter for toxic
     * @param toxic
     */
	public void setToxic(String toxic) {
		this.toxic = toxic;
	}

    /**
     * getter for toxic
     */
	public String getToxic() {
		return toxic;
	}

    /**
     * setter for useMethod
     * @param useMethod
     */
	public void setUseMethod(String useMethod) {
		this.useMethod = useMethod;
	}

    /**
     * getter for useMethod
     */
	public String getUseMethod() {
		return useMethod;
	}

    /**
     * setter for useAmount
     * @param useAmount
     */
	public void setUseAmount(String useAmount) {
		this.useAmount = useAmount;
	}

    /**
     * getter for useAmount
     */
	public String getUseAmount() {
		return useAmount;
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
     * setter for linkHerbId
     * @param linkHerbId
     */
	public void setLinkHerbId(String linkHerbId) {
		this.linkHerbId = linkHerbId;
	}

    /**
     * getter for linkHerbId
     */
	public String getLinkHerbId() {
		return linkHerbId;
	}

    /**
     * setter for herbdbId
     * @param herbdbId
     */
	public void setHerbdbId(String herbdbId) {
		this.herbdbId = herbdbId;
	}

    /**
     * getter for herbdbId
     */
	public String getHerbdbId() {
		return herbdbId;
	}

    /**
     * CmHerbEntity.toString()
     */
    @Override
    public String toString() {
        return "CmHerbEntity{" +
               "herbId='" + herbId + '\'' +
               ", chineseName='" + chineseName + '\'' +
               ", pinyinName='" + pinyinName + '\'' +
               ", latinName='" + latinName + '\'' +
               ", englishName='" + englishName + '\'' +
               ", alias='" + alias + '\'' +
               ", usepart='" + usepart + '\'' +
               ", source='" + source + '\'' +
               ", type='" + type + '\'' +
               ", function='" + function + '\'' +
               ", symptom='" + symptom + '\'' +
               ", syndrome='" + syndrome + '\'' +
               ", properties='" + properties + '\'' +
               ", meridians='" + meridians + '\'' +
               ", pharmacology='" + pharmacology + '\'' +
               ", toxic='" + toxic + '\'' +
               ", useMethod='" + useMethod + '\'' +
               ", useAmount='" + useAmount + '\'' +
               ", tcmidId='" + tcmidId + '\'' +
               ", tcmIdId='" + tcmIdId + '\'' +
               ", tcmspId='" + tcmspId + '\'' +
               ", linkHerbId='" + linkHerbId + '\'' +
               ", herbdbId='" + herbdbId + '\'' +
               '}';
    }

}
