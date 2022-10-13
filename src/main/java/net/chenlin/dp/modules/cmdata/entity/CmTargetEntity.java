package net.chenlin.dp.modules.cmdata.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public class CmTargetEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 */
	private Integer geneId;
	
	/**
	 * 基因标识
	 */
	private String geneSymbol;
	
	/**
	 * 所在染色体
	 */
	private String chromsome;
	
	/**
	 * 基因名
	 */
	private String geneName;
	
	/**
	 * 蛋白名
	 */
	private String proteinName;
	
	/**
	 * hitId
	 */
	private String hitId;
	
	/**
	 * tcmspId
	 */
	private String tcmspId;
	
	/**
	 * ensemblId
	 */
	private String ensemblId;
	
	/**
	 * ncbiId
	 */
	private String ncbiId;
	
	/**
	 * hgncId
	 */
	private String hgncId;
	
	/**
	 * vegaId
	 */
	private String vegaId;
	
	/**
	 * genbankGeneId
	 */
	private String genbankGeneId;
	
	/**
	 * geneBankProteinId
	 */
	private String geneBankProteinId;
	
	/**
	 * uniprotId
	 */
	private String uniprotId;
	
	/**
	 * pdbId
	 */
	private String pdbId;
	
	/**
	 * mimId
	 */
	private String mimId;
	
	/**
	 * mirbaseId
	 */
	private String mirbaseId;
	
    /**
     * CmTargetEntity constructor
     */
	public CmTargetEntity() {
		super();
	}

    /**
     * setter for geneId
     * @param geneId
     */
	public void setGeneId(Integer geneId) {
		this.geneId = geneId;
	}

    /**
     * getter for geneId
     */
	public Integer getGeneId() {
		return geneId;
	}

    /**
     * setter for geneSymbol
     * @param geneSymbol
     */
	public void setGeneSymbol(String geneSymbol) {
		this.geneSymbol = geneSymbol;
	}

    /**
     * getter for geneSymbol
     */
	public String getGeneSymbol() {
		return geneSymbol;
	}

    /**
     * setter for chromsome
     * @param chromsome
     */
	public void setChromsome(String chromsome) {
		this.chromsome = chromsome;
	}

    /**
     * getter for chromsome
     */
	public String getChromsome() {
		return chromsome;
	}

    /**
     * setter for geneName
     * @param geneName
     */
	public void setGeneName(String geneName) {
		this.geneName = geneName;
	}

    /**
     * getter for geneName
     */
	public String getGeneName() {
		return geneName;
	}

    /**
     * setter for proteinName
     * @param proteinName
     */
	public void setProteinName(String proteinName) {
		this.proteinName = proteinName;
	}

    /**
     * getter for proteinName
     */
	public String getProteinName() {
		return proteinName;
	}

    /**
     * setter for hitId
     * @param hitId
     */
	public void setHitId(String hitId) {
		this.hitId = hitId;
	}

    /**
     * getter for hitId
     */
	public String getHitId() {
		return hitId;
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
     * setter for ensemblId
     * @param ensemblId
     */
	public void setEnsemblId(String ensemblId) {
		this.ensemblId = ensemblId;
	}

    /**
     * getter for ensemblId
     */
	public String getEnsemblId() {
		return ensemblId;
	}

    /**
     * setter for ncbiId
     * @param ncbiId
     */
	public void setNcbiId(String ncbiId) {
		this.ncbiId = ncbiId;
	}

    /**
     * getter for ncbiId
     */
	public String getNcbiId() {
		return ncbiId;
	}

    /**
     * setter for hgncId
     * @param hgncId
     */
	public void setHgncId(String hgncId) {
		this.hgncId = hgncId;
	}

    /**
     * getter for hgncId
     */
	public String getHgncId() {
		return hgncId;
	}

    /**
     * setter for vegaId
     * @param vegaId
     */
	public void setVegaId(String vegaId) {
		this.vegaId = vegaId;
	}

    /**
     * getter for vegaId
     */
	public String getVegaId() {
		return vegaId;
	}

    /**
     * setter for genbankGeneId
     * @param genbankGeneId
     */
	public void setGenbankGeneId(String genbankGeneId) {
		this.genbankGeneId = genbankGeneId;
	}

    /**
     * getter for genbankGeneId
     */
	public String getGenbankGeneId() {
		return genbankGeneId;
	}

    /**
     * setter for geneBankProteinId
     * @param geneBankProteinId
     */
	public void setGeneBankProteinId(String geneBankProteinId) {
		this.geneBankProteinId = geneBankProteinId;
	}

    /**
     * getter for geneBankProteinId
     */
	public String getGeneBankProteinId() {
		return geneBankProteinId;
	}

    /**
     * setter for uniprotId
     * @param uniprotId
     */
	public void setUniprotId(String uniprotId) {
		this.uniprotId = uniprotId;
	}

    /**
     * getter for uniprotId
     */
	public String getUniprotId() {
		return uniprotId;
	}

    /**
     * setter for pdbId
     * @param pdbId
     */
	public void setPdbId(String pdbId) {
		this.pdbId = pdbId;
	}

    /**
     * getter for pdbId
     */
	public String getPdbId() {
		return pdbId;
	}

    /**
     * setter for mimId
     * @param mimId
     */
	public void setMimId(String mimId) {
		this.mimId = mimId;
	}

    /**
     * getter for mimId
     */
	public String getMimId() {
		return mimId;
	}

    /**
     * setter for mirbaseId
     * @param mirbaseId
     */
	public void setMirbaseId(String mirbaseId) {
		this.mirbaseId = mirbaseId;
	}

    /**
     * getter for mirbaseId
     */
	public String getMirbaseId() {
		return mirbaseId;
	}

    /**
     * CmTargetEntity.toString()
     */
    @Override
    public String toString() {
        return "CmTargetEntity{" +
               "geneId='" + geneId + '\'' +
               ", geneSymbol='" + geneSymbol + '\'' +
               ", chromsome='" + chromsome + '\'' +
               ", geneName='" + geneName + '\'' +
               ", proteinName='" + proteinName + '\'' +
               ", hitId='" + hitId + '\'' +
               ", tcmspId='" + tcmspId + '\'' +
               ", ensemblId='" + ensemblId + '\'' +
               ", ncbiId='" + ncbiId + '\'' +
               ", hgncId='" + hgncId + '\'' +
               ", vegaId='" + vegaId + '\'' +
               ", genbankGeneId='" + genbankGeneId + '\'' +
               ", geneBankProteinId='" + geneBankProteinId + '\'' +
               ", uniprotId='" + uniprotId + '\'' +
               ", pdbId='" + pdbId + '\'' +
               ", mimId='" + mimId + '\'' +
               ", mirbaseId='" + mirbaseId + '\'' +
               '}';
    }

}
