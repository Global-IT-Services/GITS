package kh.com.gits.model;

import java.sql.Date;

public class ArticleModel {

	private Integer id;
	private String title;
	private String content;
	private CategoryModel category;
	private UserModel user;
	private Date createdDate;
	private String status;
	
	public ArticleModel(){
				
	}
	
	public ArticleModel(Integer id, String title, String content,
			CategoryModel category, UserModel user, Date create, String status) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.category = category;
		this.user = user;
		this.createdDate = create;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public CategoryModel getCategory() {
		return category;
	}
	public void setCategory(CategoryModel category) {
		this.category = category;
	}
	public UserModel getUser() {
		return user;
	}
	public void setUser(UserModel user) {
		this.user = user;
	}
	public Date getCreate() {
		return createdDate;
	}
	public void setCreate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}	
}
