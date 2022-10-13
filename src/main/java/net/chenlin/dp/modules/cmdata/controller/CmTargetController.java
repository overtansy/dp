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
import net.chenlin.dp.modules.cmdata.entity.CmTargetEntity;
import net.chenlin.dp.modules.cmdata.service.CmTargetService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@RestController
@RequestMapping("/cmdata/target")
public class CmTargetController extends AbstractController {
	
	@Autowired
	private CmTargetService cmTargetService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<CmTargetEntity> list(@RequestBody Map<String, Object> params) {
		return cmTargetService.listCmTarget(params);
	}
		
	/**
	 * 新增
	 * @param cmTarget
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody CmTargetEntity cmTarget) {
		return cmTargetService.saveCmTarget(cmTarget);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return cmTargetService.getCmTargetById(id);
	}
	
	/**
	 * 修改
	 * @param cmTarget
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody CmTargetEntity cmTarget) {
		return cmTargetService.updateCmTarget(cmTarget);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return cmTargetService.batchRemove(id);
	}
	
}
