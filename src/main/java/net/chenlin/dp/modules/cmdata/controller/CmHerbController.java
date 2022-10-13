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
import net.chenlin.dp.modules.cmdata.entity.CmHerbEntity;
import net.chenlin.dp.modules.cmdata.service.CmHerbService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@RestController
@RequestMapping("/cmdata/herb")
public class CmHerbController extends AbstractController {
	
	@Autowired
	private CmHerbService cmHerbService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<CmHerbEntity> list(@RequestBody Map<String, Object> params) {
		return cmHerbService.listCmHerb(params);
	}
		
	/**
	 * 新增
	 * @param cmHerb
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody CmHerbEntity cmHerb) {
		return cmHerbService.saveCmHerb(cmHerb);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return cmHerbService.getCmHerbById(id);
	}
	
	/**
	 * 修改
	 * @param cmHerb
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody CmHerbEntity cmHerb) {
		return cmHerbService.updateCmHerb(cmHerb);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return cmHerbService.batchRemove(id);
	}
	
}
