package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class Login extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//连接界面文件
		this.setContentView(R.layout.login);
	}
	
	public void show(View v)
	{
		//利用意图进行页面跳转
		Intent it=new Intent("com.zse.login");
		this.startActivity(it);
	}

}
