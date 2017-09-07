/**   
* @Title: ItemServiceImpl.java 
* @Package cn.itheima.ssm.service.impl 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-26 上午11:20:04 
* @version V1.0   
*/
package cn.itheima.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itheima.ssm.mapper.ItemMapper;
import cn.itheima.ssm.po.Item;
import cn.itheima.ssm.service.ItemService;

/** 
 * @ClassName: ItemServiceImpl 
 * @Description: 商品service接口实现 
 * @author 传智 小杨老师  
 * @date 2017-8-26 上午11:20:04 
 *  
 */
@Service
public class ItemServiceImpl implements ItemService {
	
	// 注入商品mapper
	@Autowired
	private ItemMapper itemMapper;

	/* (non-Javadoc)
	 * @see cn.itheima.ssm.service.ItemService#queryItemList()
	 */
	@Override
	public List<Item> queryItemList() {
		// TODO Auto-generated method stub
		List<Item> list = itemMapper.selectByExample(null);
		return list;
	}

	/* (non-Javadoc)
	 * @see cn.itheima.ssm.service.ItemService#queryItemById(java.lang.Integer)
	 */
	@Override
	public Item queryItemById(Integer id) {
		// TODO Auto-generated method stub
		Item item = this.itemMapper.selectByPrimaryKey(id);
		return item;
	}

	/* (non-Javadoc)
	 * @see cn.itheima.ssm.service.ItemService#updateItem(cn.itheima.ssm.po.Item)
	 */
	@Override
	public void updateItem(Item item) {
		// TODO Auto-generated method stub
		this.itemMapper.updateByPrimaryKeySelective(item);
		
	}

}
