/**   
* @Title: CustomerService.java 
* @Package cn.itheima.crm.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午11:02:36 
* @version V1.0   
*/
package cn.itheima.crm.service;

import cn.itheima.crm.po.Customer;
import cn.itheima.crm.po.QueryVo;
import cn.itheima.crm.utils.Page;

/** 
 * @ClassName: CustomerService 
 * @Description: 客户service接口
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午11:02:36 
 *  
 */
public interface CustomerService {
	
	// 分页查询客户信息
	Page<Customer> queryCustoerByCondition(QueryVo queryVo);
	
	
	//  根据客户Id查询客户信息
	Customer queryCustomerById(Long id);
	
	//  根据客户Id修改客户信息
	void updateCustomerById(Customer customer);
	
	// 根据客户I的删除客户信息
	void deleteCustomerById(Long id);

}
