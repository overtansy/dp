package net.chenlin.dp.modules.cmdata.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.cmdata.entity.CmHerbEntity;
import net.chenlin.dp.modules.cmdata.dao.CmHerbMapper;
import net.chenlin.dp.modules.cmdata.service.CmHerbService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Service("cmHerbService")
public class CmHerbServiceImpl implements CmHerbService {

	@Autowired
    private CmHerbMapper cmHerbMapper;

    /**
     * 分页查询
     * @param params
     * @return
     */
	@Override
	public Page<CmHerbEntity> listCmHerb(Map<String, Object> params) {
		Query query = new Query(params);
		Page<CmHerbEntity> page = new Page<>(query);
		cmHerbMapper.listForPage(page, query);
		return page;
	}

    /**
     * 新增
     * @param cmHerb
     * @return
     */
	@Override
	public R saveCmHerb(CmHerbEntity cmHerb) {
		int count = cmHerbMapper.save(cmHerb);
		return CommonUtils.msg(count);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public R getCmHerbById(Long id) {
		CmHerbEntity cmHerb = cmHerbMapper.getObjectById(id);
		return CommonUtils.msg(cmHerb);
	}

    /**
     * 修改
     * @param cmHerb
     * @return
     */
	@Override
	public R updateCmHerb(CmHerbEntity cmHerb) {
		int count = cmHerbMapper.update(cmHerb);
		return CommonUtils.msg(count);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public R batchRemove(Long[] id) {
		int count = cmHerbMapper.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
