package com.wxmp.wxcms.domain;

import java.io.Serializable;

import lombok.Data;

import com.wxmp.core.page.Page;

@Data
public class WXTemplate extends Page implements Serializable{
	private String template_id;
	private String title;
	private String content;
	private String params;
	private String industry1;
	private String industry2;
	private String vdef1;
	private String vdef2;
	private String vdef3;
}
