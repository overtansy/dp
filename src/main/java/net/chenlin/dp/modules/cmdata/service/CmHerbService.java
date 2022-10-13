package net.chenlin.dp.modules.cmdata.service;

import java.util.Map;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.cmdata.entity.CmHerbEntity;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
public interface CmHerbService {

    /**
     * 分页查询
     * @param params
     * @return
     */
	Page<CmHerbEntity> listCmHerb(Map<String, Object> params);

    /**
     * 新增
     * @param cmHerb
     * @return
     */
	R saveCmHerb(CmHerbEntity cmHerb);

    /**
     * 根据id查询
     * @param id
     * @return
     */
	R getCmHerbById(Long id);

    /**
     * 修改
     * @param cmHerb
     * @return
     */
	R updateCmHerb(CmHerbEntity cmHerb);

    /**
     * 删除
     * @param id
     * @return
     */
	R batchRemove(Long[] id);
	
}
