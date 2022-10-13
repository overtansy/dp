package net.chenlin.dp.modules.cmdata.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.cmdata.entity.CmDiseaseEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface CmDiseaseService {

    /**
     * 分页查询
     * @param params
     * @return
     */
	Page<CmDiseaseEntity> listCmDisease(Map<String, Object> params);

    /**
     * 新增
     * @param cmDisease
     * @return
     */
	R saveCmDisease(CmDiseaseEntity cmDisease);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	R getCmDiseaseById(Long id);

    /**
     * 修改
     * @param cmDisease
     * @return
     */
	R updateCmDisease(CmDiseaseEntity cmDisease);

    /**
     * 删除
     * @param id
     * @return
     */
	R batchRemove(Long[] id);
	
}
