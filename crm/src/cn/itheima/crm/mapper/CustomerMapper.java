/**   
* @Title: CustomerMapper.java 
* @Package cn.itheima.crm.mapper 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午10:42:44 
* @version V1.0   
*/
package cn.itheima.crm.mapper;

import java.util.List;

import cn.itheima.crm.po.Customer;
import cn.itheima.crm.po.QueryVo;

/** 
 * @ClassName: CustomerMapper 
 * @Description: 客户mapper接口 
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午10:42:44 
 *  
 */
public interface CustomerMapper {
	
	// 综合查询客户列表
	List<Customer> queryCustoerByCondition(QueryVo queryVo); 
	
	// 综合统计客户记录
	Integer countCustomerByCondition(QueryVo queryVo);
	
	// 根据客户Id查询客户信息
	Customer queryCustomerById(Long id);
	
	// 根据客户Id修改客户信息
	void updateCustomerById(Customer customer);
	
	// 根据客户I的删除客户信息
	void deleteCustomerById(Long id);

}
