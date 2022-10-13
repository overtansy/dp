package net.chenlin.dp.modules.cmdata.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.cmdata.entity.CmTargetEntity;
import net.chenlin.dp.modules.cmdata.dao.CmTargetMapper;
import net.chenlin.dp.modules.cmdata.service.CmTargetService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Service("cmTargetService")
public class CmTargetServiceImpl implements CmTargetService {

	@Autowired
    private CmTargetMapper cmTargetMapper;

    /**
     * 分页查询
     * @param params
     * @return
     */
	@Override
	public Page<CmTargetEntity> listCmTarget(Map<String, Object> params) {
		Query query = new Query(params);
		Page<CmTargetEntity> page = new Page<>(query);
		cmTargetMapper.listForPage(page, query);
		return page;
	}

    /**
     * 新增
     * @param cmTarget
     * @return
     */
	@Override
	public R saveCmTarget(CmTargetEntity cmTarget) {
		int count = cmTargetMapper.save(cmTarget);
		return CommonUtils.msg(count);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public R getCmTargetById(Long id) {
		CmTargetEntity cmTarget = cmTargetMapper.getObjectById(id);
		return CommonUtils.msg(cmTarget);
	}

    /**
     * 修改
     * @param cmTarget
     * @return
     */
	@Override
	public R updateCmTarget(CmTargetEntity cmTarget) {
		int count = cmTargetMapper.update(cmTarget);
		return CommonUtils.msg(count);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public R batchRemove(Long[] id) {
		int count = cmTargetMapper.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
