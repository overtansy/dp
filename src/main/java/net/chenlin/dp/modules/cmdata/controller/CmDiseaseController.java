package net.chenlin.dp.modules.cmdata.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.cmdata.entity.CmDiseaseEntity;
import net.chenlin.dp.modules.cmdata.service.CmDiseaseService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@RestController
@RequestMapping("/cmdata/disease")
public class CmDiseaseController extends AbstractController {
	
	@Autowired
	private CmDiseaseService cmDiseaseService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<CmDiseaseEntity> list(@RequestBody Map<String, Object> params) {
		return cmDiseaseService.listCmDisease(params);
	}
		
	/**
	 * 新增
	 * @param cmDisease
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody CmDiseaseEntity cmDisease) {
		return cmDiseaseService.saveCmDisease(cmDisease);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return cmDiseaseService.getCmDiseaseById(id);
	}
	
	/**
	 * 修改
	 * @param cmDisease
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody CmDiseaseEntity cmDisease) {
		return cmDiseaseService.updateCmDisease(cmDisease);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return cmDiseaseService.batchRemove(id);
	}
	
}
