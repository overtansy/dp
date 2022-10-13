package net.chenlin.dp.modules.cmdata.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.Query;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.common.utils.CommonUtils;
import net.chenlin.dp.modules.cmdata.entity.CmDiseaseEntity;
import net.chenlin.dp.modules.cmdata.dao.CmDiseaseMapper;
import net.chenlin.dp.modules.cmdata.service.CmDiseaseService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@Service("cmDiseaseService")
public class CmDiseaseServiceImpl implements CmDiseaseService {

	@Autowired
    private CmDiseaseMapper cmDiseaseMapper;

    /**
     * 分页查询
     * @param params
     * @return
     */
	@Override
	public Page<CmDiseaseEntity> listCmDisease(Map<String, Object> params) {
		Query query = new Query(params);
		Page<CmDiseaseEntity> page = new Page<>(query);
		cmDiseaseMapper.listForPage(page, query);
		return page;
	}

    /**
     * 新增
     * @param cmDisease
     * @return
     */
	@Override
	public R saveCmDisease(CmDiseaseEntity cmDisease) {
		int count = cmDiseaseMapper.save(cmDisease);
		return CommonUtils.msg(count);
	}

    /**
     * 根据id查询
     * @param id
     * @return
     */
	@Override
	public R getCmDiseaseById(Long id) {
		CmDiseaseEntity cmDisease = cmDiseaseMapper.getObjectById(id);
		return CommonUtils.msg(cmDisease);
	}

    /**
     * 修改
     * @param cmDisease
     * @return
     */
	@Override
	public R updateCmDisease(CmDiseaseEntity cmDisease) {
		int count = cmDiseaseMapper.update(cmDisease);
		return CommonUtils.msg(count);
	}

    /**
     * 删除
     * @param id
     * @return
     */
	@Override
	public R batchRemove(Long[] id) {
		int count = cmDiseaseMapper.batchRemove(id);
		return CommonUtils.msg(id, count);
	}

}
