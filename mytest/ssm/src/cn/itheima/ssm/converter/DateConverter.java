/**   
* @Title: DateConverter.java 
* @Package cn.itheima.ssm.converter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-26 下午2:58:05 
* @version V1.0   
*/
package cn.itheima.ssm.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/** 
 * @ClassName: DateConverter 
 * @Description: 自定义日期转换器 
 * @author 传智 小杨老师  
 * @date 2017-8-26 下午2:58:05 
 *  
 */
// Converter<S, T>
// S,SOUCE,源，要转换的数据，这里是字符串类型的商品生成日期
//T,TARGET,目标类型，转换之后的类型，这里是Date类型的商品生产日期
public class DateConverter implements Converter<String, Date> {

	/* (non-Javadoc)
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	@Override
	// 实现转换逻辑
	public Date convert(String arg0) {
		// TODO Auto-generated method stub
		// 1.定义转换格式
		// 2016-02-03 13:22:53
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			// 如果转换成功，直接返回
			return format.parse(arg0);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 如果转换异常，返回null
		return null;
	}

}
