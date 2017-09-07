/**   
* @Title: QueryVo.java 
* @Package cn.itheima.crm.po 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 传智 小杨老师 
* @date 2017-8-28 上午10:35:15 
* @version V1.0   
*/

//地神佑复生
package cn.itheima.crm.po;

/** 
 * @ClassName: QueryVo 
 * @Description: 综合查询条件pojo
 * @author 传智 小杨老师  
 * @date 2017-8-28 上午10:35:15 
 *  
 */
public class QueryVo {
	
//	客户名称
	private String custName;
//	客户来源
	private String custSource;
//	客户所属行业
	private String custIndustry;
//	客户级别
	private String custLevel;
	
	// 增加分页的属性：当前页，每一页显示的条数，记录起始数
	private Integer page = 1;//默认是第一页
	private Integer rows = 10;//默认每一页显示10条
	private Integer start;
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the custSource
	 */
	public String getCustSource() {
		return custSource;
	}
	/**
	 * @param custSource the custSource to set
	 */
	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}
	/**
	 * @return the custIndustry
	 */
	public String getCustIndustry() {
		return custIndustry;
	}
	/**
	 * @param custIndustry the custIndustry to set
	 */
	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}
	/**
	 * @return the custLevel
	 */
	public String getCustLevel() {
		return custLevel;
	}
	/**
	 * @param custLevel the custLevel to set
	 */
	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}
	/**
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(Integer page) {
		this.page = page;
	}
	/**
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}
	/**
	 * @param rows the rows to set
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}
	/**
	 * @return the start
	 */
	public Integer getStart() {
		return start;
	}
	/**
	 * @param start the start to set
	 */
	public void setStart(Integer start) {
		this.start = start;
	}
	
	

}
