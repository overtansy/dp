package net.chenlin.dp.modules.cmformula.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.cmformula.entity.CmFormulaEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface CmFormulaService {

    /**
     * 分页查询
     * @param params
     * @return
     */
	Page<CmFormulaEntity> listCmFormula(Map<String, Object> params);

    /**
     * 新增
     * @param cmFormula
     * @return
     */
	R saveCmFormula(CmFormulaEntity cmFormula);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	R getCmFormulaById(Long id);

    /**
     * 修改
     * @param cmFormula
     * @return
     */
	R updateCmFormula(CmFormulaEntity cmFormula);

    /**
     * 删除
     * @param id
     * @return
     */
	R batchRemove(Long[] id);
	
}
