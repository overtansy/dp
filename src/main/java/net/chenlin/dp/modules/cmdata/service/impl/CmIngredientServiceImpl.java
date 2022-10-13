package net.chenlin.dp.modules.cmdata.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.cmdata.entity.CmIngredientEntity;
import net.chenlin.dp.modules.cmdata.dao.CmIngredientMapper;
import net.chenlin.dp.modules.cmdata.service.CmIngredientService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Service("cmIngredientService")
public class CmIngredientServiceImpl implements CmIngredientService {

	@Autowired
    private CmIngredientMapper cmIngredientMapper;

    /**
     * 分页查询
     * @param params
     * @return
     */
	@Override
	public Page<CmIngredientEntity> listCmIngredient(Map<String, Object> params) {
		Query query = new Query(params);
		Page<CmIngredientEntity> page = new Page<>(query);
		cmIngredientMapper.listForPage(page, query);
		return page;
	}

    /**
     * 新增
     * @param cmIngredient
     * @return
     */
	@Override
	public R saveCmIngredient(CmIngredientEntity cmIngredient) {
		int count = cmIngredientMapper.save(cmIngredient);
		return CommonUtils.msg(count);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public R getCmIngredientById(Long id) {
		CmIngredientEntity cmIngredient = cmIngredientMapper.getObjectById(id);
		return CommonUtils.msg(cmIngredient);
	}

    /**
     * 修改
     * @param cmIngredient
     * @return
     */
	@Override
	public R updateCmIngredient(CmIngredientEntity cmIngredient) {
		int count = cmIngredientMapper.update(cmIngredient);
		return CommonUtils.msg(count);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public R batchRemove(Long[] id) {
		int count = cmIngredientMapper.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
