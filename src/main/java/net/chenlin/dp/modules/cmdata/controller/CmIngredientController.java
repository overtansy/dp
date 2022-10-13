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
import net.chenlin.dp.modules.cmdata.entity.CmIngredientEntity;
import net.chenlin.dp.modules.cmdata.service.CmIngredientService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@RestController
@RequestMapping("/cmdata/ingredient")
public class CmIngredientController extends AbstractController {
	
	@Autowired
	private CmIngredientService cmIngredientService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<CmIngredientEntity> list(@RequestBody Map<String, Object> params) {
		return cmIngredientService.listCmIngredient(params);
	}
		
	/**
	 * 新增
	 * @param cmIngredient
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody CmIngredientEntity cmIngredient) {
		return cmIngredientService.saveCmIngredient(cmIngredient);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return cmIngredientService.getCmIngredientById(id);
	}
	
	/**
	 * 修改
	 * @param cmIngredient
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody CmIngredientEntity cmIngredient) {
		return cmIngredientService.updateCmIngredient(cmIngredient);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return cmIngredientService.batchRemove(id);
	}
	
}
