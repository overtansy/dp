package net.chenlin.dp.modules.cmdata.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.cmdata.entity.CmTargetEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface CmTargetService {

    /**
     * 分页查询
     * @param params
     * @return
     */
	Page<CmTargetEntity> listCmTarget(Map<String, Object> params);

    /**
     * 新增
     * @param cmTarget
     * @return
     */
	R saveCmTarget(CmTargetEntity cmTarget);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	R getCmTargetById(Long id);

    /**
     * 修改
     * @param cmTarget
     * @return
     */
	R updateCmTarget(CmTargetEntity cmTarget);

    /**
     * 删除
     * @param id
     * @return
     */
	R batchRemove(Long[] id);
	
}
