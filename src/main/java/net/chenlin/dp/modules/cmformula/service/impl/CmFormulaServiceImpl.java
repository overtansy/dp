package net.chenlin.dp.modules.cmformula.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.cmformula.entity.CmFormulaEntity;
import net.chenlin.dp.modules.cmformula.dao.CmFormulaMapper;
import net.chenlin.dp.modules.cmformula.service.CmFormulaService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Service("cmFormulaService")
public class CmFormulaServiceImpl implements CmFormulaService {

	@Autowired
    private CmFormulaMapper cmFormulaMapper;

    /**
     * 分页查询
     * @param params
     * @return
     */
	@Override
	public Page<CmFormulaEntity> listCmFormula(Map<String, Object> params) {
		Query query = new Query(params);
		Page<CmFormulaEntity> page = new Page<>(query);
		cmFormulaMapper.listForPage(page, query);
		return page;
	}

    /**
     * 新增
     * @param cmFormula
     * @return
     */
	@Override
	public R saveCmFormula(CmFormulaEntity cmFormula) {
		int count = cmFormulaMapper.save(cmFormula);
		return CommonUtils.msg(count);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public R getCmFormulaById(Long id) {
		CmFormulaEntity cmFormula = cmFormulaMapper.getObjectById(id);
		return CommonUtils.msg(cmFormula);
	}

    /**
     * 修改
     * @param cmFormula
     * @return
     */
	@Override
	public R updateCmFormula(CmFormulaEntity cmFormula) {
		int count = cmFormulaMapper.update(cmFormula);
		return CommonUtils.msg(count);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public R batchRemove(Long[] id) {
		int count = cmFormulaMapper.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
