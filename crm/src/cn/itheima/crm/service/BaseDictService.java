/**   
* @Title: BaseDictService.java 
* @Package cn.itheima.crm.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午10:11:02 
* @version V1.0   
*/
package cn.itheima.crm.service;

import java.util.List;

import cn.itheima.crm.po.BaseDict;

/** 
 * @ClassName: BaseDictService 
 * @Description: 数据字典service接口 
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午10:11:02 
 *  
 */
public interface BaseDictService {
	
	// 根据类型编码，查询数据字典
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);

}
