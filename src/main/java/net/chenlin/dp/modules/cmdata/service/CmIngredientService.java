package net.chenlin.dp.modules.cmdata.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.cmdata.entity.CmIngredientEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface CmIngredientService {

    /**
     * 分页查询
     * @param params
     * @return
     */
	Page<CmIngredientEntity> listCmIngredient(Map<String, Object> params);

    /**
     * 新增
     * @param cmIngredient
     * @return
     */
	R saveCmIngredient(CmIngredientEntity cmIngredient);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	R getCmIngredientById(Long id);

    /**
     * 修改
     * @param cmIngredient
     * @return
     */
	R updateCmIngredient(CmIngredientEntity cmIngredient);

    /**
     * 删除
     * @param id
     * @return
     */
	R batchRemove(Long[] id);
	
}
