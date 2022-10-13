package net.chenlin.dp.modules.cmformula.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chenlin.dp.common.annotation.SysLog;
import net.chenlin.dp.modules.sys.controller.AbstractController;
import net.chenlin.dp.common.entity.Page;
import net.chenlin.dp.common.entity.R;
import net.chenlin.dp.modules.cmformula.entity.CmFormulaEntity;
import net.chenlin.dp.modules.cmformula.service.CmFormulaService;

/**
 * 
 * @author ZhouChenglin<yczclcn@163.com>
 */
@RestController
@RequestMapping("/cmformula/formula")
public class CmFormulaController extends AbstractController {
	
	@Autowired
	private CmFormulaService cmFormulaService;
	
	/**
	 * 列表
	 * @param params
	 * @return
	 */
	@RequestMapping("/list")
	public Page<CmFormulaEntity> list(@RequestBody Map<String, Object> params) {
		return cmFormulaService.listCmFormula(params);
	}
		
	/**
	 * 新增
	 * @param cmFormula
	 * @return
	 */
	@SysLog("新增")
	@RequestMapping("/save")
	public R save(@RequestBody CmFormulaEntity cmFormula) {
		return cmFormulaService.saveCmFormula(cmFormula);
	}
	
	/**
	 * 根据id查询详情
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getById(@RequestBody Long id) {
		return cmFormulaService.getCmFormulaById(id);
	}
	
	/**
	 * 修改
	 * @param cmFormula
	 * @return
	 */
	@SysLog("修改")
	@RequestMapping("/update")
	public R update(@RequestBody CmFormulaEntity cmFormula) {
		return cmFormulaService.updateCmFormula(cmFormula);
	}
	
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@SysLog("删除")
	@RequestMapping("/remove")
	public R batchRemove(@RequestBody Long[] id) {
		return cmFormulaService.batchRemove(id);
	}
	
}
