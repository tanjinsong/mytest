/**   
* @Title: BaseDictServiceImpl.java 
* @Package cn.itheima.crm.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午10:11:50 
* @version V1.0   
*/
package cn.itheima.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itheima.crm.mapper.BaseDictMapper;
import cn.itheima.crm.po.BaseDict;
import cn.itheima.crm.service.BaseDictService;

/** 
 * @ClassName: BaseDictServiceImpl 
 * @Description: 数据字典service实现 
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午10:11:50 
 *  
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {
	
	// 注入数据字典mapper
	@Autowired
	private BaseDictMapper baseDictMapper;

	/* (non-Javadoc)
	 * @see cn.itheima.crm.service.BaseDictService#queryBaseDictByTypeCode(java.lang.String)
	 */
	@Override
	public List<BaseDict> queryBaseDictByTypeCode(String typeCode) {
		// TODO Auto-generated method stub
		List<BaseDict> list = baseDictMapper.queryBaseDictByTypeCode(typeCode);
		
		return list;
	}

}
