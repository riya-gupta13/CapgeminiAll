package com.cpg.pixogramspring.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Details about the Content")
@Entity
public class Content {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "The unique Id of content")
	private int content_id;
	@ApiModelProperty(notes = "The caption for uploaded image/video")
	private String caption;
	@ApiModelProperty(notes = "The name of the image/video you uploaded")
	private String filename;
	@ApiModelProperty(notes = "The type(image/video) uploaded")
	private String filetype;
	@ApiModelProperty(notes = "The info of the user who is uploading ")
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uc_id", referencedColumnName="user_id")
	private User user;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Content() {

	}
	
	public Content(String caption, String filename, String filetype) {
		super();
		this.caption = caption;
		this.filename = filename;
		this.filetype = filetype;
	}


	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

//	public File getFile() {
//		return file;
//	}
//
//	public void setFile(File file) {
//		this.file = file;
//	}

	
	public int getContent_id() {
		return content_id;
	}


	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}


	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}


	public String getFiletype() {
		return filetype;
	}


	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}


	@Override
	public String toString() {
		return "Content [content_id=" + content_id + ", caption=" + caption + ", filename="
				+ filename + ", filetype=" + filetype + "]";
	}


}
