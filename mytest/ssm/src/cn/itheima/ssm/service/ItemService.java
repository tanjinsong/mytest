/**   
* @Title: ItemService.java 
* @Package cn.itheima.ssm.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-26 上午11:18:41 
* @version V1.0   
*/
package cn.itheima.ssm.service;

import java.util.List;

import cn.itheima.ssm.po.Item;

/** 
 * @ClassName: ItemService 
 * @Description: 商品service接口 
 * @author 传智 小杨老师  
 * @date 2017-8-26 上午11:18:41 
 *  
 */
public interface ItemService {
	
	// 查询全部商品列表
	List<Item> queryItemList();
	
	// 根据商品Id查询商品
	Item queryItemById(Integer id);
	
	// 修改商品数据，保存数据库
	void updateItem(Item item);

}
