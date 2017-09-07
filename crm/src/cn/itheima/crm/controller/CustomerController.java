/**   
* @Title: CustomerController.java 
* @Package cn.itheima.crm.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午9:48:56 
* @version V1.0   
*/
package cn.itheima.crm.controller;

//ID盛世嫡妃是劳动法老师京东方涉及到开封的房间打开看见了史蒂夫建设路口大姐夫发卡量时代峻//峰阿斯利康的坚实的发送机打发时间段的 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itheima.crm.po.BaseDict;
import cn.itheima.crm.po.Customer;
import cn.itheima.crm.po.QueryVo;
import cn.itheima.crm.service.BaseDictService;
import cn.itheima.crm.service.CustomerService;
import cn.itheima.crm.utils.Page;

/** 
 * @ClassName: CustomerController 
 * @Description: 客户controller 
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午9:48:56 
 *  
 */
@Controller
@RequestMapping("cust")
public class CustomerController {
	
	// 注入数据字典service
	@Autowired
	private BaseDictService baseDictService;
	
	// 注入客户service
	@Autowired
	private CustomerService customerService;
	
	// action="${pageContext.request.contextPath }/cust/list
	@RequestMapping("list")
	public String list(Model model,QueryVo queryVo){
		
		// 1.综合查询条件初始化
//		客户来源：fromType：002
		List<BaseDict> fromType = this.baseDictService.queryBaseDictByTypeCode("002");
//		客户所属行业：industryType：001
		List<BaseDict> industryType = this.baseDictService.queryBaseDictByTypeCode("001");		
//		客户级别：levelType：006
		List<BaseDict> levelType = this.baseDictService.queryBaseDictByTypeCode("006");	
		
		// 2.设置响应综合查询条件的模型数据
		model.addAttribute("fromType", fromType);
		model.addAttribute("industryType", industryType);
		model.addAttribute("levelType", levelType);
		
		// 3.查询客户列表
		Page<Customer> page = this.customerService.queryCustoerByCondition(queryVo);
		
		// 4.设置客户列表的模型数据
		model.addAttribute("page", page);
		
		// 5.综合查询条件回显
		model.addAttribute("custName", queryVo.getCustName());
		model.addAttribute("custSource", queryVo.getCustSource());
		model.addAttribute("custIndustry", queryVo.getCustIndustry());
		model.addAttribute("custLevel", queryVo.getCustLevel());
		
		
		return "customer";
		
	}
	
	// url:"<%=basePath%>cust/edit"
	// 根据客户Id查询客户信息
	@RequestMapping("edit")
	@ResponseBody
	public Customer edit(Long id){
		
		// 1.根据客户Id查询客户 
		Customer customer = this.customerService.queryCustomerById(id);
		
		return customer;
		
	}
	
	
	// $.post("<%=basePath%>cust/update",
	// 保存客户信息
	@RequestMapping("update")
	@ResponseBody
	public void update(Customer customer){
		
		// 1.保存客户信息
		this.customerService.updateCustomerById(customer);
		
	}
	
	// $.post("<%=basePath%>cust/delcust",
	// 删除客户信息
	@RequestMapping("delcust")
	@ResponseBody
	public void delcust(Long id){
		// 1.删除客户信息
		this.customerService.deleteCustomerById(id);
	}

}
