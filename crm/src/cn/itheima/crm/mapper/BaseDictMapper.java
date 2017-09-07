/**   
* @Title: BaseDictMapper.java 
* @Package cn.itheima.crm.mapper 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午10:03:48 
* @version V1.0   
*/
package cn.itheima.crm.mapper;

import java.util.List;

import cn.itheima.crm.po.BaseDict;

/** 
 * @ClassName: BaseDictMapper 
 * @Description: 数据字典mapper接口 
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午10:03:48 
 *  
 */
public interface BaseDictMapper {
	
	// 根据类型编码，查询数据字典
	List<BaseDict> queryBaseDictByTypeCode(String typeCode);

}
