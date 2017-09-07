/**   
* @Title: ItemController.java 
* @Package cn.itheima.ssm.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-26 上午11:09:14 
* @version V1.0   
*/
package cn.itheima.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itheima.ssm.po.Item;
import cn.itheima.ssm.po.ItemVo;
import cn.itheima.ssm.service.ItemService;

/** 
 * @ClassName: ItemController 
 * @Description: 商品controller
 * @author 传智 小杨老师  
 * @date 2017-8-26 上午11:09:14 
 *  
 */
// @Controller注解：标记普通的java类，作为控制器
@Controller
public class ItemController {
	
	// 注入商品ItemService
	@Autowired
	private ItemService itemService;
	
	// action="${pageContext.request.contextPath }/queryItem.do
	// 增加商品pojo包装类型，接收请求的商品综合查询条件。pojo包装类型中的属性，与jsp页面的name属性一致
	@RequestMapping("/queryItem.do")
	public ModelAndView queryItem(ItemVo itemVo){
		
//		// get请求乱码解决============================start
//		if(itemVo != null && itemVo.getItem() != null){
//			// 1.获取请求的商品名称
//			String name = itemVo.getItem().getName();
//			
//			
//			try{
//				// 2.根据ISO-8859-1编码，获取商品名称的字节码
//				byte[] bytes = name.getBytes("ISO-8859-1");
//				
//				// 3.使用UTF-8编码重新编码商品名称
//				name = new String(bytes, "UTF-8");
//				
//				// 4.重新设置编码后的商品名称
//				itemVo.getItem().setName(name);
//			}catch(Exception e){
//				e.printStackTrace();
//			}
//			
//			
//			
//		}
		
		// get请求乱码解决============================start
		// 1.创建ModelAndView对象
		ModelAndView mav = new ModelAndView();
		
		// 2.设置响应的商品模型数据
		// 准备商品的静态数据
//		List<Item> itemList = new ArrayList<Item>();
//		for(int i=0;i<2;i++){
//			// 创建商品对象
//			Item item = new Item();
//			
////			商品Id
//			item.setId(i);
////			商品名称
//			item.setName("商品名称"+i);
////			商品价格
//			item.setPrice(10f);
////			商品生成日期
//			item.setCreatetime(new Date());
////			商品描述
//			item.setDetail("商品描述"+i);
//			
//			itemList.add(item);
//		}
		
		// 使用itemService查询数据库中的商品数据，替换静态商品数据
		List<Item> itemList = this.itemService.queryItemList();
		
		mav.addObject("itemList", itemList);
		
		// 3.设置响应的视图
		mav.setViewName("item/itemList");
		
		return mav;
		
	}
	
	// http://127.0.0.1:8080/ssm/queryItemById.do?id=1
	// 根据商品Id查询商品
	// request对象：方法形参中增加request对象，用于接收请求的商品Id，springmvc在执行的时候，会传递request对象
//	@RequestMapping("/queryItemById.do")
//	public ModelAndView queryItemById(HttpServletRequest request){
//		
//		// 1.获取请求的商品id
//		String id = request.getParameter("id");
//		
//		// 2.根据商品Id查询数据库
//		Item item = this.itemService.queryItemById(Integer.parseInt(id));
//		
//		// 3.创建ModelAndView对象
//		ModelAndView mav = new ModelAndView();
//		
//		// 4.设置响应的模型数据
//		mav.addObject("item", item);
//		
//		// 5.设置响应的视图
//		mav.setViewName("item/itemEdit");
//		
//		return mav;
//		
//	}
	
	// 使用Model设置响应的模型数据，使用字符串String返回响应的视图
//	@RequestMapping("/queryItemById.do")
//	public String queryItemById(Model model,HttpServletRequest request){
//		
//		// 1.获取请求的商品id
//		String id = request.getParameter("id");
//		
//		// 2.根据商品Id查询数据库
//		Item item = this.itemService.queryItemById(Integer.parseInt(id));
//		
//		// 3.使用model设置响应的模型数据
//		// addAttribute方法：设置响应的模型数据
//		// 参数一：模型的名称
//		// 参数二：模型数据
//		model.addAttribute("item", item);
//		
//		return "item/itemEdit";
//		
//	}
	
	// 使用简单类型Integer,接收请求的商品Id
	// 形参Id的名称，必须与请求的参数名称一致
	@RequestMapping("/queryItemById.do")
	public String queryItemById(Model model,Integer id){
		
		// 1.根据商品Id查询数据库
		Item item = this.itemService.queryItemById(id);
		
		// 2.使用model设置响应的模型数据
		// addAttribute方法：设置响应的模型数据
		// 参数一：模型的名称
		// 参数二：模型数据
		model.addAttribute("item", item);
		
		return "item/itemEdit";
		
	}
	
	
	// @RequetParam注解讲解专用
	// @RequestParam(value="itemId")，value属性：设置请求的参数名称
	// required属性：指定参数是否必须传递。true：表示必须传递，false:可以不传递。默认是true
	// defaultValue属性：指定参数的默认只。如果传递参数，使用实际传递的参数值；如果不传，使用默认值
//	@RequestMapping("/queryItemById.do")
//	public String queryItemById(Model model,@RequestParam(value="itemId",required=true,defaultValue="2") Integer id){
//		
//		// 1.根据商品Id查询数据库
//		Item item = this.itemService.queryItemById(id);
//		
//		// 2.使用model设置响应的模型数据
//		// addAttribute方法：设置响应的模型数据
//		// 参数一：模型的名称
//		// 参数二：模型数据
//		model.addAttribute("item", item);
//		
//		return "item/itemEdit";
//		
//	}
	
	// http://127.0.0.1:8080/ssm/updateItem.do
	// 修改商品数据，保存到数据库
	// 使用商品pojo接收请求的商品属性数据，pojo的属性与参数的名称一致
	@RequestMapping("/updateItem.do")
	public String updateItem(Item item){
		
		// 1.保存商品数据
		try{
			this.itemService.updateItem(item);
		}catch(Exception e){
			e.printStackTrace();
			// 如果修改发生异常，显示失败的提示页面
			return "common/failure";
		}
		
		// 修改成功，显示成功提示页面
		return "common/success";
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
