/**   
* @Title: CustomerServiceImpl.java 
* @Package cn.itheima.crm.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午11:03:51 
* @version V1.0   
*/
package cn.itheima.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itheima.crm.mapper.CustomerMapper;
import cn.itheima.crm.po.Customer;
import cn.itheima.crm.po.QueryVo;
import cn.itheima.crm.service.CustomerService;
import cn.itheima.crm.utils.Page;

/** 
 * @ClassName: CustomerServiceImpl 
 * @Description: 客户servie接口实现 
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午11:03:51 
 *  
 */
@Service
public class CustomerServiceImpl implements CustomerService {
	
	// 注入客户mapper接口
	@Autowired
	private CustomerMapper customerMapper;

	/* (non-Javadoc)
	 * @see cn.itheima.crm.service.CustomerService#queryCustoerByCondition(cn.itheima.crm.po.QueryVo)
	 */
	@Override
	public Page<Customer> queryCustoerByCondition(QueryVo queryVo) {
		// TODO Auto-generated method stub
		// 1.计算分页记录起始数
		// 第一页：0，第二页：10，第三页：20......
		int start = (queryVo.getPage()-1)*queryVo.getRows();
		queryVo.setStart(start);
		
		// 2.查询客户列表
		List<Customer> list = this.customerMapper.queryCustoerByCondition(queryVo);
		
		// 3.统计客户记录数
		Integer totals = this.customerMapper.countCustomerByCondition(queryVo);
		
		
		// 4.创建分页对象
		// public Page(int total, int page, int size, List<T> rows) {
		Page<Customer> page = new Page<Customer>(totals,queryVo.getPage(),queryVo.getRows(),list);
		
		return page;
	}

	/* (non-Javadoc)
	 * @see cn.itheima.crm.service.CustomerService#queryCustomerById(java.lang.Long)
	 */
	@Override
	public Customer queryCustomerById(Long id) {
		// TODO Auto-generated method stub
		Customer customer = this.customerMapper.queryCustomerById(id);
		return customer;
	}

	/* (non-Javadoc)
	 * @see cn.itheima.crm.service.CustomerService#updateCustomerById(cn.itheima.crm.po.Customer)
	 */
	@Override
	public void updateCustomerById(Customer customer) {
		// TODO Auto-generated method stub
		this.customerMapper.updateCustomerById(customer);
		
	}

	/* (non-Javadoc)
	 * @see cn.itheima.crm.service.CustomerService#deleteCustomerById(java.lang.Long)
	 */
	@Override
	public void deleteCustomerById(Long id) {
		// TODO Auto-generated method stub
		this.customerMapper.deleteCustomerById(id);
		
	}

}
